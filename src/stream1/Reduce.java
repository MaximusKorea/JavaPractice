package stream1;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce {

	public static void main(String[] args) {
		 //reduce는 데이터를 축하는 것을 의미한다. 즉, 2가지 인자가 들어가 1개의 결과 값이 나오고  그 결과 값과 다음 인자와 연산이 이루어져 또 하나의 결과를 만들어낸다.
		 //결과적으로 마지막에는 하나의 결과를 얻어낸다.
		List<Integer> list = Arrays.asList(1,22,333,4444,55555);
		
		BinaryOperator<Integer> lc = (n1, n2) -> {
			if(n1.toString().length() > n2.toString().length()) {
				return n1;
			}else {
				return n2;
			}
		};
		
		int num = list.stream().reduce(11111111, lc); //reduce는 최종 연산이며, 인자로 2가지가 들어간다. 첫번째 인자는 stream이 비어있을 때 반환하는 값을 의미한다. 
		int num2 = list.parallelStream().reduce(11111111, lc); // parallelStream()은 리덕션 시 병렬 처리를 의미한다.
		System.out.println(num);						//그러나 이 첫번째 인자는 stream이 비어있을 때 스트림의 첫번째 인자로 간주되기 때문에 위와같이 할 경우에 11111111이 반환된다.
		System.out.println(num2);
	}

}
