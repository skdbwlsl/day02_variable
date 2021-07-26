package day02_variable;

public class Ex05 {
	public static void main(String[] args) {
		//상수 : 변경할 수 없는 값, 변수: 변경할 수 있는 값
		final int i = 100;  //값에 대한 변경을 막는 final. 상수화
		//i = 200; //이렇게 앞에서 final하고, 다른값 부여하면 오류난다. 
		System.out.println(i);
		
		
		//string 문자열
		final String KOREA = "대한민국"; //변경 불가한 변수는 모든값은 대문자로
		//KOREA = "미국";  //
		System.out.println(KOREA);
	}

}
