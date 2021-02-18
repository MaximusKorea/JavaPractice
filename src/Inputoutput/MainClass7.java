package Inputoutput;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class MainClass7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FileClass fc = new FileClass();
		System.out.print("x값 입력 : ");
		fc.setX(sc.nextInt());
		System.out.print("y값 입력 : ");
		fc.setY(sc.nextInt());
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(new File("E:\\JSP\\aaa.txt"))))){
			oos.writeObject(fc);
			System.out.println("인스턴스가 파일로 저장되었습니다.");
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
