package socket_programming.quiz;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteThread extends Thread {
	//static 변수의 경우 위치상 클레스 내부에 있지만 인스턴스가 생성되기 전에 이미 선언 되어있다.
	public static List<Socket> socketList = new ArrayList<Socket>();
	
	Socket s;
	
	public ReadWriteThread(Socket s) {
		this.s = s;
		start();//start메서드가 호출 되어야 run메서드가 호출이 된다. 따라서, 생성자 내부에 start를 넣어둠으로써 인스턴스의 생성과 동시에 start메서드가 호출된다.
	}
	//각자의 쓰레드에서 서버로 송신되는 클라이언트의 메세지를 static변수에 저장되어있는 Socket타입의 참조변수들에 모두 송신해준다.
	@Override
	public void run() {
		while(true) {
			try {
				InputStream in = s.getInputStream();
				DataInputStream dis = new DataInputStream(in);
				String inputData = dis.readUTF();
				
				for(int i=0; i<socketList.size();i++) {
					OutputStream out = socketList.get(i).getOutputStream();
					DataOutputStream dos = new DataOutputStream(out);
					dos.writeUTF(inputData);
				}
				
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	
	}
	
}
