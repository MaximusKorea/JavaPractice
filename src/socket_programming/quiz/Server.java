package socket_programming.quiz;


import java.net.ServerSocket;
import java.net.Socket;

public class Server {
/*
	Q.클라이언트끼리의 실시간  채팅을 구현해본다.
		1. 서버입장에서 단일 쓰레드일 경우 클라이언트로부터 연결요청과 메세지 송신을 받기전에 다음 클라이언트의 연결요청을 받을 수 없기 때문에
			클라이언트마다 연결 요청시 쓰레드를 만들어주어야한다.
		2. 서버가 클라이언트1의 메세지를 다른 클라이언트에게도 보내주어야 하기 때문에 다른 클라이언트들에 대한 정보가 필요하다.
		3. 다른 클라이언트들에 대한 정보를 쓰레드에 담을 수 있으나 각각 쓰레드의 변수에 담게 되면 각 참조변수가 참조하는 쓰레드마다 정보가 다를 수 있으므로
		   static 변수를 선언하여 그곳에 각 쓰레드에 대한 정보를 담아 준다.
*/	
	public static void main(String[] args) throws Exception {
		ServerSocket server = new ServerSocket(12345);
		System.out.println("서버가 동작합니다.");
		while(true) {
			Socket s = server.accept();
			ReadWriteThread.socketList.add(s);
			new ReadWriteThread(s);
		}
	}

}
