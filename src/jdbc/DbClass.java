package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DbClass {

	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String id = "oracle1";
	private String pw = "1234";
	Connection conn = null;
	public DbClass() {
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url,id,pw);
		
		}catch(Exception e) {
			e.printStackTrace();
		}
	
	}
	
	public List<Student> getMember(){
		List<Student> list = new ArrayList<>();
		
		String sql = "SELECT * FROM usertest";
		
		try(PreparedStatement pstmt = conn.prepareStatement(sql)){
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				Student st = new Student(
						rs.getString("userid"),
						rs.getString("username"),
						rs.getString("age"));
				list.add(st);
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return list;
		
	}
	
	public int DbInsert(String id,String name,String address) {
		
		String sql = "INSERT INTO usertest VALUES(?,?,?)";
		int result = 0;
		try(PreparedStatement pstmt = conn.prepareStatement(sql)){
			pstmt.setString(1, id);
			pstmt.setString(2, name);
			pstmt.setString(3, address);
			result = pstmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
	
	public boolean DbConfirm(String id) {
		
		String sql = "SELECT * FROM usertest WHERE userid = ?";
		boolean flag = false;
		int result = 0;
		try(PreparedStatement pstmt = conn.prepareStatement(sql)){
			pstmt.setString(1,id);
			result = pstmt.executeUpdate();
			if(result == 1) flag = true;
			else flag = false;
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return flag;
	}
	
	public boolean Dbdelete(String id) {
		boolean flag = false;
		if(DbConfirm(id)) {
			String sql = "DELETE FROM usertest WHERE userid = ?";
			try(PreparedStatement pstmt = conn.prepareStatement(sql)){
				pstmt.setString(1, id);
				pstmt.executeUpdate();
				flag = true;
			}catch(Exception e) {
				e.printStackTrace();
			}
			
			
		}else {
			flag = false;
		}
		return flag;
	}
	
	public int DbModify(String id, String name, String address) {
		String sql = "UPDATE usertest SET username = ?,age=? WHERE userid = ?";
		int result = 0;
		if(DbConfirm(id)) {
		try(PreparedStatement pstmt = conn.prepareStatement(sql)){
			pstmt.setString(1, name);
			pstmt.setString(2, address);
			pstmt.setString(3, id);
			result = pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}
		}else {
			result = -1;
		}
		return result;
	}

}