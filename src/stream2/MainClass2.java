package stream2;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class MainClass2 {

	public static void main(String[] args) {
		//병렬 스트림
		List<String> list = Arrays.asList("Apple","Peach","Banana","Kiwi","Melon");
		Stream<String> strm = list.stream();
		
		BinaryOperator<String> bo = (s1,s2) -> {
			if(s1.length() > s2.length())
				return s1;
			else
				return s2;
		};
		
		String str = strm.parallel().reduce("", bo);
		System.out.println(str);
		
		
	}

}
