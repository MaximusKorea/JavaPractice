package stream1;

import java.util.Arrays;
import java.util.List;

public class Mapping1 {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Elephant","Orange","Computer-Engineering");
		list.stream().map(s -> 3*s.length()).forEach(p -> System.out.print(p + "\t")); // list에 저장된 데이터를 대상으로 스트림을 형성한 후 maping(글자길이 * 3)한 후 출력한다.
		System.out.println();
		//여기서 mapping의 경우에는 각각의 요소들을 람다식으로 처리한 후 모아서 새롭게 스트림을 생성한 후 반환해준다.
	}

}
