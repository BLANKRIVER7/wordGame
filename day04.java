/*
Ŭ���� �� : Day04
��� �����ڴ� + - * / %�� �ְ� ������ ������ ����
 4+2   ����� 6
 4/2    ����� 2
 5%2   ����� 1
 5%3   ����� 2

���� : ö���� 3���� ������ ����� ���Ϸ��� �Ѵ�. (*������ ���� ����ϼ���)

1. ö���� 87�� �����ߴ�.
2. ö���� 76�� �����ߴ�.
3. ö���� 69�� �����ߴ�.
4. ����� ���Ѵ�.
*/
/*
package javawin01;
//���� �� �ڵ�
public class day04 {

	public static void main(String[] args) {
		int ch_num = 87;
		int sum = ch_num;
		ch_num = 76;
		sum += ch_num;
		ch_num = 69;
		sum += ch_num;
		int ch_avg = sum/3;
		
		System.out.println("����� : "+ch_avg);
	}

}*/
//�� ���� �ڵ�
package javawin01;

public class day04 {

	public static void main(String[] args) {
		int ch_num = 87;
		ch_num += 76;
		ch_num += 69;
		ch_num = ch_num/3;
		
		System.out.println("����� : "+ch_num);
	}

}

