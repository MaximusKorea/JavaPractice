package socket_programming.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import socket_programming.thread.Mythread;

public class Server4 {

	public static void main(String[] args) throws Exception {
/*
 	Socket 통신을 할 때 여러 클라이언트에게서 송신을 받을 때 쓰레드 생성이 필요하다. 
 	쓰레드 생성을 하지 않는다면 먼저 연결된 클라이언트가 송신한 메세지를 read하기 전까지는 다음의 클라이언트가 accept 되지 않는다.(리슨상태에 머무른다.)
*/
		ServerSocket server = new ServerSocket(12345);
		int i = 0;
		while(true) {
			i++;
			System.out.println(i+".접속을 기다립니다.");
			Socket clt_s = server.accept();
			new Mythread(clt_s);
		}
		
		
	}

}
