package javawin01;

public class day5_03 
{

	public static void main(String[] args) 
	{
		//�ϳ��� for���� �ϳ��� ��ɸ� �ϵ��� ������ ���� (�Է� ���� ��� ����)
		int[] a = new int[5];
		//�迭 �� �Է���
		for(int i = 0; i <5; i++)
		{
			a[i] += i;
		}
		//�迭 �� �����
		for(int i = 0; i <5; i++)
		{
			System.out.print(a[i]+" ");
		}
	}

}
