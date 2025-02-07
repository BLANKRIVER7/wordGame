package javawin01;

public class day02 {

	public static void main(String[] args) {
		//1번 문제 영수와 철수는 각각 기본 점수 100점을 가지고 있다
		int pointy = 100; int pointc = 100;
		//2번 문제 철수가 2번 이겼다
		//한 번 이겼을시
		pointy = pointy-10; 
		pointc = pointc+10;
		//한 번 더 이겼을시
		pointy = pointy-10; 
		pointc = pointc+10;
		//3번 문제 비겼다
		pointy = pointy+2; 
		pointc = pointc+2;
		//4번 문제 영수가 1번 이겼다
		pointy = pointy+10; pointc = pointc-10;
		//5번 문제 최종 점수를 출력하시오
		System.out.println("영수의 점수"+pointy); 
		System.out.println("철수의 점수"+pointc);
	}

}
