package socket_programming.client;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client4_3 {

	public static void main(String[] args) throws Exception {

		Socket s = new Socket("localhost",12345);
		Scanner input = new Scanner(System.in);
		OutputStream out = s.getOutputStream();
		DataOutputStream dos = new DataOutputStream(out);
		String data;
		while(true) {
			System.out.println("송신 데이터 입력 : ");
			data = input.next();
			dos.writeUTF(data);
			dos.flush();
		}
		
	}

}
