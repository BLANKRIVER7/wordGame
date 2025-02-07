package javawin01;

public class day3_03 {
	public static void main(String[] args)
	{
		int[] lotto = {6,12,33,4,5,26};
		int[] lotto_sum = {0,0,0,0,0,0,};

		lotto_sum[0] = lotto[0];
		lotto_sum[1] = lotto_sum[0] + lotto[1];
		lotto_sum[2] = lotto_sum[1] + lotto[2];
		lotto_sum[3] = lotto_sum[2] + lotto[3];


		lotto[0] = lotto_sum[0];
		lotto[1] = lotto_sum[1];
		lotto[2] = lotto_sum[2];
		lotto[3] = lotto_sum[3];


		System.out.println(lotto[0]+","+lotto[1]+","+lotto[2]+","+lotto[3]+","+lotto[4]+","+lotto[5]);
	}
}
