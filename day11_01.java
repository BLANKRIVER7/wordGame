package javawin01;

public class day11_01 {

	public static void main(String[] args) {
		int a = 10;
		int b = 10;
		if(a == b)
		{
			System.out.println("����");
		}
		String aa = new String("kim");
		String bb = new String("kim");
		
		System.out.println(aa.length()+"<");
		System.out.println(aa.indexOf("im")+"<<"); 
		//indexOf() �޼����� �μ��� ���� �κ��� ���� ��ġ �ε����� �����´�.
		
		if(aa == bb)
		{
			System.out.println("����2");
		}
		if(aa.equals(bb))
		{
			System.out.println("����3");
		}
	}

}
