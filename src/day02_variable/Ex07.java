package day02_variable;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int age;
		String name;
		System.out.print("이름 입력 : ");
		name = input.next(); //next = input입력받겠다 //문자열 입력받겠다
		System.out.print("나이 입력 : ");
		age = input.nextInt();//정수형 입력받겠다
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}

}
