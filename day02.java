package javawin01;

public class day02 {

	public static void main(String[] args) {
		//1�� ���� ������ ö���� ���� �⺻ ���� 100���� ������ �ִ�
		int pointy = 100; int pointc = 100;
		//2�� ���� ö���� 2�� �̰��
		//�� �� �̰�����
		pointy = pointy-10; 
		pointc = pointc+10;
		//�� �� �� �̰�����
		pointy = pointy-10; 
		pointc = pointc+10;
		//3�� ���� ����
		pointy = pointy+2; 
		pointc = pointc+2;
		//4�� ���� ������ 1�� �̰��
		pointy = pointy+10; pointc = pointc-10;
		//5�� ���� ���� ������ ����Ͻÿ�
		System.out.println("������ ����"+pointy); 
		System.out.println("ö���� ����"+pointc);
	}

}
