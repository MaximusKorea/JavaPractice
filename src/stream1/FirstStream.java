package stream1;

import java.util.Arrays;
import java.util.stream.IntStream;

public class FirstStream {

	public static void main(String[] args) {
		
		//스트림은 데이터의 복사본이라 생각하면 좋다. 중간 연산과 최종 연산을 진행하기 좋은 구조로 배치된 복사본
		
		int [] arr = {1,2,3,4,5};
		IntStream stm1 = Arrays.stream(arr); 
		IntStream stm2 = stm1.filter(n-> n%2 == 1); // 중간 연산
		int sum = stm2.sum(); 						// 최종 연산 sum
		System.out.println(sum);
	}

}
