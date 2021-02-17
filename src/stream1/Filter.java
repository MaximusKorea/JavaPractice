package stream1;

import java.util.Arrays;
import java.util.List;

public class Filter {

	public static void main(String[] args) {
		int[] arr = {5,6,2,1,5};
		Arrays.stream(arr).filter(n -> n%2 ==1).forEach(n -> System.out.print(n + "\t"));
		System.out.println();
		
		List<String> list = Arrays.asList("Apple","Banana","Peach","Ant"); //list를 add가 아닌 초기화하는 방법
		list.stream().filter(s -> s.length() == 5).forEach(s -> System.out.println(s + "\t")); //filter로 길이가 5인 것만 통과시킨다.(filter는 해당 조건에 부합하는 요소를 통과시킨다.)
		System.out.println();
	}

}
