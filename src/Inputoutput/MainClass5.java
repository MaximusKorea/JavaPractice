package Inputoutput;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class MainClass5 {

	public static void main(String[] args) throws Exception {

		File path = new File("E:\\JSP\\aaa.txt");
		FileOutputStream fos = new FileOutputStream(path);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		DataOutputStream dos = new DataOutputStream(bos);
		//DataOutputStream : 기본자료형 데이터의 출력을 위한 필터 스트림 -> 타입별로 출력이 가능하다
		//DataInputStream : 기본자료형 데이터의 입력을 위한 필터 스트림 -> 타입별로 입력이 가능하다
		
		dos.writeUTF("홍길동");
		dos.writeInt(100);
		dos.writeDouble(1.123);
		
		dos.close();bos.close();fos.close();
	}

}
