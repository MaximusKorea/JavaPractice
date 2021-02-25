package socket_programming.quiz;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client1 {

	public static void main(String[] args) throws Exception {
		
		Socket s = new Socket("localhost",12345);
		new ReadThread(s);
		while(true) {
			OutputStream out = s.getOutputStream();
			DataOutputStream dos = new DataOutputStream(out);
			Scanner input = new Scanner(System.in);
			System.out.println("전송 데이터 입력 : ");
			String outData = input.nextLine();
			dos.writeUTF(outData);
		}
		
	}

}
