package javawin01;

public class day5_test1 
{
	public static void main(String[] args)
	{
		int[] a = new int[7];
		int n = 0;
		int k = 0; // 7부터 순서를 거꾸로 가게하는 키
		for(int i=1; i<=7; i++){
			if(k == 1 && n != 6)
			{
				a[n] = i;
				n++;
				i -= 2;
			}
			else if(n == 6)
			{
				a[n] = i;
				i = 8;
			}
			else if(i%2 != 0 && k == 0)
			{
				if(i == 7)
				{
					a[n] = i;
					n++;
					i = 5;
					k = 1;	
				}
				else
				{
					a[n] = i;	
					n++;
				}
			}

		}
		for(int i=1; i<=7; i++){
			System.out.print(a[i-1]+" "); 
		}
	}
}
