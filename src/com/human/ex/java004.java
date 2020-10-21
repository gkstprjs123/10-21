package com.human.ex;

public class java004 {

	public static void main(String[] args) {
	
		//자판기
		java.util.Scanner scanner=
				new java.util.Scanner(System.in);
		
		int t=7;
		int total=0;
		
		while(t!=0) {
			System.out.print("1.콜라700원 2.환타500원 3.사이다350원 4.투입 5.반환:");
			t=Integer.parseInt(scanner.nextLine());
			if(t==1) {
				if(total>0) {
					total=total-700;
					System.out.println("투입 후 금액"+total+"원");
				}else {
					System.out.println("잔액 부족");
				}				  
			}else if(t==2) {
				if(total>0) {
					total=total-500;
					System.out.println("투입 후 금액"+total+"원");
				}else {
					System.out.println("잔액 부족");
				}	
			}else if(t==3) {
				if(total>0) {
					total=total-350;
					System.out.println("투입 후 금액"+total+"원");
				}else {
					System.out.println("잔액 부족");
				}	
			}else if(t==4) {
				System.out.print("투입하실 금액을 적어주세요:");
				int a=Integer.parseInt(scanner.nextLine());
				total=total+a;
			}else if(t==5) {
				System.out.println("반환 받은 금액"+total+"원");
				total=0;
			}
		}
       
		
		
	}

}
