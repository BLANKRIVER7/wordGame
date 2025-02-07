package javawin01;

public class day4_test1 
{
	public static void main(String[] args) 
	{
		int a = 0; // 구하고자 하는 파보니치수 보다 2칸 앞
		int b = 0; // 구하고자 하는 파보니치수 보다 1칸 앞
		int c = 0; // b의 값 보존용
		int sum = 0;

		for(int i = 1; i <= 8; i++)
		{
			if(i == 1)
			{
				a = 1;
				sum += a;
				System.out.print(a);
			}
			else if(i == 2)
			{
				b = 1;
				sum += b;
				System.out.print(" + "+b);
			}
			else
			{

				c = b;
				b += a;
				a = c;
				System.out.print(" + "+b);
					
				sum += b;	
			}
		}
		System.out.println(" = "+sum);

	}

}
