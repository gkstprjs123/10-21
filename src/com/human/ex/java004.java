package com.human.ex;

public class java004 {

	public static void main(String[] args) {
	
		//���Ǳ�
		java.util.Scanner scanner=
				new java.util.Scanner(System.in);
		
		int t=7;
		int total=0;
		
		while(t!=0) {
			System.out.print("1.�ݶ�700�� 2.ȯŸ500�� 3.���̴�350�� 4.���� 5.��ȯ:");
			t=Integer.parseInt(scanner.nextLine());
			if(t==1) {
				if(total>0) {
					total=total-700;
					System.out.println("���� �� �ݾ�"+total+"��");
				}else {
					System.out.println("�ܾ� ����");
				}				  
			}else if(t==2) {
				if(total>0) {
					total=total-500;
					System.out.println("���� �� �ݾ�"+total+"��");
				}else {
					System.out.println("�ܾ� ����");
				}	
			}else if(t==3) {
				if(total>0) {
					total=total-350;
					System.out.println("���� �� �ݾ�"+total+"��");
				}else {
					System.out.println("�ܾ� ����");
				}	
			}else if(t==4) {
				System.out.print("�����Ͻ� �ݾ��� �����ּ���:");
				int a=Integer.parseInt(scanner.nextLine());
				total=total+a;
			}else if(t==5) {
				System.out.println("��ȯ ���� �ݾ�"+total+"��");
				total=0;
			}
		}
       
		
		
	}

}
