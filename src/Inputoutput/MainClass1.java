package Inputoutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class MainClass1 {

	public static void main(String[] args) throws Exception {
		
		File path = new File("E:\\JSP\\aaa.txt");
		FileOutputStream fos = new FileOutputStream(path); //path 부분에 문자열로 "E:\\JSP\\aaa.txt"넣어도 생성된다.
//		FileOutputStream fos = new FileOutputStream(path,true); //현재파일이 존재하면 현재파일 뒤에 이어서 써주겠다
		String str = new Scanner(System.in).nextLine();
		fos.write(str.getBytes()); //바이트 단위 출력 스트림임
		fos.close();
		
		//폴더 구분자, path 구분자
		System.out.println("폴더 구별자 : " + File.separator);
		System.out.println("폴더 구별자 : " + File.separatorChar);
		System.out.println("path 구별자 : " + File.pathSeparator);
		System.out.println("path 구별 : " + File.pathSeparatorChar);
		
	}

}
