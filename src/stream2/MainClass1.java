package stream2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MainClass1 {

	public static void main(String[] args) {

		//스트림 생성에 필요한 데이터를 직접 전달
		Stream.of("Java is good language","Python is also good language").forEach(s -> System.out.println(s + "\t"));
		//하나의 인스턴스를 전달하는 것임.
		List<Integer> list = Arrays.asList(1111,2222,3333,4444);
		Stream.of(list).forEach(i -> System.out.println(i + "\t"));
	}

}
