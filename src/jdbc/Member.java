package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Member {

	DbClass db = new DbClass();
	
	public void showlist() {
		List<Student> list = db.getMember();
		
		System.out.println("id\tname\tage");
		System.out.println("------------------------------------------");
		for(int i= 0; i<list.size();i++ ) {
			System.out.print(list.get(i).getUserId()+"\t");
			System.out.print(list.get(i).getName()+"\t");
			System.out.println(list.get(i).getAddress()+"\t");
		}
		System.out.println("------------------------------------------");
		
	}
	
	public void insert() {
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디 : ");
		String id = sc.next();
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("주소 : ");
		String address = sc.next();
		int result = db.DbInsert(id, name, address);
		if(result == 1) {
			System.out.println("학생 등록 완료!");
		}else {
			System.out.println("등록 실패");
		}
		
	}
	public void delete() {
		Scanner sc = new Scanner(System.in);
		System.out.print("삭제하실 아이디 : ");
		String id = sc.next();
		if(db.Dbdelete(id)) {
			System.out.println("학생 정보 삭제완료");
		}else {
			System.out.println("없는 정보입니다.");
		}
		
		
	}
	public void modify() {
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디 : ");
		String id = sc.next();
		System.out.print("이름: ");
		String name = sc.next();
		System.out.print("주소 : ");
		String address = sc.next();
		int result = db.DbModify(id, name, address);
		if(result == 1) {
			System.out.println("회원정보 수정이 완료되었습니다.");
		}else if(result == -1) {
			System.out.println("없는 id입니다.");
		}else {
			System.out.println("회원정보 수정 실패");
		}
		
	}
	
}
