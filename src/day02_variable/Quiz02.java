package day02_variable;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//ó����� String name;  int kor, eng, math; �̷��� �ص���

		String name;
		int kor, eng, math, sum;
		System.out.print("�̸� �Է� : ");
		name = input.next();
		
		System.out.print("ȫ�浿 ���� ���� ���� : ");
		kor = input.nextInt();
		
		System.out.print("ȫ�浿 ���� ���� ���� : ");
		eng = input.nextInt();
		
		System.out.print("ȫ�浿 ���� ���� ���� : ");
		math = input.nextInt();

		
		System.out.println("===========================");
		System.out.println("�̸� : " + name);
		System.out.println("===========================");
		System.out.println("���� : " + kor);
		System.out.println("���� : " + eng);
		System.out.println("���� : " + math);
		System.out.println("===========================");

		sum = kor + eng + math;
		System.out.println("�հ� : " + sum);
		System.out.println("===========================");
	}

}
