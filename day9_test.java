package javawin01;

public class day9_test {

	public static void main(String[] args) {
		String a ="23-56+45*2-56E";
		String b = "";
		char c = ' ';
		int[] num = new int[5];
		int bn = 0; //브레이크 숫자
		int j = 0;

		for(int i = 5; ; i++)
		{
			if(bn == 1)
			{
				break;
			}
			for( ; ; j++)
			{	
				c = a.charAt(j);

				if((int)c >= 48 && (int)c <= 57)
				{
					b += c;
				}

				else
				{
					if(b != "")
					{
						num[i] = Integer.parseInt(b);
					}

					b = "";
					break;
				}
			}
		}

		for(int i = 0; i < 5; i++)
		{
			System.out.println(num[i]);
		}

	}

}
