package javawin01;

import java.util.Scanner;

public class day6_test1 
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		String[] menu = {"¥���","«��","������","������","��¥��"};
		int[] num = new int[5];

		/*
		for(int i = 0; i < menu.length; i++)
		{
			System.out.println("�޴��� �Է��ϼ���.");
			menu[i] = in.nextLine();
		}

		*/
		System.out.println("�Ʒ� �޴��߿��� ���ϴ� �޴��� ����ּ���.");

		for(int i = 0; i < menu.length; i++)
		{
			System.out.print(i+1+"�� �޴� : "+menu[i]+" | ");
		}
		
		System.out.println();
		
		for(int i = 0; i < 5; i++)
		{
			num[i] = in.nextInt();
		}
		
		for(int i = 0; i < 5; i++)
		{	
			System.out.println((i+1)+"��°�� ���� �޴� : "+menu[num[i]-1]+" ");
		}
	}
}
