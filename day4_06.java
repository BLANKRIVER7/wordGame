package javawin01;

public class day4_06 
{

	public static void main(String[] args) 
	{
		int money = 1000;
		
		for(int i = 1; i <= 30; i++) 
		{
			if(i%2 == 0) {
				money += 1500;
			}
			else 
			{
				money += 1000;
			}
		}
		
		System.out.println("30�� �� ���� �� �ִ� �ݾ� : "+money);

	}

}
