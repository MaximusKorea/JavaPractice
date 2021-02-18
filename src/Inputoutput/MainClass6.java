package Inputoutput;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;

public class MainClass6 {

	public static void main(String[] args) throws Exception {
//      아래 내용을 try~with~resourse 구문으로 표현하면 더 편리하다.
//		try~with~resource 구문은 로직이 끝난 후 자동으로 close를 해주기때문에 유용하다.
		try(DataInputStream dos = new DataInputStream(new BufferedInputStream(new FileInputStream(new File("E:\\JSP\\aaa.txt"))))){
			String name = dos.readUTF();
			int num = dos.readInt();
			double dou = dos.readDouble();
			
			System.out.println("얻어진 값 :" + name);
			System.out.println("얻어진 값 :" + num);
			System.out.println("얻어진 값 :" + dou);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
//		DataInputStream dos = new DataInputStream(new BufferedInputStream(new FileInputStream(new File("E:\\JSP\\aaa.txt"))));
//		String name = dos.readUTF();
//		int num = dos.readInt();
//		double dou = dos.readDouble();
//		
//		System.out.println("얻어진 값 :" + name);
//		System.out.println("얻어진 값 :" + num);
//		System.out.println("얻어진 값 :" + dou);
//		
//		dos.close();
		
		
		
	}

}
