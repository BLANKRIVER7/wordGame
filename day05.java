/*
Ŭ���� �� : Day05
����
ö���� ���а��θ� �ϰ� �ִ�. ���ڰ� 3234�ִٸ� 3+2+3+4�� ������� ���ϴ� �����̴�.
�� �ó������� �ڵ�� �ۼ��Ͽ�
���ڰ��� ���� ������� ���Ͻÿ�. 

1. ö���� ������ ���ڴ� 56773�̴�.  
2. ��� ������ ���� ���Ѵ�. 
*/
/*
package javawin01;
//���� �� �ڵ�
public class day05 {

	public static void main(String[] args) {
		int a = 5;
		int b = 6;
		int c = 7;
		int d = 7;
		int e = 3;
		int sum = a+b+c+d+e;

		System.out.println("��� ������ ���� : "+sum);
	}

}*/
//�� ���� �ڵ�
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
	
	System.out.println("��� ������ ���� : "+sum);
	}

}
