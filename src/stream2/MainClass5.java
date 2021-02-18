package stream2;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MainClass5 {

	public static void main(String[] args) {

		//Stream에서 최종연산 중 forEach가 있다 이것을 looping이라고 한다.
		//그런데 중간연산에도 looping에 해당하는 것이 있다 -> peek
		IntStream.of(1,3,5).peek(i -> System.out.print(i + "\t"));
		System.out.println();
		
		//sum은 최종연산이다. 그러나 반환값을 저장하여 출력하지 않는다. 최종연산으로의 역할만 한다.
		IntStream.of(1,3,5).peek(i -> System.out.print(i + "\t")).sum();
		System.out.println();
		
		
	}

}
