package stream2;

import java.util.Arrays;
import java.util.stream.Stream;

public class MainClass4 {

	public static void main(String[] args) {
		
		//flatMap 같은 경우는 일반 Map과는 다르게 전달 인자 람다식이 스트림 형성을 하는 내용을 담고 있어야한다.
		Stream<String> s1 = Stream.of("My_birthday","It_is_beautiful");
		Stream<String> s2 = s1.flatMap(s -> Arrays.stream(s.split("_")));
		s2.forEach(s -> System.out.print(s + "\t"));
		System.out.println();
	}

}
