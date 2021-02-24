package socket_programming.thread;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.Socket;

public class Mythread extends Thread {

	Socket clt_s;
	public Mythread(Socket clt_s) {
		this.clt_s = clt_s;
		System.out.println(clt_s.getInetAddress() + "님이 접속 했습니다.");
		start();
	}
	
	@Override
	public void run() {
		
		while(true) {
		try {
			InputStream in = clt_s.getInputStream();
			DataInputStream dis = new DataInputStream(in);
			String data = dis.readUTF();
			System.out.println("수신 메세지 : "+data);
		}catch(Exception e) {
			e.printStackTrace();
		}
			
		}
		
	}
	

}
