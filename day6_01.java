package javawin01;

import java.util.Scanner;
//여기서 util
public class day6_01 
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		//ctrl + shift + 'o'
		for(int i = 0; i < 3; i++)
		{
			System.out.println("첫 번재 숫자를 입력하세요.");
			System.out.println("그만하고 싶으면 999를 입력하세요.");
			int a = in.nextInt();
			if(a == 999)
			{
				i = 100;
				break;
			}
			System.out.println("두 번재 숫자를 입력하세요.");
			int b = in.nextInt();
			
			System.out.println("두 수의 합은 : "+(a+b));
		}
		
		
	}

}
