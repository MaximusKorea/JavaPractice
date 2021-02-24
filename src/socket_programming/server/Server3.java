package socket_programming.server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server3 {

	public static void main(String[] args) throws Exception {
	//port 번호는 2byte 이며 표현 범위는 0~65535 이다. 
	ServerSocket server = new ServerSocket(12345);
	System.out.println("연결 대기중입니다.");
	Socket clt_s = server.accept();
	InputStream in = clt_s.getInputStream();
	DataInputStream dis = new DataInputStream(in);
	String readData = dis.readUTF();
	System.out.println("수신 데이터 : " + readData);
	
	Scanner input = new Scanner(System.in);
	System.out.print("송신 데이터 입력 : ");
	String data = input.next();
	
	OutputStream out = clt_s.getOutputStream();
	DataOutputStream dos = new DataOutputStream(out);
	dos.writeUTF(data);
	
	dos.close();out.close();
	dis.close();in.close();clt_s.close();server.close();
	}

}
