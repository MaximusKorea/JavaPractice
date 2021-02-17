package Inputoutput;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class MainClass3 {

	public static void main(String[] args) throws Exception {
		
		File path = new File("E:\\JSP\\aaa.txt");
		InputStream fis = new FileInputStream(path);
		while(true) {
			int res = fis.read(); 
			//read()의 반환형은 int(4byte)이다. 기본적으로 1byte씩 읽는다. 1byte의 유효한 자료가 있으면 남은 3byte의 자리에 0을 채워
			//4byte를 만들어 반환한다.
			if(res == -1)break;
			System.out.println((char)res);
		}
	}

}
