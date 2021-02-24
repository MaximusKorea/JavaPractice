package socket_programming.practice;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) throws Exception {
		
		//서버로가 랜덤 넘버를 생성하고 클라이언트가 그것을 맞추는 프로그램 연습
		ServerSocket server = new ServerSocket(12345);
		Socket clt_s = server.accept();
		// 클라이언트로부터 input
		InputStream in = clt_s.getInputStream();
		DataInputStream dis = new DataInputStream(in);
		// 클라이언트로부터 output
		OutputStream out = clt_s.getOutputStream();
		DataOutputStream dos = new DataOutputStream(out);
		
		int randNum = (int)(Math.random()*100+1);
		System.out.println("random 값은 " + randNum);
		while(true) {
			
			int readData = dis.read();
			
			if(readData > randNum) {
				
				int key = 1;//up
				dos.write(key);
				dos.flush();
				continue;
			}else if(readData < randNum) {
				int key = 2;//down
				dos.write(key);
				dos.flush();
				continue;
			}else {
				int key = 3;//게임끝
				dos.write(key);
				dos.flush();
				break;
			}
			
		}
		
		dos.close();out.close();
		dis.close();in.close();clt_s.close();server.close();
		
	}

}
