package day02_variable;

import java.io.IOException;

public class Ex06 {
	public static void main(String[] args) throws IOException {
		//����ڷκ��� �Է¹޴� ���
		int val;
		System.out.println("�Է� : ");
		val = System.in.read(); //�ϳ��� ���� �Է¹ްڴ�
		System.out.println("�Է� data : " + (char)val); //����ȯ
	
		//�׷��� �Է¹޴°� 2���� �Է�����. �Է¹޴°Ϳ� �����ȳ��� ����
		System.in.read();
		System.in.read();
		
		
		//�տ� �Էµ� ������ �ִٸ� �ڿ� �ִ� ������ �Է��� �ȵȴ�. �ܿ��� �����ϱ�
		System.out.println("2��° �Է� : ");
		val = System.in.read(); //�ϳ��� ���� �Է¹ްڴ�
		System.out.println("�Է� data : " + (char)val
				);
		
	}

}
