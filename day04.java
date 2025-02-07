/*
클래스 명 : Day04
산술 연산자는 + - * / %가 있고 예제는 다음과 같다
 4+2   결과는 6
 4/2    결과는 2
 5%2   결과는 1
 5%3   결과는 2

문제 : 철수는 3개의 숫자의 평균을 구하려고 한다. (*변수는 적게 사용하세요)

1. 철수가 87을 선택했다.
2. 철수가 76을 선택했다.
3. 철수가 69를 선택했다.
4. 평균을 구한다.
*/
/*
package javawin01;
//내가 쓴 코드
public class day04 {

	public static void main(String[] args) {
		int ch_num = 87;
		int sum = ch_num;
		ch_num = 76;
		sum += ch_num;
		ch_num = 69;
		sum += ch_num;
		int ch_avg = sum/3;
		
		System.out.println("평균은 : "+ch_avg);
	}

}*/
//더 좋은 코드
package javawin01;

public class day04 {

	public static void main(String[] args) {
		int ch_num = 87;
		ch_num += 76;
		ch_num += 69;
		ch_num = ch_num/3;
		
		System.out.println("평균은 : "+ch_num);
	}

}

