package socket_programming.client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client3 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		Socket s = new Socket("localhost",12345);
		OutputStream out = s.getOutputStream();
		DataOutputStream dos = new DataOutputStream(out);
		System.out.print("송신 데이터 입력 ");
		String data = sc.next();
		dos.writeUTF(data);
		
		InputStream in = s.getInputStream();
		DataInputStream dis = new DataInputStream(in);
		data = dis.readUTF();
		System.out.println("서버로부터 데이터 수신 : "+data);
		
	}

}
