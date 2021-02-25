package socket_programming.quiz;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.Socket;

public class ReadThread extends Thread {

	Socket s;
	public ReadThread(Socket s) {
		this.s = s;
		start();
	}
	
	public void run() {
		while(true) {
			try {
				InputStream in = s.getInputStream();
				DataInputStream dis = new DataInputStream(in);
				String readData = dis.readUTF();
				System.out.println("수신 데이터 : "+readData);
			}catch(Exception e) {
				e.printStackTrace();
			}
			
			
		}
	}
	
}
