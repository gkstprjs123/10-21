package com.human.ex;

public class java002 {

	public static void main(String[] args) {
	  
//		//1. ���ڸ� �ϳ� �Է¹޾� Ȧ�� ���� ¦�� ���� ���ϴ� ���α׷��� ���Ͽ���
		java.util.Scanner scanner=
				new java.util.Scanner( System.in);
//		
//		System.out.print("���ڸ� �Է����ּ���:");
//		int a=Integer.parseInt(scanner.nextLine());
//		if(a%2==0) {
//			System.out.print("�Է� ���� ���ڴ� ¦���̴�");
//		}else {
//			System.out.print("�Է� ���� ���ڴ� Ȧ���̴�");
//					
//		}
//		
//		//2. ���� 2. ���� 2���� �Է� �޾� ù��° ���ڰ� �ι�° ������ ������� �ƴ��� ����ϴ� ���α׷��� ���Ͽ���.
//
//		System.out.print("ù��° ���ڸ� �Է����ּ���:");
//		int b=Integer.parseInt(scanner.nextLine());
//		System.out.print("�ι�° ���ڸ� �Է����ּ���:");
//		int c=Integer.parseInt(scanner.nextLine());	
//		
//		if(b%c==0) {
//			System.out.print(b+"��(��)"+c+"�� ����Դϴ�.");
//		}else {
//			System.out.print(b+"��"+c+"�� ����� �ƴմϴ�.");
//		}
		
		//3. ���� 3. a ���� �������� �ٲٸ� 500��¥�� �� �� 100��¥�� �� ���� �Ǵ°�?
		
//		System.out.print("�ݾ��� �Է����ּ���:");
//		int a=Integer.parseInt(scanner.nextLine());
//		int b=a/500;
//		int c=(a%500)/100;
//		System.out.println("500��¥��"+b+"�� ���¥��"+c+"��");
		
		//4.���� 4. 500��¥�� n�� 100��¥�� m�� �� ���ΰ�?

//		System.out.print("500��¥�� ��Դϱ�:");
//		int a=Integer.parseInt(scanner.nextLine());
//		System.out.print("100��¥�� ��Դϱ�:");
//		int b=Integer.parseInt(scanner.nextLine());
//		a=a*500;
//		b=b*100;
//		System.out.print("�� �ݾ��� "+(a+b)+"�� �Դϴ�");
		
		//���� 5. n�ʸ� �Է� �޾� �ú��ʷ� �ٲ㺸��.
		
//		System.out.print("�ʸ� �Է����ּ���:");
//		int a=Integer.parseInt(scanner.nextLine());
//		
//		int b=a/3600;
//		int c=(a%3600)/60;
//		int d=a%60;
//		System.out.print(b+"��"+c+"��"+d+"���̴�");
		
		//���� 6. n�ð� m�� l�ʴ� �� �����ΰ�?
//		System.out.print("�ø� �Է����ּ���:");
//		int a=Integer.parseInt(scanner.nextLine());
//		System.out.print("���� �Է����ּ���:");
//		int b=Integer.parseInt(scanner.nextLine());
//		
//		int sum=a*3600+b*60+1;
//		System.out.print("�Է� ���� ��+��+1�ʴ�"+sum+"�� �Դϴ�");
		
		//���� 1) a, b �� ���� �Է� �޾� �� ���� ��ȯ�� ������ �� ���� ����ϴ� �ڵ带 �ۼ��� ����.
        
//		System.out.print("ù��° ���� �Է����ּ���:");
//		int a=Integer.parseInt(scanner.nextLine());
//		System.out.print("�ι�° ���� �Է����ּ���:");
//		int b=Integer.parseInt(scanner.nextLine());
//		
//	    System.out.println("��ȯ �Ǳ���:"+a+","+b);
//	    int t=a;
//	    a=b;
//	    b=t;
//	    System.out.print("��ȯ �� ��:"+a+","+b);
		
		//���� 2) 3���� ���� �Է� �޾� ���� ���� ���� a, ���� �������� b, ������ ���� c�� �־� ���������� ����� ����. ������ ���� ��Ű��. 
		
//		System.out.print("ù��° ���� �Է����ּ���:");
//		int a=Integer.parseInt(scanner.nextLine());
//		System.out.print("�ι�° ���� �Է����ּ���:");
//		int b=Integer.parseInt(scanner.nextLine());
//		System.out.print("����° ���� �Է����ּ���:");
//		int c=Integer.parseInt(scanner.nextLine());
//		
//		if(a>b) {
//			int i=a;
//			a=b;
//			b=i;
//		}
//		if(b>c) {
//			int i=b;
//			b=c;
//			c=i;
//		}
//		if(a>b) {
//			int i=a;
//			a=b;
//			b=i;
//		}
//		
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);
		
		//1.����ڿ��� ��� 5  Ȥ�� ���� 5�� �Է� �޾� ���밪�� ����ϴ� ���α׷��� ����� ����.
//		int i=5;
//		int j=-5;
//		i=Math.abs(i);
//		j=Math.abs(j);
//		System.out.print("�� ���� ���밪��"+i+","+j+"�̴�");
		
		//2.�μ��� �Է¹޾� ������ �ƴϸ� ū�� ������ ����� ����.
//		System.out.print("ù��° ���� �Է����ּ���:");
//		int a=Integer.parseInt(scanner.nextLine());
//		System.out.print("�ι�° ���� �Է����ּ���:");
//		int b=Integer.parseInt(scanner.nextLine());
//		
//		if(a==b) {
//			System.out.print("�μ��� �����ϴ�");
//		}else if(a>b) {
//			System.out.print("ù��°���� �ι�°������ Ů�ϴ�");
//		}else {
//			System.out.print("�ι�°���� ù��°������ Ů�ϴ�");
//		}
		
		//3.����ڿ��� ���ڸ� �ϳ� �Է¹޾� 126�� ������� �ƴ��� ����� ����.
		
//		System.out.print("���� �Է����ּ���:");
//		int a=Integer.parseInt(scanner.nextLine());
//		if(126%a==0) {
//			System.out.print("�Է� ���� ���� 126�� ����Դϴ�");
//		}else {
//			System.out.print("�Է� ���� ���� 126�� ����� �ƴմϴ�");
//
//		}
		
		//4.������������ ������ �Է¹޾� ����� 80�̻��̸� �հ� ���ϸ� ���հ��� ����� ����.
//		System.out.print("���� ������ �Է����ּ���:");
//		int a=Integer.parseInt(scanner.nextLine());
//		System.out.print("���� ������ �Է����ּ���:");
//		int b=Integer.parseInt(scanner.nextLine());
//		System.out.print("���� ������ �Է����ּ���:");
//		int c=Integer.parseInt(scanner.nextLine());
//		
//		a=(a+b+c)/3;
//		
//		if(a>=80) {
//			System.out.print("�հ�");
//		}else {
//			System.out.print("���հ�");
//		}
		
		//5.����ڿ��� �Է¹������� 5�����̸� x+15 �ʰ� �̸� x+5 �Ѱ��� ��µǴ� ���α׷��� ����� ����.
//		System.out.print("���� �Է����ּ���:");
//		int x=Integer.parseInt(scanner.nextLine());
//		if(x<=5) {
//			x=x+15;
//		}else if(x>5) {
//			x=x+5;
//		}
//		System.out.print(x)
		
		//1.�Է¹��� ���� 3�� ��� �̰ų� 7�� ����̸� ��3�Ǵ� 7�� ������� ��µǰ�, 
		//2�� ����� �ǰ� 5�� ����� �Ǹ� ��2�� 5�� ������� ����ϰ� �ΰ��� ��� �� �����ϸ� 2���� �� ����ϴ� ���α׷��� ����� ����.
		
//		System.out.print("���� �Է����ּ���:");
//		int a=Integer.parseInt(scanner.nextLine());
//		
//		if((a%3==0||a%7==0)&&a%2==0&&a%5==0) {
//			System.out.print("�Է¹��� ���� 3�Ǵ�7�ǹ���̰� 2�� 5�� ����� �ȴ�");
//		}else if(a%3==0||a%7==0){
//			System.out.print("�Է¹��� ���� 3�Ǵ�7�ǹ��");
//		}else if(a%2==0&&a%5==0) {
//			System.out.print("�Է¹��� ���� 2�� 5�� ���");
//		}else {
//			System.out.print("�������� ����");
//		}
		
		//2.������ݰ���ϴ� ���α׷��� �����غ���. 15�� ���ϴ� 1300�� �ʰ��� 1600���̰�  ����ī��� �����ϸ� 100�� ������ �ش�.
//		System.out.print("���̸� �Է����ּ���:");
//		int a=Integer.parseInt(scanner.nextLine());
//		System.out.print("����ī��� �����Ͻðڽ��ϱ�?1.YES 2.NO:");
//		int b=Integer.parseInt(scanner.nextLine());
//		if(b==1) {
//			if(a>15) {
//				System.out.print("���� ����� 1500���Դϴ�");
//			}else if(a<=15){
//				System.out.print("���� ����� 1200���Դϴ�");
//			}
//		}else if(b==2) {
//			if(a>15) {
//				System.out.print("���� ����� 1600���Դϴ�");
//			}else if(a<=15){
//				System.out.print("���� ����� 1300���Դϴ�");
//			}
//		}
		
		//1.������ �񸸵� ������̴�. ����� �Է��� �޾� �Ʒ� ǥ�� ���� ����� �������� ���α׷��� �����Ͽ���
//		System.out.print("�����̽ʴϱ�?1.yes 2.no:");
//		int a=Integer.parseInt(scanner.nextLine());
//		if(a==1) {
//			System.out.print("Ű�� �Է����ּ���:");
//			int b=Integer.parseInt(scanner.nextLine());
//			System.out.print("�����Ը� �Է����ּ���:");
//			int c=Integer.parseInt(scanner.nextLine());
//			double x=c/((b-100)*0.9)*100;
//			  if(x<100) {
//				  System.out.print("ü�߹̴�");
//			  }else if(100<x&&x<110) {
//				  System.out.print("����");
//			  }else if(110<x&&x<120) {
//				  System.out.print("��ü��");
//			  }else if(120<x&&x<150) {
//				  System.out.print("��");
//			  }else if(x>150) {
//				  System.out.print("����");
//			  }
//		}else if(a==2) {
//			System.out.print("Ű�� �Է����ּ���:");
//			int b=Integer.parseInt(scanner.nextLine());
//			System.out.print("�����Ը� �Է����ּ���:");
//			int c=Integer.parseInt(scanner.nextLine());
//			double x=c/((b-100)*0.9)*100;
//			  if(x<95) {
//				  System.out.print("ü�߹̴�");
//			  }else if(95<x&&x<120) {
//				  System.out.print("����");
//			  }else if(120<x&&x<130) {
//				  System.out.print("�浵 ��");
//			  }else if(130<x&&x<150) {
//				  System.out.print("�ߵ� ��");
//			  }else if(x>150) {
//				  System.out.print("����");
//			  }
//		}
		
		//�Ʒ� �׸��� ���� ������� ����� ����.
		
		//1400~1800���
//		System.out.print("���� �Է��ϼ���");
//		int a=Integer.parseInt(scanner.nextLine());
//		if(a>=1400&&a<=1800) {
//			System.out.print(a);
//		}else{
//			System.out.print("���� ������ ����");
//		}
		
		// &&������
//		System.out.print("���� �Է��ϼ���");
//	     	int a=Integer.parseInt(scanner.nextLine());
//			if(a>=1400&&a<=1800) {
//				System.out.print(a);
//			}else{
//				System.out.print("���� ������ ����");
//			}
		

		
		

	}

}
