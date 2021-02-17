package stream1;

import java.util.List;

import java.util.Arrays;

public class ListStream {

	public static void main(String[] args) {
		//컬렉션 인스턴스를 대상으로 stream 메소드를 호출할 수 있다.
		List<String> list = Arrays.asList("Airplane","Subway","Train");
		list.stream().forEach(s -> System.out.print(s + "\t"));
		System.out.println();
	}

}
