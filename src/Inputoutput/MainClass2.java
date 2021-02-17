package Inputoutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

public class MainClass2 {

	public static void main(String[] args) throws Exception {

		System.out.println("생성할 파일 이름 입력");
		String fileName = new Scanner(System.in).next();
		File path = new File("E:\\JSP\\"+fileName+".txt");
		if(path.createNewFile()) {
			//File을 대상으로 하는 byte 단위로 데이터를 입력 및 출력하는 스트림 : 바이트 스트림
			OutputStream fos = new FileOutputStream(path); //FileOutputStream 클래스는 OutputStream클래스를 상속한다.
			System.out.println("파일 출력 값 입력 : ");
			fileName = new Scanner(System.in).next();
			fos.write(fileName.getBytes());  //바이트 스트림이므로 getByte를 해준다.
			fos.close();
		}else {
			System.out.println("해당파일은 이미 존재합니다.");
		}
	}

}
