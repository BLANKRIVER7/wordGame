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
		double[] a = new double[45]; // Ȯ�� ����
		double a_sum = 0; // �� Ȯ���� ��
		double normal = 0;
		Scanner in = new Scanner(System.in);   
      	Random r = new Random();
     	int[] cnt = new int[45];
      	int[] lotto_num = new int[10]; // �̾Ƽ� ������ �ζ� ��ȣ
      	int b = 0; // �Է°� ����
      	int c = 0; // �Է°� ����
      	int d = 0; // �Է°� ����
		
		for(int i = 0; i < 1000; i++)
		{
			count[r.nextInt(45)]++;
		}

		for(int i = 0; i < 45; i++)
		{
		 	a[i] = (double)count[i]/1000;
			System.out.println((i+1)+" ��ȣ�� "+count[i]+"�� ������ Ȯ���� "+a[i]+"�Դϴ�." );
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

		System.out.println("���� ���� ���� �ζ� ��ȣ�� : "+max);

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
		
		System.out.println("���� ���� ���� �ζ� ��ȣ�� : "+min);
		
		for(int i = 0; i < 45; i++)
		{
			a_sum += count[i];
		}

		normal = a_sum/45;
		
		for(int i = 0; i < 45; i++)
		{
			if(count[i] > normal)
			{
				System.out.println("��� �̻� ���� �ζ� ��ȣ�� : "+(i+1));
			}
		}
		      System.out.println("���ڸ� �Է��ϼ���.(�� 5ȸ)");

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
            	System.out.println("���ڸ� �ٽ� �Է��ϼ���.");
            	i -= 1;   
         	}
      	}
      	for(int i = 5; i <10 ; i++)
      	{
         	c = r.nextInt(45)+1;
         	
         	if(cnt[c-1] == 0)
         	{
         		System.out.println(c+" ���ڸ� �����Ͻðڽ��ϱ�? 1(��), 1 �̿ܿ� ������(�ƴϿ�)");
         		d = in.nextInt();
         		
         		if(d == 1)
         		{	
         			lotto_num[i] = c;
         			cnt[c-1]++;
         		}
         		else
         		{
         			System.out.println("�ٽ� �����״� �������ּ���.");
         			i -= 1;
         		}
         	}
         	else
         	{
            			i -= 1;   
         	}
      	}
         	
      	
      	
      	System.out.print("�Է��Ͻ� ���ڴ� : ");

       for(int i = 0; i < 10; i++)
       {
         	System.out.print(" "+lotto_num[i]+" ");
       } 
	}

}


