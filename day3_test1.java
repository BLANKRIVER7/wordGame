package javawin01;

public class day3_test1 {
	public static void main(String[] args)
	{
		int[] lotto = {6,12,33,4,5,26};


		lotto[2] = lotto[0] + lotto[1];
		lotto[3] = lotto[2] * 2;


		System.out.println(lotto[0]+","+lotto[1]+","+lotto[2]+","+lotto[3]+","+lotto[4]+","+lotto[5]);
	}
}
