package javawin01;

public class day2_test2 {

	public static void main(String[] args) {
		int b = 10;
		int c = 4;

		double e = b/c;
		int g = b/c;
		double h = b/(double)c;
		System.out.println(e);
		System.out.println(g);
		System.out.println(h);
	}

	/*�ؼ�:
	
	b������ �����ϰ�
	b������ �ڷ����� int�̴�
	�ʱⰪ ��� 10�� �����Ͽ� �����ߴ�

	int d = b/c
	d������ �����ϰ� �ڷ����� int�̴�
	�ʱⰪ���� b/c ����� �����Ͽ� �����Ѵ�
	b.c ������ ����/���� �����̹Ƿ�
	����� �����̴�. ������� 2�̴�

	double h = b/(double)c;
	h������ �����ϰ� �ڷ����� �����̴�. 
	�Ǽ� �ʱⰪ�� b/(double)e �� ����� �����Ͽ� ����
	b/(double)c ������ ĳ���� ���� �Ͼ��
	����/�Ǽ��� �����ε� Ÿ���� ���߱� ���� ���� �κ��� ������ �� ��ȯ�� �Ͼ��
	�Ǽ�/�Ǽ��� �ȴ�
	�Ǽ��� ������ ������ ����� 2.5�� ����.
	�� ��� ���� h������ �����Ͽ� �����Ѵ� */

}

