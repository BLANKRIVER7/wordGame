package javawin01;

import java.util.Scanner;

public class day8_test1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String[] train = {"","","","",""};
		String[] num = {"","","","",""};
		String[] subTrain = {"","","","",""};
		String[] hh = {"","","","",""};
		String[] mm = {"","","","",""};
		int count = 0; //��ü ���� ��
		int[] cnt = new int[5];

		System.out.println("������ ����ϼ���. (�׸� ���÷��� 'end'�� �Է��ϼ���)");

		for(int i = 0; i < 5; i++)
		{
			train[i] = in.nextLine();
			
			if(train[i].equals("end"))
			{
				train[i] = "";
				i = 4;
			}
		}

		for(int i = 0; i < 5; i++)
		{
			if(train[i].equals(""))
			{
			
			}
			else
			{
				cnt[i] = 1;
			}
		}

		for(int i = 0; i < 5; i++)
		{
			if(train[i].equals(""))
			{
			
			}
			else
			{
				count++;
			}
		}

		System.out.println("���� ��ϵ� �� ������ �� : "+count);

		for(int i = 0; i < 5; i++)
		{	
			if(train[i].equals(""))
			{

			}
			else
			{
				subTrain[i] += train[i].charAt(3);
			}
		}

		for(int i = 0; i < 5; i++)
		{
			if(train[i].equals(""))
			{

			}
			else
			{
				subTrain[i] += train[i].charAt(4);
			}
		}

		for(int i = 0; i < 5; i++)
		{
			if(train[i].equals(""))
			{

			}
			else
			{
				subTrain[i] += train[i].charAt(5);
			}
		}

		for(int i = 0; i < 5; i++)
		{
			if(train[i].equals(""))
			{

			}
			else
			{
				num[i] += train[i].charAt(0);
			}
		}

		for(int i = 0; i < 5; i++)
		{
			if(train[i].equals(""))
			{

			}
			else
			{
				num[i] += train[i].charAt(1);
			}
		}

		for(int i = 0; i < 5; i++)
		{
			if(train[i].equals(""))
			{

			}
			else
			{
				num[i] += train[i].charAt(2);
			}
		}

		for(int i = 0; i < 5; i++)
		{
			if(train[i].equals(""))
			{

			}
			else
			{
				hh[i] += train[i].charAt(6);
			}
		}

		for(int i = 0; i < 5; i++)
		{
			if(train[i].equals(""))
			{

			}
			else
			{
				hh[i] += train[i].charAt(7);
			}
		}

		for(int i = 0; i < 5; i++)
		{
			if(train[i].equals(""))
			{

			}
			else
			{
				mm[i] += train[i].charAt(8);
			}
		}

		for(int i = 0; i < 5; i++)
		{
			if(train[i].equals(""))
			{

			}
			else
			{
				mm[i] += train[i].charAt(9);
			}
		}

		for(int i = 0; i < 5; i++)
		{
			if(train[i].equals(""))
			{
			
			}
			else
			{
				System.out.println("��ȣ : "+num[i]+" | �̸� : "+subTrain[i]+" | �ð� : "+hh[i]+" | �� : "+mm[i]);
			}
		}


	}

}
