package day02_variable;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int age;
		String name;
		System.out.print("�̸� �Է� : ");
		name = input.next(); //next = input�Է¹ްڴ� //���ڿ� �Է¹ްڴ�
		System.out.print("���� �Է� : ");
		age = input.nextInt();//������ �Է¹ްڴ�
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age);
	}

}
