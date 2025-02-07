/*
클래스 명 : Day05
문제
철수는 수학공부를 하고 있다. 숫자가 3234있다면 3+2+3+4의 결과값을 구하는 문제이다.
위 시나리오를 코드로 작성하여
숫자값에 따른 결과값을 구하시오. 

1. 철수가 선택한 숫자는 56773이다.  
2. 모든 숫자의 합을 구한다. 
*/
/*
package javawin01;
//내가 쓴 코드
public class day05 {

	public static void main(String[] args) {
		int a = 5;
		int b = 6;
		int c = 7;
		int d = 7;
		int e = 3;
		int sum = a+b+c+d+e;

		System.out.println("모든 숫자의 합은 : "+sum);
	}

}*/
//더 좋은 코드
package javawin01;

public class day05 {

public static void main(String[] args) {
	int num = 56773;
	int sum = 0;
	sum += num%10;
	num = num/10; 
	sum += num%10;
	num = num/10; 
	sum += num%10;
	num = num/10; 
	sum += num%10;
	num = num/10; 
	sum += num%10;
	
	System.out.println("모든 숫자의 합은 : "+sum);
	}

}
