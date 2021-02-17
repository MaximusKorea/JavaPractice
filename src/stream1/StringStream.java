package stream1;

import java.util.Arrays;
import java.util.stream.Stream;

public class StringStream {

	public static void main(String[] args) {
		
		String[] names = {"YOON", "LEE", "PARK"};
		Stream<String> stm = Arrays.stream(names); //스트림 형성
		stm.forEach(s -> System.out.println(s)); // 최종 연산 진행
		//Arrays.stream(names).forEach(s -> System.out.println(s)); 로도 가능함
	}

}
