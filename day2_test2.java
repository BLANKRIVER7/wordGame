package javawin01;

public class day2_test2 {

	public static void main(String[] args) {
		int b = 10;
		int c = 4;

		double e = b/c;
		int g = b/c;
		double h = b/(double)c;
		System.out.println(e);
		System.out.println(g);
		System.out.println(h);
	}

	/*해설:
	
	b변수를 선언하고
	b변수는 자료형이 int이다
	초기값 상수 10을 대입하여 저장했다

	int d = b/c
	d변수를 선언하고 자료형은 int이다
	초기값으로 b/c 결과를 대입하여 저장한다
	b.c 연산은 정수/정수 연산이므로
	결과과 정수이다. 결과값은 2이다

	double h = b/(double)c;
	h변수를 선언하고 자료형은 더블이다. 
	실수 초기값은 b/(double)e 의 결과를 대입하여 저장
	b/(double)c 연산은 캐스팅 부터 일어난다
	정수/실수의 연산인데 타입을 맞추기 위해 정수 부분이 묵시적 형 변환이 일어나서
	실수/실수가 된다
	실수의 나누기 연산인 결과값 2.5가 괸다.
	이 결과 값을 h변수에 대입하여 저장한다 */

}

