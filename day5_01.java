package javawin01;
	   //클래스명 = 클래스 내부에는 메서드가 있다.
public class day5_01 
{
				       //메서드명(매개변수) - 용러기억!
	public static void main(String[] args) 
	{
		int a = 20;
		for(int i = 0; i < 5; i++)
		{
			System.out.println(i);
			// System.out.println(k); //변수가 선언되면 선언된 라인부터 스코프로 지정되기 때문에 error가 난다

			int k = 0;
			a += 10;
			i += 1;
		}
		a += 10;
		//i += 1; // i변수가 블록의 스코프 범위를 벗어나서 오류가 뜬다.
		//k = 20; // k변수가 블록의 스코프 범위를 벗어나서 오류가 뜬다.
		//변수가 선언되면 선언된 블록이 스코프 영역이 된다.
		
	}

}
