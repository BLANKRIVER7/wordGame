package javawin01;

public class day3_01 {

	public static void main(String[] args) 
	{
		//�迭 Ư¡ : ���������� �Ҵ��Ѵ�, ���� �����̴�.
		//���� ������, ����(�ε���), value�� ���� �м��Ѵ�.
		//����
		int[] a = new int[4];
		System.out.println("���� : "+a.length);
		System.out.println("�ʱⰪ : "+a[0]);
		a[0] = 40;
		a[3] = 60;
		System.out.println(a[0]+"/"+a[1]+"/"+a[2]+"/"+a[3]);
		//�迭�� �ε��� ������ ����� ���ܰ� �߻��Ѵ�. ex)�Ʒ��� ���� ���
		//a[4] = 70;
	}

}
