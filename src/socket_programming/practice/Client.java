package socket_programming.practice;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		Socket s = new Socket("localhost",12345);
		//OutputStream 연결 요청 및 데이터 송신
		OutputStream out = s.getOutputStream();
		DataOutputStream dos = new DataOutputStream(out);
		//InputStream 서버로부터 데이터 받음
		InputStream in = s.getInputStream();
		DataInputStream dis = new DataInputStream(in);
		System.out.println("게임이 시작됩니다.");
		int num = 0;
		
		while(true) {
			System.out.print("숫자를 입력해주세요 :  ");
			num = sc.nextInt();
			dos.write(num);
			dos.flush();
			int key = dis.read();
			
			if(key == 2) {
				System.out.println("UP");
				continue;
			}else if(key == 1) {
				System.out.println("DOWN");
				continue;
			}else {
				System.out.println("정답");
				break;
			}
			
		}
		
		dis.close();in.close();
		dos.close();out.close();s.close();
		
	}

}
