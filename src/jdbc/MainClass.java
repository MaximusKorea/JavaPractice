package jdbc;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Member member = new Member();
		int num = 0;
		while(true) {
			System.out.println("1.회원 목록 2.회원 추가 3.회원 수정 4.회원 삭제 5.종료");
			System.out.print("입력 >>>>");
			num = sc.nextInt();
			
			switch(num) {
			
			case 1: member.showlist(); break;
			case 2: member.insert(); break;
			case 3: member.modify(); break;
			case 4: member.delete(); break;
			case 5: return;
			
			
			}
		}
		
	}

}
