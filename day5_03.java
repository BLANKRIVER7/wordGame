package javawin01;

public class day5_03 
{

	public static void main(String[] args) 
	{
		//하나의 for문은 하나의 기능만 하도록 구현한 예시 (입력 따로 출력 따로)
		int[] a = new int[5];
		//배열 값 입력후
		for(int i = 0; i <5; i++)
		{
			a[i] += i;
		}
		//배열 값 출력후
		for(int i = 0; i <5; i++)
		{
			System.out.print(a[i]+" ");
		}
	}

}
