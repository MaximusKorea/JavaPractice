package Inputoutput;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class MainClass4 {

	public static void main(String[] args) throws Exception {

//		File path = new File("E:\\JSP\\aaa.txt");
//		FileOutputStream fos = new FileOutputStream(path);
//		BufferedOutputStream bos = new BufferedOutputStream(fos);
		//아래와 같이 한줄로도 가능하다.
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(new File("E:\\JSP\\aaa.txt")));
		for(int i='1'; i<='9'; i++) {// '1' 이 아닌 1이 들어간다면 문자 1이 이 아닌 해당 값의 아스키코드 문자가 나온다.
			bos.write(i);
		}
		bos.flush(); 
		bos.close(); // close를 하기 싫다면 try~with~resource 구분으로 진행해준다.
		//fos.close();
	}

}
