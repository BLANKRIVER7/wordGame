package javawin01;

public class day3_02 {

	public static void main(String[] args) {
		// 문자열을 이용한 배열
		String[] menu = {"짜장면", "국수", "우동", "한식"};
		System.out.println("오늘의 메뉴");
		System.out.print(menu[0]);
		System.out.print(menu[1]);
		System.out.print(menu[2]);
		System.out.print(menu[3]);
		menu[2] = "돈까스";
		System.out.println();
		System.out.print(menu[0]);
		System.out.print(menu[1]);
		System.out.print(menu[2]);
		System.out.print(menu[3]);
	}

}
