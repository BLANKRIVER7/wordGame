package javawin01;

public class day9_01 
{
	public static void main(String[] args) 
	{

int[] pang={1,0,0,0,2,3,4,4,6,2,2,2,2,5};
int count = 0;

for(int i = 0; i < pang.length; i++)
{
	if(i == 0)
	{
		for(int j = i; pang[i] == pang[j]; j++)
		{
			count++;

			if(j == pang.length-1)
			{
				break;
			}
		}
		
		if(count >= 3)
		{
			System.out.println("���� ��� ĳ���� ��ȣ : "+pang[i]+" | ���� : "+count+" | ������ġ �ε��� : "+i);	
		}
		count = 0;
	}
	else if(pang[i] != pang[i-1])
	{
		for(int j = i; pang[i] == pang[j]; j++)
		{
			count++;

			if(j == pang.length-1)
			{
				break;
			}
		}
		
		if(count >= 3)
		{
			System.out.println("���� ��� ĳ���� ��ȣ : "+pang[i]+" | ���� : "+count+" | ������ġ �ε��� : "+i);	
		}
		count = 0;
	}
}

	}
}
