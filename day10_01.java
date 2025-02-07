package javawin01;

public class day10_01 {

	public static void main(String[] args) {
		int[] pang={1,0,0,0,2,3,4,4,6,2,2,2,2,5};
		int count = 0;
		
		for(int i = 0; i < pang.length-2; i++)
		{
			count = 1;
			//System.out.println(i+"/"+pang[i]);
			System.out.print(i+" : ");
			for(int j = i + 1; pang[i] == pang[j]; j++)
			{
				System.out.print(j+" ");
				count++;
				if(j == pang.length-1)
				{
					break; //현재 반복중인 for문을 종료시킨다
				}
			}
			if(count >= 3)
			{
				System.out.println("count : "+count);
				i += count;
			}
			else
			{
				System.out.println();
			}
		}
		
	}

}
