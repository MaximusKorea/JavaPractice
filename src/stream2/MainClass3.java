package stream2;

import java.util.stream.Stream;

public class MainClass3 {

	public static void main(String[] args) {
		
		Stream<Integer> si1 = Stream.of(1111,2222);
		Stream<Integer> si2 = Stream.of(3333,4444);
		
		Stream.concat(si1, si2).forEach(i -> System.out.println(i));
		//concat : 하나의 스트림으로 묶어준다.
	}

}
