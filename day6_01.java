package javawin01;

import java.util.Scanner;
//���⼭ util
public class day6_01 
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		//ctrl + shift + 'o'
		for(int i = 0; i < 3; i++)
		{
			System.out.println("ù ���� ���ڸ� �Է��ϼ���.");
			System.out.println("�׸��ϰ� ������ 999�� �Է��ϼ���.");
			int a = in.nextInt();
			if(a == 999)
			{
				i = 100;
				break;
			}
			System.out.println("�� ���� ���ڸ� �Է��ϼ���.");
			int b = in.nextInt();
			
			System.out.println("�� ���� ���� : "+(a+b));
		}
		
		
	}

}
