package javawin01;

public class day3_02 {

	public static void main(String[] args) {
		// ���ڿ��� �̿��� �迭
		String[] menu = {"¥���", "����", "�쵿", "�ѽ�"};
		System.out.println("������ �޴�");
		System.out.print(menu[0]);
		System.out.print(menu[1]);
		System.out.print(menu[2]);
		System.out.print(menu[3]);
		menu[2] = "���";
		System.out.println();
		System.out.print(menu[0]);
		System.out.print(menu[1]);
		System.out.print(menu[2]);
		System.out.print(menu[3]);
	}

}
