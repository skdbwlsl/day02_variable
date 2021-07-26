package day02_variable;

import java.io.IOException;

public class Ex06 {
	public static void main(String[] args) throws IOException {
		//사용자로부터 입력받는 기능
		int val;
		System.out.println("입력 : ");
		val = System.in.read(); //하나의 값만 입력받겠다
		System.out.println("입력 data : " + (char)val); //형변환
	
		//그래서 입력받는걸 2개를 입력해줌. 입력받는것에 오류안나기 위해
		System.in.read();
		System.in.read();
		
		
		//앞에 입력된 내용이 있다면 뒤에 있는 내용은 입력이 안된다. 잔여물 있으니까
		System.out.println("2번째 입력 : ");
		val = System.in.read(); //하나의 값만 입력받겠다
		System.out.println("입력 data : " + (char)val
				);
		
	}

}
