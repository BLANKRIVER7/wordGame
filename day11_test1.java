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
		int cnt = 0; //같은 자릿수에 일치하는 글자 개수(연속되면 연속된 글자 개수만큼 점수에 가산한다)
		int count = 0; //연속여부 확인
		String[] random = new String[word.length];
		int[] review = new int[word.length]; //복습할 단어의 random에서의 인덱스
		int acc = 0; //정확도 점검용
		int len = 0; // 검사한 문자열의 길이의 누적 합
		int cn = 0; // 일치하는 글자들의 누적 합
		String id = ""; // 현재 로그인할 아이디
		String[] idInfo = {"","","","",""}; // player 아이디 저장
		int id_cnt = 0; //등록된 아이디 개수
		String pw = ""; // 현재 로그인할 패스워드
		String[] pwInfo = {"","","","",""}; // player 비밀번호 저장
		String pwc = ""; // 비밀번호 재확인
		boolean log_s = false; //로그인 상태
		int[] p_point = new int[idInfo.length]; // player 포인트 저장
		String choose = "";
		String choose2 = "";
		String choose3 = "";
		int idc = 0;
		int[] p_acc = new int[idInfo.length]; // player 정확도 저장
		boolean guest = false; // 게스트 여부
		int box = 0; //  순위 매기기 위한 보관용 박스
		String box2 = "";; //  순위 매기기 위한 보관용 박스
		int r_cnt = 0; //복습할 단어가 없을 때를 판단


		for(int i = 0; i < word.length; i++)
		{
			review[i] = -1;
		}
		 
		System.out.println("|--------------------------타자연습-----------------------|\n\n");
		
		System.out.print("게임을 시작하시려면 'Enter' 키를 누르세요");
		in.nextLine();

		while(true)
		{
			if(guest == true)
			{
				while(true)
				{
					System.out.println("'로그인' '회원가입' '게임진행' '게임종료' '순위보기' '점수기준' 중에 원하시는 것을 입력하세요.");
					choose3 = in.nextLine();
					System.out.println();
					
					if("로그인".equals(choose3) || "게임진행".equals(choose3) || "게임종료".equals(choose3) 
					|| "회원가입".equals(choose3) || "순위보기".equals(choose3) || "점수기준".equals(choose3))
					{
						break;
					}
					else
					{
						System.out.println("입력하신 단어가 제시된 단어와 일치하지 않습니다.");
					}		
				}

				if("로그인".equals(choose3))
				{	
					System.out.println("아이디를 입력하세요.");
					
					while(true)
					{
						id = in.nextLine();
				
						for(int i = 0; i < idInfo.length; i++)
						{
							if(id.equals(idInfo[i]))
							{
								while(true)
								{
									System.out.println("비밀번호를 입력하세요.");
									pw = in.nextLine();

									if(pw.equals(pwInfo[i]))
									{
										break;
									}
									else
									{
										System.out.println("일치하는 비밀번호가 없습니다.");
									}
								}
							}
							else if(i == idInfo.length -1)
							{
								System.out.println("일치하는 아이디가 없습니다.");
								break;	
							}
						}
						
						if(pw.equals(""))
						{
			
						}
						else
						{	
							log_s = true;
							System.out.println("성공적으로 로그인되셨습니다.");
							guest = false;
							break;
						}
					}
					continue;
				}
				else if("게임진행".equals(choose3))
				{
					System.out.println("게임을 진행합니다.");
				}
				else if("게임종료".equals(choose3))
				{
					System.out.println("게임을 종료합니다.");
					break;
				}
				if("회원가입".equals(choose3))
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
						System.out.println("더 이상 등록 가능한 공간이 없습니다.");
						System.out.println("회원가입을 종료합니다.");
						id_cnt = 0;
						continue;
					}

					for(int i = 0; i < idInfo.length; i++)
					{
						if("처음부터".equals(pwc))
						{

						}
						else
						{
							System.out.println("아이디를 입력해주세요 (등록을 그만두시려면 '끝' 이라고 입력하세요.) ");
							idInfo[i] = in.nextLine();
			
							if(idInfo[i].equals("끝"))
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
										System.out.println("이미 사용중인 아이디입니다.");
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
						
						System.out.println("비밀번호를 입력하세요");	
						pwInfo[i] = in.nextLine();	

						System.out.println("비밀번호 재확인");

						while(true)
						{
							pwc = in.nextLine();
							
							if(pwc.equals("처음부터"))
							{
								i -= 1;
								break;
							}
							else if(pwInfo[i].equals(pwc))
							{
								System.out.println("가입이 정상적으로 완료되었습니다."); 
								break;
							}
							else
							{
								System.out.println("비밀번호가 일치하지 않습니다.\n다시 입력해주세요.");
								System.out.println("다른 비밀번호로 등록하시려면 (처음부터) 라고 입력하세요");
							}	
						}
					}
					continue;
				}
				else if("순위보기".equals(choose3))
				{
					System.out.println("순위 목록");

					for(int i = 0; i < idInfo.length; i++)
					{
						System.out.println("__________________________________________________________________________");
						System.out.println("|순위 : "+i+"| 점수 : "+p_point[i]+"| 아이디 : "+idInfo[i]+" |"+" 정확도 : "+p_acc[i]+"% |");
					}
				}
				else if("점수기준".equals(choose3))
				{
					System.out.println("1.제시된 단어와 글자수가 다르면 0점 입니다.");
					System.out.println("2.제시된 단어와 똑같이 입력하시면 2점을 드립니다.");
					System.out.println("3.제시된 단어와 길이는 같은데 같은 글자 위치에 일치하는 단어가");
					System.out.println("단어의 길이의 절반 이상이면 부분점수로 1점을 드립니다.");
					System.out.println("4.제시된 단어와 길이는 같은데 같은 글자 위치에 일치하는 단어가");
					System.out.println("단어의 길이의 절반 이하이면 점수가 없습니다.");
					System.out.println("5.연속해서 맞추시면 연속해서 맞추신 단어의 개수만큼 가산점이 들어갑니다\n");
					System.out.println("\n그만 보시려면 'Enter' 키를 누르세요.");
					in.nextLine();
					continue;
				}

			}
			else if(log_s == false)
			{
				while(true)
				{
					System.out.println("'회원가입' '로그인' '게스트' '게임종료' '순위보기' '점수기준' 중에 원하시는 것을 입력하세요.");
					choose = in.nextLine();
					System.out.println();
					
					if("회원가입".equals(choose) || "로그인".equals(choose) || "게스트".equals(choose) 
					|| "게임종료".equals(choose) || "순위보기".equals(choose) || "점수기준".equals(choose))
					{
						break;
					}
					else
					{
						System.out.println("입력하신 단어가 제시된 단어와 일치하지 않습니다.");
					}		
				}
				
				if("회원가입".equals(choose))
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
						System.out.println("더 이상 등록 가능한 공간이 없습니다.");
						System.out.println("회원가입을 종료합니다.");
						id_cnt = 0;
						continue;
					}

					for(int i = 0; i < idInfo.length; i++)
					{
						if("처음부터".equals(pwc))
						{

						}
						else
						{
							System.out.println("아이디를 입력해주세요 (등록을 그만두시려면 '끝' 이라고 입력하세요.) ");
							idInfo[i] = in.nextLine();

							if(idInfo[i].equals("끝"))
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
										System.out.println("이미 사용중인 아이디입니다.");
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
						
						System.out.println("비밀번호를 입력하세요");	
						pwInfo[i] = in.nextLine();

						System.out.println("비밀번호 재확인");	

						while(true)
						{
							pwc = in.nextLine();
							
							if(pwc.equals("처음부터"))
							{
								i -= 1;
								break;
							}
							else if(pwInfo[i].equals(pwc))
							{
								System.out.println("가입이 정상적으로 완료되었습니다."); 
								break;
							}
							else
							{
								System.out.println("비밀번호가 일치하지 않습니다.\n다시 입력해주세요.");
								System.out.println("다른 비밀번호로 등록하시려면 (처음부터) 라고 입력하세요");
							}	
						}
					}
					continue;
				}
				else if("로그인".equals(choose))
				{	
					System.out.println("아이디를 입력하세요.");
					
					while(true)
					{
						id = in.nextLine();
				
						for(int i = 0; i < idInfo.length; i++)
						{
							if(id.equals(idInfo[i]))
							{
								while(true)
								{
									System.out.println("비밀번호를 입력하세요.");
									pw = in.nextLine();

									if(pw.equals(pwInfo[i]))
									{
										break;
									}
									else
									{
										System.out.println("일치하는 비밀번호가 없습니다.");
									}
								}
							}
							else if(i == idInfo.length -1)
							{
								System.out.println("일치하는 아이디가 없습니다.");
								break;	
							}
						}
						
						if(pw.equals(""))
						{
			
						}
						else
						{	
							log_s = true;
							System.out.println("성공적으로 로그인되셨습니다.");
							guest = false;
							break;
						}
					}
					continue;
				}
				else if("게스트".equals(choose))
				{
					guest = true;
					System.out.println("게스트로 시작합니다.");
				}
				else if("게임종료".equals(choose))
				{
					System.out.println("게임을 종료합니다.");
					break;
				}
				else if("순위보기".equals(choose))
				{
					System.out.println("순위 목록");

					for(int i = 0; i < idInfo.length; i++)
					{
						System.out.println("__________________________________________________________________________");
						System.out.println("|순위 : "+i+"| 점수 : "+p_point[i]+"| 아이디 : "+idInfo[i]+" |"+" 정확도 : "+p_acc[i]+"% |");
					}
				}
				else if("점수기준".equals(choose))
				{
					System.out.println("1.제시된 단어와 글자수가 다르면 0점 입니다.");
					System.out.println("2.제시된 단어와 똑같이 입력하시면 2점을 드립니다.");
					System.out.println("3.제시된 단어와 길이는 같은데 같은 글자 위치에 일치하는 단어가");
					System.out.println("단어의 길이의 절반 이상이면 부분점수로 1점을 드립니다.");
					System.out.println("4.제시된 단어와 길이는 같은데 같은 글자 위치에 일치하는 단어가");
					System.out.println("단어의 길이의 절반 이하이면 점수가 없습니다.");
					System.out.println("5.연속해서 맞추시면 연속해서 맞추신 단어의 개수만큼 가산점이 들어갑니다\n");
					System.out.println("\n그만 보시려면 'Enter' 키를 누르세요.");
					in.nextLine();
					continue;
				}	

			}
			else
			{
				while(true)
				{
					System.out.println("'로그아웃' '게임진행' '게임종료' '순위보기' '점수기준' 중에 원하시는 것을 입력하세요.");
					choose2 = in.nextLine();
					System.out.println();
					
					if("로그아웃".equals(choose2) || "게임진행".equals(choose2) || "게임종료".equals(choose2)
					|| "순위보기".equals(choose2) || "점수기준".equals(choose2))
					{
						break;
					}
					else
					{
						System.out.println("입력하신 단어가 제시된 단어와 일치하지 않습니다.");
					}		
				}

				if("로그아웃".equals(choose2))
				{
					System.out.println("로그아웃합니다.");
				
					id = "";
					pw = "";
					log_s = false;

					System.out.println("성공적으로 로그아웃 되셨습니다.");

					continue;
				}
				else if("게임종료".equals(choose2))
				{
					System.out.println("게임을 종료합니다.");
					break;
				}
				else if("게임진행".equals(choose2))
				{
					System.out.println("게임을 진행합니다.");
				}
				else if("순위보기".equals(choose2))
				{
					System.out.println("순위 목록");

					for(int i = 0; i < idInfo.length; i++)
					{
						System.out.println("__________________________________________________________________________");
						System.out.println("|순위 : "+i+"| 점수 : "+p_point[i]+"| 아이디 : "+idInfo[i]+" |"+" 정확도 : "+p_acc[i]+"% |");
					}
				}
				else if("점수기준".equals(choose2))
				{
					System.out.println("1.제시된 단어와 글자수가 다르면 0점 입니다.");
					System.out.println("2.제시된 단어와 똑같이 입력하시면 2점을 드립니다.");
					System.out.println("3.제시된 단어와 길이는 같은데 같은 글자 위치에 일치하는 단어가");
					System.out.println("단어의 길이의 절반 이상이면 부분점수로 1점을 드립니다.");
					System.out.println("4.제시된 단어와 길이는 같은데 같은 글자 위치에 일치하는 단어가");
					System.out.println("단어의 길이의 절반 이하이면 점수가 없습니다.");
					System.out.println("5.연속해서 맞추시면 연속해서 맞추신 단어의 개수만큼 가산점이 들어갑니다\n");
					System.out.println("\n그만 보시려면 'Enter' 키를 누르세요.");
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

				System.out.println("다음 단어를 입력하세요. : "+random[i]);
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

				System.out.println("당신의 점수 :"+point+" | 당신의 정확도 : "+acc+"%");
			}

			len = 0;	

			System.out.println("\n\n당신의 총 점수 : "+point+" | 당신의 총 정확도 : "+acc+"%");
			
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
			
			System.out.println("복습할 단어 목록을 확인하시겠습니까? (예 또는 아니요)");

			String answer = "";

			while(true)
			{
				answer = in.nextLine();

				if(answer.equals("예") || answer.equals("아니요"))
				{
					if(answer.equals("예"))
					{
						System.out.print("당신이 복습해야 할 단어 목록 :  ");
						
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
							System.out.println("복습하실 단어가 없습니다.");
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
					System.out.println("다시 입력해 주세요 (예 또는 아니요)");
				}
			}

			System.out.println();

		}


	}
}

