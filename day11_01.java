package javawin01;

public class day11_01 {

	public static void main(String[] args) {
		int a = 10;
		int b = 10;
		if(a == b)
		{
			System.out.println("같다");
		}
		String aa = new String("kim");
		String bb = new String("kim");
		
		System.out.println(aa.length()+"<");
		System.out.println(aa.indexOf("im")+"<<"); 
		//indexOf() 메서드의 인수와 같은 부분의 시작 위치 인덱스를 가져온다.
		
		if(aa == bb)
		{
			System.out.println("같다2");
		}
		if(aa.equals(bb))
		{
			System.out.println("같다3");
		}
	}

}
