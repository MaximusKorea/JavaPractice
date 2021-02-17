package stream1;

import java.util.Arrays;

public class FirstStream2 {

	public static void main(String[] args) {
		
		int[] ar = {1,2,3,4,5};		
		int sum = Arrays.stream(ar).filter(n -> n%2 == 1).sum();  // 최종연산인 sum이 호출 되어야 filter(중간연산)의 호출 결과가 스트림에 반영된다.
		System.out.println(sum);
	}

}
