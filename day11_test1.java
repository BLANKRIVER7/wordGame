package javawin01;

import java.util.Random;
import java.util.Scanner;

public class day11_test1 {

	public static void main(String[] args) {
		Random r = new Random();
		Scanner in = new Scanner(System.in);

		String[] word = {"apple","banana","circle","date","egg","fox","gum","hat","idle","jam"};
		String input = "";
		int point = 0;
		int cnt = 0; //���� �ڸ����� ��ġ�ϴ� ���� ����(���ӵǸ� ���ӵ� ���� ������ŭ ������ �����Ѵ�)
		int count = 0; //���ӿ��� Ȯ��
		String[] random = new String[word.length];
		int[] review = new int[word.length]; //������ �ܾ��� random������ �ε���
		int acc = 0; //��Ȯ�� ���˿�
		int len = 0; // �˻��� ���ڿ��� ������ ���� ��
		int cn = 0; // ��ġ�ϴ� ���ڵ��� ���� ��
		String id = ""; // ���� �α����� ���̵�
		String[] idInfo = {"","","","",""}; // player ���̵� ����
		int id_cnt = 0; //��ϵ� ���̵� ����
		String pw = ""; // ���� �α����� �н�����
		String[] pwInfo = {"","","","",""}; // player ��й�ȣ ����
		String pwc = ""; // ��й�ȣ ��Ȯ��
		boolean log_s = false; //�α��� ����
		int[] p_point = new int[idInfo.length]; // player ����Ʈ ����
		String choose = "";
		String choose2 = "";
		String choose3 = "";
		int idc = 0;
		int[] p_acc = new int[idInfo.length]; // player ��Ȯ�� ����
		boolean guest = false; // �Խ�Ʈ ����
		int box = 0; //  ���� �ű�� ���� ������ �ڽ�
		String box2 = "";; //  ���� �ű�� ���� ������ �ڽ�
		int r_cnt = 0; //������ �ܾ ���� ���� �Ǵ�


		for(int i = 0; i < word.length; i++)
		{
			review[i] = -1;
		}
		 
		System.out.println("|--------------------------Ÿ�ڿ���-----------------------|\n\n");
		
		System.out.print("������ �����Ͻ÷��� 'Enter' Ű�� ��������");
		in.nextLine();

		while(true)
		{
			if(guest == true)
			{
				while(true)
				{
					System.out.println("'�α���' 'ȸ������' '��������' '��������' '��������' '��������' �߿� ���Ͻô� ���� �Է��ϼ���.");
					choose3 = in.nextLine();
					System.out.println();
					
					if("�α���".equals(choose3) || "��������".equals(choose3) || "��������".equals(choose3) 
					|| "ȸ������".equals(choose3) || "��������".equals(choose3) || "��������".equals(choose3))
					{
						break;
					}
					else
					{
						System.out.println("�Է��Ͻ� �ܾ ���õ� �ܾ�� ��ġ���� �ʽ��ϴ�.");
					}		
				}

				if("�α���".equals(choose3))
				{	
					System.out.println("���̵� �Է��ϼ���.");
					
					while(true)
					{
						id = in.nextLine();
				
						for(int i = 0; i < idInfo.length; i++)
						{
							if(id.equals(idInfo[i]))
							{
								while(true)
								{
									System.out.println("��й�ȣ�� �Է��ϼ���.");
									pw = in.nextLine();

									if(pw.equals(pwInfo[i]))
									{
										break;
									}
									else
									{
										System.out.println("��ġ�ϴ� ��й�ȣ�� �����ϴ�.");
									}
								}
							}
							else if(i == idInfo.length -1)
							{
								System.out.println("��ġ�ϴ� ���̵� �����ϴ�.");
								break;	
							}
						}
						
						if(pw.equals(""))
						{
			
						}
						else
						{	
							log_s = true;
							System.out.println("���������� �α��εǼ̽��ϴ�.");
							guest = false;
							break;
						}
					}
					continue;
				}
				else if("��������".equals(choose3))
				{
					System.out.println("������ �����մϴ�.");
				}
				else if("��������".equals(choose3))
				{
					System.out.println("������ �����մϴ�.");
					break;
				}
				if("ȸ������".equals(choose3))
				{	
					for(int i = 0; i < idInfo.length; i++)
					{
						if(idInfo[i].equals(""))
						{

						}
						else
						{
							id_cnt++;

						}
					}

					if(id_cnt == idInfo.length)
					{
						System.out.println("�� �̻� ��� ������ ������ �����ϴ�.");
						System.out.println("ȸ�������� �����մϴ�.");
						id_cnt = 0;
						continue;
					}

					for(int i = 0; i < idInfo.length; i++)
					{
						if("ó������".equals(pwc))
						{

						}
						else
						{
							System.out.println("���̵� �Է����ּ��� (����� �׸��ν÷��� '��' �̶�� �Է��ϼ���.) ");
							idInfo[i] = in.nextLine();
			
							if(idInfo[i].equals("��"))
							{
								idInfo[i] = "";
								break;
							}
						
							for(int j = 0; j < idInfo.length; j++)
							{
								if(i != j)
								{
									if(idInfo[i].equals(idInfo[j]))
									{
										System.out.println("�̹� ������� ���̵��Դϴ�.");
										idInfo[i] = "";
										idc = 1;
										break;
									}
									else
									{
										
									}
								}
							}
						}
						if(idc == 1)
						{
							i -= 1;
							idc = 0;
							continue;
						}
						
						System.out.println("��й�ȣ�� �Է��ϼ���");	
						pwInfo[i] = in.nextLine();	

						System.out.println("��й�ȣ ��Ȯ��");

						while(true)
						{
							pwc = in.nextLine();
							
							if(pwc.equals("ó������"))
							{
								i -= 1;
								break;
							}
							else if(pwInfo[i].equals(pwc))
							{
								System.out.println("������ ���������� �Ϸ�Ǿ����ϴ�."); 
								break;
							}
							else
							{
								System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.\n�ٽ� �Է����ּ���.");
								System.out.println("�ٸ� ��й�ȣ�� ����Ͻ÷��� (ó������) ��� �Է��ϼ���");
							}	
						}
					}
					continue;
				}
				else if("��������".equals(choose3))
				{
					System.out.println("���� ���");

					for(int i = 0; i < idInfo.length; i++)
					{
						System.out.println("__________________________________________________________________________");
						System.out.println("|���� : "+i+"| ���� : "+p_point[i]+"| ���̵� : "+idInfo[i]+" |"+" ��Ȯ�� : "+p_acc[i]+"% |");
					}
				}
				else if("��������".equals(choose3))
				{
					System.out.println("1.���õ� �ܾ�� ���ڼ��� �ٸ��� 0�� �Դϴ�.");
					System.out.println("2.���õ� �ܾ�� �Ȱ��� �Է��Ͻø� 2���� �帳�ϴ�.");
					System.out.println("3.���õ� �ܾ�� ���̴� ������ ���� ���� ��ġ�� ��ġ�ϴ� �ܾ");
					System.out.println("�ܾ��� ������ ���� �̻��̸� �κ������� 1���� �帳�ϴ�.");
					System.out.println("4.���õ� �ܾ�� ���̴� ������ ���� ���� ��ġ�� ��ġ�ϴ� �ܾ");
					System.out.println("�ܾ��� ������ ���� �����̸� ������ �����ϴ�.");
					System.out.println("5.�����ؼ� ���߽ø� �����ؼ� ���߽� �ܾ��� ������ŭ �������� ���ϴ�\n");
					System.out.println("\n�׸� ���÷��� 'Enter' Ű�� ��������.");
					in.nextLine();
					continue;
				}

			}
			else if(log_s == false)
			{
				while(true)
				{
					System.out.println("'ȸ������' '�α���' '�Խ�Ʈ' '��������' '��������' '��������' �߿� ���Ͻô� ���� �Է��ϼ���.");
					choose = in.nextLine();
					System.out.println();
					
					if("ȸ������".equals(choose) || "�α���".equals(choose) || "�Խ�Ʈ".equals(choose) 
					|| "��������".equals(choose) || "��������".equals(choose) || "��������".equals(choose))
					{
						break;
					}
					else
					{
						System.out.println("�Է��Ͻ� �ܾ ���õ� �ܾ�� ��ġ���� �ʽ��ϴ�.");
					}		
				}
				
				if("ȸ������".equals(choose))
				{	
					for(int i = 0; i < idInfo.length; i++)
					{
						if(idInfo[i].equals(""))
						{
							
						}
						else
						{
							id_cnt++;
						}
					}

					if(id_cnt == idInfo.length)
					{
						System.out.println("�� �̻� ��� ������ ������ �����ϴ�.");
						System.out.println("ȸ�������� �����մϴ�.");
						id_cnt = 0;
						continue;
					}

					for(int i = 0; i < idInfo.length; i++)
					{
						if("ó������".equals(pwc))
						{

						}
						else
						{
							System.out.println("���̵� �Է����ּ��� (����� �׸��ν÷��� '��' �̶�� �Է��ϼ���.) ");
							idInfo[i] = in.nextLine();

							if(idInfo[i].equals("��"))
							{
								idInfo[i] = "";
								break;
							}
					
							for(int j = 0; j < idInfo.length; j++)
							{
								if(i != j)
								{
									if(idInfo[i].equals(idInfo[j]))
									{
										System.out.println("�̹� ������� ���̵��Դϴ�.");
										idInfo[i] = "";
										idc = 1;
										break;
									}
									else
									{
										
									}
								}
							}
						}
						if(idc == 1)
						{
							i -= 1;
							idc = 0;
							continue;
						}
						
						System.out.println("��й�ȣ�� �Է��ϼ���");	
						pwInfo[i] = in.nextLine();

						System.out.println("��й�ȣ ��Ȯ��");	

						while(true)
						{
							pwc = in.nextLine();
							
							if(pwc.equals("ó������"))
							{
								i -= 1;
								break;
							}
							else if(pwInfo[i].equals(pwc))
							{
								System.out.println("������ ���������� �Ϸ�Ǿ����ϴ�."); 
								break;
							}
							else
							{
								System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.\n�ٽ� �Է����ּ���.");
								System.out.println("�ٸ� ��й�ȣ�� ����Ͻ÷��� (ó������) ��� �Է��ϼ���");
							}	
						}
					}
					continue;
				}
				else if("�α���".equals(choose))
				{	
					System.out.println("���̵� �Է��ϼ���.");
					
					while(true)
					{
						id = in.nextLine();
				
						for(int i = 0; i < idInfo.length; i++)
						{
							if(id.equals(idInfo[i]))
							{
								while(true)
								{
									System.out.println("��й�ȣ�� �Է��ϼ���.");
									pw = in.nextLine();

									if(pw.equals(pwInfo[i]))
									{
										break;
									}
									else
									{
										System.out.println("��ġ�ϴ� ��й�ȣ�� �����ϴ�.");
									}
								}
							}
							else if(i == idInfo.length -1)
							{
								System.out.println("��ġ�ϴ� ���̵� �����ϴ�.");
								break;	
							}
						}
						
						if(pw.equals(""))
						{
			
						}
						else
						{	
							log_s = true;
							System.out.println("���������� �α��εǼ̽��ϴ�.");
							guest = false;
							break;
						}
					}
					continue;
				}
				else if("�Խ�Ʈ".equals(choose))
				{
					guest = true;
					System.out.println("�Խ�Ʈ�� �����մϴ�.");
				}
				else if("��������".equals(choose))
				{
					System.out.println("������ �����մϴ�.");
					break;
				}
				else if("��������".equals(choose))
				{
					System.out.println("���� ���");

					for(int i = 0; i < idInfo.length; i++)
					{
						System.out.println("__________________________________________________________________________");
						System.out.println("|���� : "+i+"| ���� : "+p_point[i]+"| ���̵� : "+idInfo[i]+" |"+" ��Ȯ�� : "+p_acc[i]+"% |");
					}
				}
				else if("��������".equals(choose))
				{
					System.out.println("1.���õ� �ܾ�� ���ڼ��� �ٸ��� 0�� �Դϴ�.");
					System.out.println("2.���õ� �ܾ�� �Ȱ��� �Է��Ͻø� 2���� �帳�ϴ�.");
					System.out.println("3.���õ� �ܾ�� ���̴� ������ ���� ���� ��ġ�� ��ġ�ϴ� �ܾ");
					System.out.println("�ܾ��� ������ ���� �̻��̸� �κ������� 1���� �帳�ϴ�.");
					System.out.println("4.���õ� �ܾ�� ���̴� ������ ���� ���� ��ġ�� ��ġ�ϴ� �ܾ");
					System.out.println("�ܾ��� ������ ���� �����̸� ������ �����ϴ�.");
					System.out.println("5.�����ؼ� ���߽ø� �����ؼ� ���߽� �ܾ��� ������ŭ �������� ���ϴ�\n");
					System.out.println("\n�׸� ���÷��� 'Enter' Ű�� ��������.");
					in.nextLine();
					continue;
				}	

			}
			else
			{
				while(true)
				{
					System.out.println("'�α׾ƿ�' '��������' '��������' '��������' '��������' �߿� ���Ͻô� ���� �Է��ϼ���.");
					choose2 = in.nextLine();
					System.out.println();
					
					if("�α׾ƿ�".equals(choose2) || "��������".equals(choose2) || "��������".equals(choose2)
					|| "��������".equals(choose2) || "��������".equals(choose2))
					{
						break;
					}
					else
					{
						System.out.println("�Է��Ͻ� �ܾ ���õ� �ܾ�� ��ġ���� �ʽ��ϴ�.");
					}		
				}

				if("�α׾ƿ�".equals(choose2))
				{
					System.out.println("�α׾ƿ��մϴ�.");
				
					id = "";
					pw = "";
					log_s = false;

					System.out.println("���������� �α׾ƿ� �Ǽ̽��ϴ�.");

					continue;
				}
				else if("��������".equals(choose2))
				{
					System.out.println("������ �����մϴ�.");
					break;
				}
				else if("��������".equals(choose2))
				{
					System.out.println("������ �����մϴ�.");
				}
				else if("��������".equals(choose2))
				{
					System.out.println("���� ���");

					for(int i = 0; i < idInfo.length; i++)
					{
						System.out.println("__________________________________________________________________________");
						System.out.println("|���� : "+i+"| ���� : "+p_point[i]+"| ���̵� : "+idInfo[i]+" |"+" ��Ȯ�� : "+p_acc[i]+"% |");
					}
				}
				else if("��������".equals(choose2))
				{
					System.out.println("1.���õ� �ܾ�� ���ڼ��� �ٸ��� 0�� �Դϴ�.");
					System.out.println("2.���õ� �ܾ�� �Ȱ��� �Է��Ͻø� 2���� �帳�ϴ�.");
					System.out.println("3.���õ� �ܾ�� ���̴� ������ ���� ���� ��ġ�� ��ġ�ϴ� �ܾ");
					System.out.println("�ܾ��� ������ ���� �̻��̸� �κ������� 1���� �帳�ϴ�.");
					System.out.println("4.���õ� �ܾ�� ���̴� ������ ���� ���� ��ġ�� ��ġ�ϴ� �ܾ");
					System.out.println("�ܾ��� ������ ���� �����̸� ������ �����ϴ�.");
					System.out.println("5.�����ؼ� ���߽ø� �����ؼ� ���߽� �ܾ��� ������ŭ �������� ���ϴ�\n");
					System.out.println("\n�׸� ���÷��� 'Enter' Ű�� ��������.");
					in.nextLine();
					continue;
				}
			}

			for(int i = 0, n = 0, a = 0; i < word.length; i++)
			{
				acc = 0;

				random[i] = word[r.nextInt(10)];

				for(int j = 0; j < i; j++)
				{
					if(i != j)
					{
						if(random[i].equals(random[j]))
						{
							a = 1;
							break;
						}
					} 
				}

				if(a == 1)
				{
					a = 0;
					i -= 1;
					continue;
				}

				System.out.println("���� �ܾ �Է��ϼ���. : "+random[i]);
				input = in.nextLine();
			
				len += random[i].length();

				if(random[i].equals(input))
				{
					point += 2;
					cn += random[i].length();
					if(count != 0)
					{
						point += count+1;
					}
					count++;
				}
				else if(random[i].length() == input.length())
				{
					review[n] = i;
					n++;

					for(int j = 0; j < random[i].length(); j++)
					{
						if(random[i].charAt(j) == input.charAt(j))
						{
							cnt++;
						}
					}	

					cn += cnt;

					if(cnt >= ((float)random[i].length()/2)+0.5)
					{
						point += 1;
						cnt = 0;
					}

					cnt = 0;
					count = 0;
				}
				else
				{
					review[n] = i;
					n++;
				}
				
				acc = 100*cn/len;

				System.out.println("����� ���� :"+point+" | ����� ��Ȯ�� : "+acc+"%");
			}

			len = 0;	

			System.out.println("\n\n����� �� ���� : "+point+" | ����� �� ��Ȯ�� : "+acc+"%");
			
			for(int i = 0; i < idInfo.length; i++)
			{
				if(id.equals(idInfo[i]))
				{
					if(point > p_point[i])
					{
						p_point[i] = point;
					}
					if(acc > p_acc[i])
					{
						p_acc[i] = acc;
					}
				}
			}

			
			for(int i = 0; i < idInfo.length; i++)
			{
				for(int j = i+1; j < idInfo.length; j++ )
				{
					if(p_point[i] < p_point[j])
					{
						box2 = idInfo[i];
						idInfo[i] = idInfo[j];
						idInfo[j] = box2;

						box2 = pwInfo[i];
						pwInfo[i] = pwInfo[j];
						pwInfo[j] = box2;
						
						box = p_point[i];
						p_point[i] = p_point[j];
						p_point[j] = box;
						
						box = p_acc[i];
						p_acc[i] = p_acc[j];
						p_acc[j] = box;
					}
				}
			}

			point = 0;
			
			System.out.println("������ �ܾ� ����� Ȯ���Ͻðڽ��ϱ�? (�� �Ǵ� �ƴϿ�)");

			String answer = "";

			while(true)
			{
				answer = in.nextLine();

				if(answer.equals("��") || answer.equals("�ƴϿ�"))
				{
					if(answer.equals("��"))
					{
						System.out.print("����� �����ؾ� �� �ܾ� ��� :  ");
						
						for(int i = 0; i < word.length; i++)
						{
							if(review[i] == -1)
							{
								
							}
							else
							{
								r_cnt++;
							}
						}
						
						if(r_cnt == 0)
						{	
							System.out.println("�����Ͻ� �ܾ �����ϴ�.");
							break;
						}
						else
						{
							r_cnt = 0;
						}	
			
						for(int i = 0; i < word.length ; i++)
						{
							if(review[i] == -1)
							{
								break;
							}
				
							System.out.print(random[review[i]]+"  ");
						}
					
						break;				
					}
					else
					{
						break;
					}
				}
				else
				{
					System.out.println("�ٽ� �Է��� �ּ��� (�� �Ǵ� �ƴϿ�)");
				}
			}

			System.out.println();

		}


	}
}

