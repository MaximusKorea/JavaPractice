package socket_programming.server;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server1 {

	public static void main(String[] args) throws Exception {
/*
		- 서버 : 서비스를 제공하는 컴퓨터, 연결 요청을 받는 곳
		- 클라이언트 : 서비스를 제공받는 컴퓨터, 연결 요청을 보내는 곳
		- 소켓 : 서버와 클라이언트가 통신하기 위해서는 소켓을 이요해서 통신을 할 수 있다. (ip와 포트번호로 소켓이 생성된다. port 번호는 2byte 이며 표현 범위는 0~65535 이다.) 
*/
		ServerSocket server = new ServerSocket(12345);
		System.out.println("접속을 기다립니다.");
		
		Socket clt_s = server.accept();
		System.out.println("실행");
		System.out.println(clt_s.getInetAddress());
		System.out.println(clt_s.getPort());
		System.out.println("연결 되었습니다.");
		InputStream in = clt_s.getInputStream();
		int readData = in.read();
		System.out.println("수신 데이터 : " + readData);
		in.close(); clt_s.close(); server.close();
		//현재 상태는 accept가 한번 이루어지기 때문에 2개 이상의 클라이언트가 연결 요청을 하더라도 처음에 연결요청을 한 클라이언트만 accept된다.
	}

}
