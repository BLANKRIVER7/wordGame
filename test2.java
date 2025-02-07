package javawin01;

import java.util.Scanner;

public class test2
{
      public static void main(String[] args) 
      {
       Scanner in = new Scanner(System.in);
       int[] count= {0,0,0,0,0};
       int[] price = {8000,9000,7000,10000,12000};
       int[] num = {0,0,0};
       int[] cnt = {0,0,0,0,0};
       
      String[] menu = {"1.짜장면","2.짬뽕","3.볶음밥","4.탕수육","5.간짜장"};
      System.out.println("메뉴를 숫자로 선택하세요 999를 입력시 종료됩니다");      
      
      for(int i = 0; i < 3; i++) 
      {
        System.out.println(menu[0]+","+menu[1]+","+menu[2]+","+menu[3]+","+menu[4]);
         num[i] = in.nextInt();
         if(num[i] == 999) 
         {
           num[i] = 0;
           
            break;
         }
         else
         {
           System.out.println("수량을 입력하세요.");
           count[num[i]-1] += in.nextInt();
         }
      }
     
      for(int i = 0; i < 3; i++) 
      {
         if(num[i]-1 != -1)
         {
            if(cnt[num[i]-1] != 0)
            {
               
            }
            else if(count[num[i]-1] != 0) 
            {
               System.out.println("메뉴 : "+menu[num[i]-1]+" | "+"수량 : "+count[num[i]-1]+" | 가격 : "+price[num[i]-1]+" | 총가격 : "+price[num[i]-1]*count[num[i]-1]);
               cnt[num[i]-1]++;
            }
         }
         }
    }
}