package com.human.ex;

public class java007 {
	

	public static void main(String[] args) {
	//1.���� �̹������� ��ĥ�� �κ��� ������ ��� ������ true���Ǵ� ���ǽ��� ����� ����.
		java.util.Scanner scanner=
				new java.util.Scanner(System.in);
		//1��°
//		System.out.print("���� �Է��ϼ���:");
//		int x=Integer.parseInt(scanner.nextLine());
//		if(x>=14) {
//			System.out.print("true");
//		}else {
//			System.out.print("false");
//		}
//		
		//2��°
		
//		System.out.print("���� �Է��ϼ���:");
//		int x=Integer.parseInt(scanner.nextLine());
//		if(x>=22||x<=12) {
//			System.out.print("true");
//		}else {
//			System.out.print("false");
//		}
//		
		//3��°
		
//		System.out.print("���� �Է��ϼ���:");
//		int x=Integer.parseInt(scanner.nextLine());
//		if(x>=5&&x<=9) {
//			System.out.print("true");
//		}else {
//			System.out.print("false");
//		}
		
		
		//2.���� �̹������� ��ĥ ���� �κ��� ������ ��� ������ true���Ǵ� ���ǽ��� ����� ����. not�����ڴ� ������� ����
		//1��°
//		System.out.print("���� �Է��ϼ���:");
//		int x=Integer.parseInt(scanner.nextLine());
//		if(x<14) {
//			System.out.print("true");
//		}else {
//			System.out.print("false");
//		}
//		
//		//2��°
//		
//		System.out.print("���� �Է��ϼ���:");
//		int x=Integer.parseInt(scanner.nextLine());
//		if(x<22&&x>12) {
//			System.out.print("true");
//		}else {
//			System.out.print("false");
//		}
//
//		//3����
//		System.out.print("���� �Է��ϼ���:");
//		int x=Integer.parseInt(scanner.nextLine());
//		if(x<5||x>9) {
//			System.out.print("true");
//		}else {
//			System.out.print("false");
//		}
		
		//3.x��y���� ��ġ ���ϱ�
//		System.out.print("x���� �Է��ϼ���:");
//		double x=Double.parseDouble(scanner.nextLine());
//		System.out.print("y���� �Է��ϼ���:");
//		double y=Double.parseDouble(scanner.nextLine());
//		if(x>0&&y>0) {
//			System.out.println("���� 2����ġ�� �ִ�");
//		}else if(x<0&&y<0) {
//			System.out.println("���� 4����ġ�� �ִ�");
//		}else if(x>0&&y<0) {
//			System.out.println("���� 3����ġ�� �ִ�");
//		}else if(x<0&&y>0) {
//			System.out.println("���� 1����ġ�� �ִ�");
//		}else {
//			System.out.println("���� x,y�࿡ �ִ�");
//		}
//		
		//4.���� �������� �����ϰ� ����ǰ� if���� switch������  �����غ���
		//else if��
//		System.out.print("���ڸ� �־��ּ���");
//		int input=Integer.parseInt(scanner.nextLine());
//		int a=5;
//		int b=7;
//		if(input==0) {
//			a=a+2;
//		}else if(input==1) {
//			b=b+4;
//		}else if(input==2) {
//			a=a+b;
//		}else {
//			b=b+5;
//		}
//		System.out.print(a+","+b);
		//switch��
//		System.out.print("���ڸ� �־��ּ���");
//		int input=Integer.parseInt(scanner.nextLine());
//		int a=5;
//		int b=7;
//		switch (input) {
//		case  0: a=a+2; 
//		   break;
//		case  1: b=b+4; 
//		   break;		   
//		case  2: a=a+b; 
//		   break;
//		default:b=b+5;		    	
//		}
//		System.out.print(a+","+b);
//		
		
		
		//��ħ ���� �Ծ����� ������ �Ծ����� �� ��� �ǰ� ���� ���� �ʾ����� �ƹ��͵� ��µ��� ����.
//		System.out.print("1. ��ħ�� �Ծ��� 2.�����ʾҴ� ");
//		int a=Integer.parseInt(scanner.nextLine());
//		if(a==1) {
//			System.out.print("���� �Ծ���");
//		}
		
		
		
		//2.��ħ�� ���� �Ծ����� ������ �Ծ������� ��µǰ� ���� ���� �ʾ����� ������ �Ծ������� ��µ�
//		System.out.print("1. ��ħ�� �� 2.��");
//		int a=Integer.parseInt(scanner.nextLine());
//		if(a==1) {
//			System.out.print("���� �Ծ���");
//		}else if(a==2) {
//			System.out.print("���� �Ծ���");
//		}
//		
//		
//		// 3.��ħ ���� �Ծ����� ������ �Ծ����� ���� �ʾ����� ������ �Ծ������� ��µǵ��� ����.
//		System.out.print("1. ��ħ�� �� 2.��");
//		int a=Integer.parseInt(scanner.nextLine());
//		if(a==1) {
//			System.out.print("���� �Ծ���");
//		}else if(a==2) {
//			System.out.print("���� �Ծ���");
//		}
//		
//		
//		// 4.��ħ ���� �Ծ����� ������ �Ծ����� ���� �ʾ����� ���ƹ��͵� �ȸԾ������� ��� �ǵ��� ����.
//		
//		System.out.print("1. ��ħ�� �� 2.�����ʾҴ�");
//		int a=Integer.parseInt(scanner.nextLine());
//		if(a==1) {
//			System.out.print("���� �Ծ���");
//		}else if(a==2) {
//			System.out.print("�ƹ��͵� �ȸԾ���");
//		}

		//5..��,��,��,���� �� ��ħ������ ���� ���� ȭ�鿡 ��µǵ��� ����.
//		System.out.print("��ħ�� �������� ������ 1.�� 2.�� 3.�� 4.����");
//		int a=Integer.parseInt(scanner.nextLine());
//		if(a==1) {
//			System.out.print("���� �Ծ���");
//		}else if(a==2) {
//			System.out.print("���� �Ծ���");
//		}else if(a==3) {
//			System.out.print("���� �Ծ���");
//		}else if(a==3) {
//			System.out.print("������ �Ծ���");
//		}
		
		//6.��ħ �Ļ�� ���䡯�� �������� �ְ� �Ľ����� ��,����, ���̽�ũ��, 
		//Ŀ�ǰ� �ִµ� ���� ������ ���� ���̽�ũ���� �ϳ��� ���� ������ ���� Ŀ�� �� �ϳ��� �Ľ����� ������ �ִ�.
//		System.out.print("��ħ�� �������� ������ 1.�� 2.��");
//		int a=Integer.parseInt(scanner.nextLine());
//		if(a==1) {
//			System.out.println("���� �Ծ���");
//		    	System.out.print("�Ľ����� �������� ������ 1.�� 2.���̽�ũ��");
//			    int b=Integer.parseInt(scanner.nextLine());
//			      if(b==1) {
//			    	  System.out.print("�Ľ����� ���� �Ծ���");
//			      }else if(b==2) {
//			    	  System.out.print("�Ľ����� ���̽�ũ���� �Ծ���");
//			      }
//		}else if(a==2) {
//			System.out.println("���� �Ծ���");
//	    	System.out.print("�Ľ����� �������� ������ 1.���� 2.Ŀ��");
//		    int b=Integer.parseInt(scanner.nextLine());
//		      if(b==1) {
//		    	  System.out.print("�Ľ����� ������ �Ծ���");
//		      }else if(b==2) {
//		    	  System.out.print("�Ľ����� Ŀ�Ǹ� �Ծ���");
//		      }
//		}      
//		
		
		
		 //7.���� ������ ������ �Ծ������� ������ �Ծ������� ��µǰ� ���� ���� �ʾ����� ������ �Ծ������� �������� �Ծ������� ��� �ǵ��� ����.
		
//		System.out.print("��ħ�� ���� �Ծ����ϱ�? 1.yes 2.no ");
//		int a=Integer.parseInt(scanner.nextLine());
//		if(a==1) {
//			System.out.println("��� ���� �Ծ���");
//		    	
//			      
//		}else if(a==2) {
//			System.out.println("���� ������ �Ծ���");
//	    		    
//		}      
		
		
		// 8.���ء�,��������, ���ޡ�, ������ �� �̿��ؼ� ������ ���� 7���� ��� �ɼ� �ִ� ������ if���� 
		//boolean������ flag�������� �����ϰ� flag������ ������ ����. ��Ʈ�� ������ ���� ¦�̴�. �ڵ带 �ۼ��ϰ� �Ʒ��Ͱ��� ����� ���ü� �ִ� flag���� �����غ���.
		//����,��  ��,��
//		boolean flag=true;
//		boolean flag2=true;
//		String a[]= {"����","��"};
//		String b[]= {"��","��"};
//		
//		for(int i=0; i<a.length; i++) {
//			if(flag) {
//				System.out.print("-"+a[i]+" ");				
//			}else {
//				System.out.print(a[i]+" ");	
//			}
//			if(flag) {
//				System.out.print("-"+a[i]+",");
//			}else {
//				System.out.print("-"+a[i]+" ");	
//			}
//			flag=false;
//		}
//		for(int i=0; i<b.length; i++) {
//			if(flag2) {
//				System.out.print("-"+b[i]+" ");				
//			}else {
//				System.out.print(b[i]+" ");	
//			}
//			if(flag2) {
//				System.out.print("-"+b[i]+",");
//			}else {
//				System.out.print("-"+b[i]+" ");	
//			}
//			flag2=false;
//		}
		
		
		
		//������ ���� ���ϱ�

//		int i=(new java.util.Date()).getDay();
//		System.out.print(i+".");
//		if(i==1) {
//			System.out.println("������ ������ �Դϴ�");
//		}else if(i==2) {
//			System.out.println("������ ȭ���� �Դϴ�");
//		}else if(i==3) {
//			System.out.println("������ ������ �Դϴ�");
//		}else if(i==4) {
//			System.out.println("������ ����� �Դϴ�");
//		}else if(i==5) {
//			System.out.println("������ �ݿ��� �Դϴ�");
//		}else if(i==6) {
//			System.out.println("������ ����� �Դϴ�");
//		}else if(i==7) {
//			System.out.println("������ �Ͽ��� �Դϴ�");
//		}
		
		//���� �Է¹޾� �ش���� 28������ 30������ 31������ ����ϴ� ���α׷��� ������ ����.
//        int i=(new java.util.Date()).getMonth()+1;
//       
//        if(i==2) {
//        	System.out.print("�ش���� 29�ϱ��� �ֽ��ϴ�");
//        }else if(i==12||i==10||i==8||i==7||i==5||i==3||i==1){
//        	System.out.print("�ش���� 31�ϱ��� �ֽ��ϴ�");
//        }else if(i==11||i==9||i==6||i==4) {
//        	System.out.print("�ش���� 30�ϱ��� �ֽ��ϴ�");
//        }
//		
		
		//�̱� ������� ���
//		System.out.print("����� �Է����ּ���:");
//		int size=Integer.parseInt(scanner.nextLine());
//		if(size>=90&&size<95) {
//			System.out.println("�̱� ������� S");
//		}else if(size>=95&&size<100) {
//			System.out.println("�̱� ������� M");
//		}else if(size>=100&&size<105) {
//			System.out.println("�̱� ������� L");
//		}else if(size>=105&&size<120) {
//			System.out.println("�̱� ������� XL");
//		}if(size>=110) {
//			System.out.println("�̱� ������� M");
//		}
		
		
//		//��ü�������ϳ��� ��¹޾� �ѱ�������� �̱������ ��¹޴°�
//		System.out.print("��ѷ��� �����ּ���:");
//		int size1=Integer.parseInt(scanner.nextLine());
//		if(size1>=33&&size1<=35) {
//			System.out.println("�̱� ������� S,�ѱ� ������� 90~95");
//		}else if(size1>=36&&size1<=37) {
//			System.out.println("�̱� ������� M,�ѱ� ������� 95~100");
//		}else if(size1>=38&&size1<=39) {
//			System.out.println("�̱� ������� L,�ѱ� ������� 100~105");
//		}else if(size1>=41&&size1<42) {
//			System.out.println("�̱� ������� XL,�ѱ� ������� 105~120");
//		}if(size1>=43&&size1<=45) {
//			System.out.println("�̱� ������� M,�ѱ� ������� 110�̻�");
//		}
//		
//		//������ ���� ����Ǵ� ���� ���α׷��� ������. 
//		//ù��°�� �Է�>>5, �����ڼ��� 1. + 2. - 3. * 4. / >>3 �ι�°�� �Է�>>12
//		//5*12=60 �Դϴ�.
//		
//		System.out.print("ù��° �� �Է�:");
//		int num1=Integer.parseInt(scanner.nextLine());
//		System.out.print("������ ����1.+ 2.- 3.* 4./");
//		int math=Integer.parseInt(scanner.nextLine());
//		System.out.print("�ι�° �� �Է�:");
//		int num2=Integer.parseInt(scanner.nextLine());
//		if(math==1) {
//			System.out.println(num1+"+"+num2+"="+(num1+num2)+"�Դϴ�");			
//		}else if(math==2) {
//			System.out.println(num1+"-"+num2+"="+(num1-num2)+"�Դϴ�");	
//		}else if(math==3) {
//			System.out.println(num1+"*"+num2+"="+(num1*num2)+"�Դϴ�");	
//		}else if(math==4) {
//			System.out.println(num1+"/"+num2+"="+(num1/num2)+"�Դϴ�");	
//		}			
//		
//		//2.���� ���� �� ������ ���� �̰���� ������ ����ϴ� ���α׷��� ����� ����.
//		System.out.print("1.���� 2.���� 3.��:");
//		int num1=Integer.parseInt(scanner.nextLine());		
//		int num2=(int)(1+3*Math.random());		
//		if(num2==num1) {
//			System.out.print("���º�");
//		}else if(num1==1&&num2==2) {
//			System.out.print("�й�");
//		}else if(num1==2&&num2==1) {
//			System.out.print("�¸�");
//		}else if(num1==1&&num2==3) {
//			System.out.print("����");
//		}else if(num1==3&&num2==1) {
//			System.out.print("�й�");
//		}else if(num1==2&&num2==3) {
//			System.out.print("�й�");
//		}else if(num1==3&&num2==2) {
//			System.out.print("�¸�");
//		}
		
		//���� ������ ����ϴ� ���α׷�
		
		System.out.print("�ҵ� �ݾ��� �Է����ּ���(���� ������):");
		int money=Integer.parseInt(scanner.nextLine());
		
		if(money<=1200) {
			money=money*6/100*10000;
			System.out.print("���ϰ� �����ؾߵ� ������"+money+"�� �Դϴ�");
		}else if(money>1200&&money<=4600) {
			int money1=money-1200;
			money=1200;
			money=money*6/100*10000;
			money1=money1*15/100*10000;
			int sum=money+money1-1080000;	
			Math.floor(sum);		
			System.out.print("���ϰ� �����ؾߵ� ������"+sum+"�� �Դϴ�");						
		}else if(money>4600&&money<=8800) {
			int money1=money-4600;
			money=4600;
			money=money*15/100*10000;
			money1=money1*24/100*10000;
			int sum=money+money1-5220000;
			System.out.print("���ϰ� �����ؾߵ� ������"+sum+"�� �Դϴ�");
		}else if(money>8800&&money<=15000) {
			int money1=money-8800;
			money=8800;
			money=money*24/100*10000;
			money1=money1*35/100*10000;
			int sum=money+money1-14900000;
			System.out.print("���ϰ� �����ؾߵ� ������"+sum+"�� �Դϴ�");
		}else if(money>15000&&money<=30000) {
			int money1=money-15000;
			money=15000;
			money=money*35/100*10000;
			money1=money1*38/100*10000;
			int sum=money+money1-19400000;
			System.out.print("���ϰ� �����ؾߵ� ������"+sum+"�� �Դϴ�");
		}else if(money>30000&&money<=50000) {
			int money1=money-30000;
			money=30000;
			money=money*38/100*10000;
			money1=money1*40/100*10000;
			int sum=money+money1-2540000;
			System.out.print("���ϰ� �����ؾߵ� ������"+sum+"�� �Դϴ�");
		}else if(money>50000) {
			int money1=money-50000;
			money=50000;
			money=money*40/100*10000;
			money1=money1*42/100*10000;
			int sum=money+money1-35400000;
			System.out.print("���ϰ� �����ؾߵ� ������"+sum+"�� �Դϴ�");	
		}
		
		






		
		
	}

}
