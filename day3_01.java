package javawin01;

public class day3_01 {

	public static void main(String[] args) 
	{
		//배열 특징 : 연속적으로 할당한다, 고정 길이이다.
		//참조 변수명, 길이(인덱스), value를 먼저 분석한다.
		//선언
		int[] a = new int[4];
		System.out.println("길이 : "+a.length);
		System.out.println("초기값 : "+a[0]);
		a[0] = 40;
		a[3] = 60;
		System.out.println(a[0]+"/"+a[1]+"/"+a[2]+"/"+a[3]);
		//배열의 인덱스 범위를 벗어나면 예외가 발생한다. ex)아래와 같은 경우
		//a[4] = 70;
	}

}
