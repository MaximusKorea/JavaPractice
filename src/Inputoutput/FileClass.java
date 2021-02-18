package Inputoutput;

import java.io.Serializable;

//IO 스트림을 통해 인스턴스 또한 입출력이 가능하다.
//이 때, 인스턴스의 클래스는 java.io.Serializable 인터페이스를 구현해야한다.
public class FileClass implements Serializable {
	
	private int x,y;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public void print() {
		System.out.println("x : "+x);
		System.out.println("y : "+y);
	}
	
	
}
