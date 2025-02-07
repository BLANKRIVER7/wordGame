package javawin01;

import java.util.Scanner;

public class day6_test2 
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		String[] menu = {"짜장면","짬뽕","볶음밥","탕수육","간짜장"};
		int[] num = new int[5];

		/*
		for(int i = 0; i < menu.length; i++)
		{
			System.out.println("메뉴를 입력하세요.");
			menu[i] = in.nextLine();
		}

		*/
		System.out.println("아래 메뉴중에서 원하는 메뉴를 골라주세요.");
		
		for(int i = 0; i < menu.length; i++)
		{
			System.out.print(i+1+"번 메뉴 : "+menu[i]+" | ");
		}
		
		System.out.println("종료는 숫자 999를 입력해주세요.");
		
		for(int i = 0; i < 3; i++)
		{
			num[i] = in.nextInt();
			if(num[i] == 999)
			{
				break;
			}
		}
		
		for(int i = 0; i < 3; i++)
		{	
			System.out.println((i+1)+"번째로 고르신 메뉴 : "+menu[num[i]-1]+" ");
		}
	}


}
