package javawin01;

import java.util.Random;

public class day7_01 
{

	public static void main(String[] args) 
	{
		// r.nextInt �׽�Ʈ �ڵ�
		Random r = new Random();
		/*for(int i = 0; i < 10; i++)
		{
			System.out.println(r.nextInt(5)+1);
		}*/
		//�׽�Ʈ ��� �ζ� ��ȣ�� ����ϴ� �ڵ��  r.nextInt(45) + 1��  ���� �� �ִ�.
		int[] lotto = new int[7];
		//���� ���� Ȯ�� �׽�Ʈ �ڵ� 
		/*for(int i = 0; i < 7; i++)
		{
			System.out.println(i+"/"+lotto[i]);
		}*/
		//�ζ� ��ȣ�� �ϳ� �̾Ƽ� �迭�� �����ϱ� ����
		int a = r.nextInt(45)+1;
		//������ ����
		lotto[0] = a;
		//�ݺ��� �ڵ带 �ľ��ϰ� �װ� for���� �����Ų��
		for(int i = 0; i< 7; i++)
		{
			//�ζ� ��ȣ�� �ϳ� �̾Ƽ� ������ ����
			int b = r.nextInt(45)+1;
			//�迭�� ����
			lotto[i] = b;
		}
		//�ζ� ��ȣ ���
		for(int i = 0; i < 7; i++)
		{
			System.out.println(lotto[i]);
		}
	}
}
