package javawin01;

import java.util.Random;
import java.util.Scanner;

public class day7_test1 {

	public static void main(String[] args)
	{
		int[] count = new int[45];
		int max = 0;
		int Mcnt = 0;
		int min = 0;
		int mcnt = 0;
		double[] a = new double[45]; // 확률 저장
		double a_sum = 0; // 각 확률의 합
		double normal = 0;
		Scanner in = new Scanner(System.in);   
      	Random r = new Random();
     	int[] cnt = new int[45];
      	int[] lotto_num = new int[10]; // 뽑아서 저장할 로또 번호
      	int b = 0; // 입력값 저장
      	int c = 0; // 입력값 저장
      	int d = 0; // 입력값 저장
		
		for(int i = 0; i < 1000; i++)
		{
			count[r.nextInt(45)]++;
		}

		for(int i = 0; i < 45; i++)
		{
		 	a[i] = (double)count[i]/1000;
			System.out.println((i+1)+" 번호는 "+count[i]+"개 뽑혔고 확률은 "+a[i]+"입니다." );
		}

		for(int i = 0; i < 45; i++)
		{
			if(i == 0)
			{
				Mcnt = count[i];
				max = i+1;
			}
			else if(count[i] >= Mcnt)
			{	
				Mcnt = count[i];
				max = i+1;
			}
		}

		System.out.println("가장 많이 나온 로또 번호는 : "+max);

		for(int i = 0; i < 45; i++)
		{
			if(i == 0)
			{
				mcnt = count[i];
				min = i+1;
			}
			else if(count[i] <= mcnt)
			{
				mcnt = count[i];
				min = i+1;
			}
		}
		
		System.out.println("가장 적게 나온 로또 번호는 : "+min);
		
		for(int i = 0; i < 45; i++)
		{
			a_sum += count[i];
		}

		normal = a_sum/45;
		
		for(int i = 0; i < 45; i++)
		{
			if(count[i] > normal)
			{
				System.out.println("평균 이상 나온 로또 번호는 : "+(i+1));
			}
		}
		      System.out.println("숫자를 입력하세요.(총 5회)");

      	for(int i = 0; i <5 ; i++)
      	{
        	b = in.nextInt();

        	if(cnt[b-1] == 0)
        	{
          		 lotto_num[i] = b;
         		 cnt[b-1]++;
         	}
         	else
         	{
            	System.out.println("숫자를 다시 입력하세요.");
            	i -= 1;   
         	}
      	}
      	for(int i = 5; i <10 ; i++)
      	{
         	c = r.nextInt(45)+1;
         	
         	if(cnt[c-1] == 0)
         	{
         		System.out.println(c+" 숫자를 선택하시겠습니까? 1(네), 1 이외에 나머지(아니요)");
         		d = in.nextInt();
         		
         		if(d == 1)
         		{	
         			lotto_num[i] = c;
         			cnt[c-1]++;
         		}
         		else
         		{
         			System.out.println("다시 뽑을테니 결정해주세요.");
         			i -= 1;
         		}
         	}
         	else
         	{
            			i -= 1;   
         	}
      	}
         	
      	
      	
      	System.out.print("입력하신 숫자는 : ");

       for(int i = 0; i < 10; i++)
       {
         	System.out.print(" "+lotto_num[i]+" ");
       } 
	}

}


