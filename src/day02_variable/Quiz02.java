package day02_variable;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//처움부터 String name;  int kor, eng, math; 이렇게 해도됌

		String name;
		int kor, eng, math, sum;
		System.out.print("이름 입력 : ");
		name = input.next();
		
		System.out.print("홍길동 님의 국어 점수 : ");
		kor = input.nextInt();
		
		System.out.print("홍길동 님의 영어 점수 : ");
		eng = input.nextInt();
		
		System.out.print("홍길동 님의 수학 점수 : ");
		math = input.nextInt();

		
		System.out.println("===========================");
		System.out.println("이름 : " + name);
		System.out.println("===========================");
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + math);
		System.out.println("===========================");

		sum = kor + eng + math;
		System.out.println("합계 : " + sum);
		System.out.println("===========================");
	}

}
