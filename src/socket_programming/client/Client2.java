package socket_programming.client;

import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client2 {

	public static void main(String[] args) throws Exception {

		Scanner input = new Scanner(System.in);
		Socket s = new Socket("localhost",12345);
		OutputStream out = s.getOutputStream();
		System.out.print("수 입력 : ");
		int data = input.nextInt();
		out.write(data);
		out.close(); s.close();
	}

}
