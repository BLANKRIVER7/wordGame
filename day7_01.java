package javawin01;

import java.util.Random;

public class day7_01 
{

	public static void main(String[] args) 
	{
		// r.nextInt 테스트 코드
		Random r = new Random();
		/*for(int i = 0; i < 10; i++)
		{
			System.out.println(r.nextInt(5)+1);
		}*/
		//테스트 결과 로또 번호를 출력하는 코드는  r.nextInt(45) + 1로  만들 수 있다.
		int[] lotto = new int[7];
		//베열 생성 확인 테스트 코드 
		/*for(int i = 0; i < 7; i++)
		{
			System.out.println(i+"/"+lotto[i]);
		}*/
		//로또 번호를 하나 뽑아서 배열에 저장하기 과정
		int a = r.nextInt(45)+1;
		//베열에 저장
		lotto[0] = a;
		//반복될 코드를 파악하고 그걸 for문에 적용시킨다
		for(int i = 0; i< 7; i++)
		{
			//로또 번호를 하나 뽑아서 변수에 저장
			int b = r.nextInt(45)+1;
			//배열에 저장
			lotto[i] = b;
		}
		//로또 버호 출력
		for(int i = 0; i < 7; i++)
		{
			System.out.println(lotto[i]);
		}
	}
}
