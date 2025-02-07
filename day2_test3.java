package javawin01;

public class day2_test3 {

	public static void main(String[] args) {
		float pointJava = 10;// int를 float로 수정했더니 avg 값이 소숫점으로 출력됨
		int pointOracle = 50;
		int pointMaria = 80;
		
		float avg = 0;
		avg = (pointJava+pointOracle+pointMaria)/3;
		System.out.println(avg);
	}

}
