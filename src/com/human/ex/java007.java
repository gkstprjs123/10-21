package com.human.ex;

public class java007 {
	

	public static void main(String[] args) {
	//1.왼쪽 이미지에서 색칠한 부분의 값들이 들어 왔을때 true가되는 조건식을 만들어 보자.
		java.util.Scanner scanner=
				new java.util.Scanner(System.in);
		//1번째
//		System.out.print("수를 입력하세요:");
//		int x=Integer.parseInt(scanner.nextLine());
//		if(x>=14) {
//			System.out.print("true");
//		}else {
//			System.out.print("false");
//		}
//		
		//2번째
		
//		System.out.print("수를 입력하세요:");
//		int x=Integer.parseInt(scanner.nextLine());
//		if(x>=22||x<=12) {
//			System.out.print("true");
//		}else {
//			System.out.print("false");
//		}
//		
		//3번째
		
//		System.out.print("수를 입력하세요:");
//		int x=Integer.parseInt(scanner.nextLine());
//		if(x>=5&&x<=9) {
//			System.out.print("true");
//		}else {
//			System.out.print("false");
//		}
		
		
		//2.왼쪽 이미지에서 색칠 안한 부분의 값들이 들어 왔을때 true가되는 조건식을 만들어 보자. not연산자는 사용하지 말자
		//1번째
//		System.out.print("수를 입력하세요:");
//		int x=Integer.parseInt(scanner.nextLine());
//		if(x<14) {
//			System.out.print("true");
//		}else {
//			System.out.print("false");
//		}
//		
//		//2번째
//		
//		System.out.print("수를 입력하세요:");
//		int x=Integer.parseInt(scanner.nextLine());
//		if(x<22&&x>12) {
//			System.out.print("true");
//		}else {
//			System.out.print("false");
//		}
//
//		//3번쨰
//		System.out.print("수를 입력하세요:");
//		int x=Integer.parseInt(scanner.nextLine());
//		if(x<5||x>9) {
//			System.out.print("true");
//		}else {
//			System.out.print("false");
//		}
		
		//3.x축y축의 위치 구하기
//		System.out.print("x축을 입력하세요:");
//		double x=Double.parseDouble(scanner.nextLine());
//		System.out.print("y축을 입력하세요:");
//		double y=Double.parseDouble(scanner.nextLine());
//		if(x>0&&y>0) {
//			System.out.println("점은 2번위치에 있다");
//		}else if(x<0&&y<0) {
//			System.out.println("점은 4번위치에 있다");
//		}else if(x>0&&y<0) {
//			System.out.println("점은 3번위치에 있다");
//		}else if(x<0&&y>0) {
//			System.out.println("점은 1번위치에 있다");
//		}else {
//			System.out.println("점은 x,y축에 있다");
//		}
//		
		//4.다음 순서도와 동일하게 실행되게 if문과 switch문으로  구축해보자
		//else if문
//		System.out.print("숫자를 넣어주세요");
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
		//switch문
//		System.out.print("숫자를 넣어주세요");
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
		
		
		//아침 밥을 먹었으면 ‘밥을 먹었음’ 이 출력 되고 밥을 먹지 않았으면 아무것도 출력되지 않음.
//		System.out.print("1. 아침을 먹었다 2.먹지않았다 ");
//		int a=Integer.parseInt(scanner.nextLine());
//		if(a==1) {
//			System.out.print("밥을 먹었음");
//		}
		
		
		
		//2.아침에 빵을 먹었으면 ‘빵을 먹었음’이 출력되고 빵을 먹지 않았으면 ‘밥을 먹었음’이 출력됨
//		System.out.print("1. 아침에 빵 2.밥");
//		int a=Integer.parseInt(scanner.nextLine());
//		if(a==1) {
//			System.out.print("빵을 먹었음");
//		}else if(a==2) {
//			System.out.print("밥을 먹었음");
//		}
//		
//		
//		// 3.아침 밥을 먹었으면 ‘밥을 먹었음’ 먹지 않았으면 ‘빵을 먹었음’이 출력되도록 구현.
//		System.out.print("1. 아침에 밥 2.빵");
//		int a=Integer.parseInt(scanner.nextLine());
//		if(a==1) {
//			System.out.print("밥을 먹었음");
//		}else if(a==2) {
//			System.out.print("빵을 먹었음");
//		}
//		
//		
//		// 4.아침 밥을 먹었으면 ‘밥을 먹었음’ 먹지 않았으면 ‘아무것도 안먹었음’이 출력 되도록 구현.
//		
//		System.out.print("1. 아침에 밥 2.먹지않았다");
//		int a=Integer.parseInt(scanner.nextLine());
//		if(a==1) {
//			System.out.print("밥을 먹었음");
//		}else if(a==2) {
//			System.out.print("아무것도 안먹었음");
//		}

		//5..밥,빵,국,우유 중 아침밥으로 먹은 것을 화면에 출력되도록 구현.
//		System.out.print("아침에 먹은것을 고르세요 1.밥 2.빵 3.국 4.우유");
//		int a=Integer.parseInt(scanner.nextLine());
//		if(a==1) {
//			System.out.print("밥을 먹었음");
//		}else if(a==2) {
//			System.out.print("빵을 먹었음");
//		}else if(a==3) {
//			System.out.print("국을 먹었음");
//		}else if(a==3) {
//			System.out.print("우유를 먹었음");
//		}
		
		//6.아침 식사로 ‘밥’과 ‘빵’이 있고 후식으로 국,우유, 아이스크림, 
		//커피가 있는데 밥을 먹으면 국과 아이스크림중 하나를 빵을 먹으면 우유 커피 중 하나를 후식으로 먹을수 있다.
//		System.out.print("아침에 먹은것을 고르세요 1.밥 2.빵");
//		int a=Integer.parseInt(scanner.nextLine());
//		if(a==1) {
//			System.out.println("밥을 먹었음");
//		    	System.out.print("후식으로 먹을것을 고르세요 1.국 2.아이스크림");
//			    int b=Integer.parseInt(scanner.nextLine());
//			      if(b==1) {
//			    	  System.out.print("후식으로 국을 먹었음");
//			      }else if(b==2) {
//			    	  System.out.print("후식으로 아이스크림을 먹었음");
//			      }
//		}else if(a==2) {
//			System.out.println("빵을 먹었음");
//	    	System.out.print("후식으로 먹을것을 고르세요 1.우유 2.커피");
//		    int b=Integer.parseInt(scanner.nextLine());
//		      if(b==1) {
//		    	  System.out.print("후식으로 우유을 먹었음");
//		      }else if(b==2) {
//		    	  System.out.print("후식으로 커피를 먹었음");
//		      }
//		}      
//		
		
		
		 //7.밥을 먹으면 ‘밥을 먹었음’과 ‘국을 먹었음’이 출력되고 밥을 먹지 않았으면 ‘빵을 먹었음’과 ‘우유를 먹었음’이 출력 되도록 구현.
		
//		System.out.print("아침에 밥을 먹었습니까? 1.yes 2.no ");
//		int a=Integer.parseInt(scanner.nextLine());
//		if(a==1) {
//			System.out.println("밥과 국을 먹었음");
//		    	
//			      
//		}else if(a==2) {
//			System.out.println("빵과 우유를 먹었음");
//	    		    
//		}      
		
		
		// 8.‘해’,’구름’, ‘달’, ‘별’ 를 이용해서 다음과 같이 7개가 출력 될수 있는 형태의 if문과 
		//boolean형태의 flag변수들을 선언하고 flag값들을 설정해 보자. 힌트는 구름과 별이 짝이다. 코드를 작성하고 아래와같은 결과가 나올수 있는 flag값을 선언해보자.
		//구름,별  해,달
//		boolean flag=true;
//		boolean flag2=true;
//		String a[]= {"구름","별"};
//		String b[]= {"해","달"};
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
		
		
		
		//오늘의 요일 정하기

//		int i=(new java.util.Date()).getDay();
//		System.out.print(i+".");
//		if(i==1) {
//			System.out.println("오늘은 월요일 입니다");
//		}else if(i==2) {
//			System.out.println("오늘은 화요일 입니다");
//		}else if(i==3) {
//			System.out.println("오늘은 수요일 입니다");
//		}else if(i==4) {
//			System.out.println("오늘은 목요일 입니다");
//		}else if(i==5) {
//			System.out.println("오늘은 금요일 입니다");
//		}else if(i==6) {
//			System.out.println("오늘은 토요일 입니다");
//		}else if(i==7) {
//			System.out.println("오늘은 일요일 입니다");
//		}
		
		//달을 입력받아 해당달이 28일인지 30일인지 31일인지 출력하는 프로그램을 구현해 보자.
//        int i=(new java.util.Date()).getMonth()+1;
//       
//        if(i==2) {
//        	System.out.print("해당달은 29일까지 있습니다");
//        }else if(i==12||i==10||i==8||i==7||i==5||i==3||i==1){
//        	System.out.print("해당달은 31일까지 있습니다");
//        }else if(i==11||i==9||i==6||i==4) {
//        	System.out.print("해당달은 30일까지 있습니다");
//        }
//		
		
		//미국 사이즈로 출력
//		System.out.print("사이즈를 입력해주세요:");
//		int size=Integer.parseInt(scanner.nextLine());
//		if(size>=90&&size<95) {
//			System.out.println("미국 사이즈로 S");
//		}else if(size>=95&&size<100) {
//			System.out.println("미국 사이즈로 M");
//		}else if(size>=100&&size<105) {
//			System.out.println("미국 사이즈로 L");
//		}else if(size>=105&&size<120) {
//			System.out.println("미국 사이즈로 XL");
//		}if(size>=110) {
//			System.out.println("미국 사이즈로 M");
//		}
		
		
//		//신체사이즈하나를 출력받아 한국사이즈랑 미국사이즈를 출력받는것
//		System.out.print("목둘레를 말해주세요:");
//		int size1=Integer.parseInt(scanner.nextLine());
//		if(size1>=33&&size1<=35) {
//			System.out.println("미국 사이즈로 S,한국 사이즈로 90~95");
//		}else if(size1>=36&&size1<=37) {
//			System.out.println("미국 사이즈로 M,한국 사이즈로 95~100");
//		}else if(size1>=38&&size1<=39) {
//			System.out.println("미국 사이즈로 L,한국 사이즈로 100~105");
//		}else if(size1>=41&&size1<42) {
//			System.out.println("미국 사이즈로 XL,한국 사이즈로 105~120");
//		}if(size1>=43&&size1<=45) {
//			System.out.println("미국 사이즈로 M,한국 사이즈로 110이상");
//		}
//		
//		//다음과 같이 실행되는 계산기 프로그램을 만들어보자. 
//		//첫번째수 입력>>5, 연산자선택 1. + 2. - 3. * 4. / >>3 두번째수 입력>>12
//		//5*12=60 입니다.
//		
//		System.out.print("첫번째 수 입력:");
//		int num1=Integer.parseInt(scanner.nextLine());
//		System.out.print("연산자 선택1.+ 2.- 3.* 4./");
//		int math=Integer.parseInt(scanner.nextLine());
//		System.out.print("두번째 수 입력:");
//		int num2=Integer.parseInt(scanner.nextLine());
//		if(math==1) {
//			System.out.println(num1+"+"+num2+"="+(num1+num2)+"입니다");			
//		}else if(math==2) {
//			System.out.println(num1+"-"+num2+"="+(num1-num2)+"입니다");	
//		}else if(math==3) {
//			System.out.println(num1+"*"+num2+"="+(num1*num2)+"입니다");	
//		}else if(math==4) {
//			System.out.println(num1+"/"+num2+"="+(num1/num2)+"입니다");	
//		}			
//		
//		//2.가위 바위 보 게임을 만들어서 이겼는지 졌는지 출력하는 프로그램을 만들어 보자.
//		System.out.print("1.가위 2.바위 3.보:");
//		int num1=Integer.parseInt(scanner.nextLine());		
//		int num2=(int)(1+3*Math.random());		
//		if(num2==num1) {
//			System.out.print("무승부");
//		}else if(num1==1&&num2==2) {
//			System.out.print("패배");
//		}else if(num1==2&&num2==1) {
//			System.out.print("승리");
//		}else if(num1==1&&num2==3) {
//			System.out.print("승이");
//		}else if(num1==3&&num2==1) {
//			System.out.print("패배");
//		}else if(num1==2&&num2==3) {
//			System.out.print("패배");
//		}else if(num1==3&&num2==2) {
//			System.out.print("승리");
//		}
		
		//세금 얼마인지 출력하는 프로그램
		
		System.out.print("소득 금액을 입력해주세요(만원 단위로):");
		int money=Integer.parseInt(scanner.nextLine());
		
		if(money<=1200) {
			money=money*6/100*10000;
			System.out.print("귀하가 납부해야될 세금은"+money+"원 입니다");
		}else if(money>1200&&money<=4600) {
			int money1=money-1200;
			money=1200;
			money=money*6/100*10000;
			money1=money1*15/100*10000;
			int sum=money+money1-1080000;	
			Math.floor(sum);		
			System.out.print("귀하가 납부해야될 세금은"+sum+"원 입니다");						
		}else if(money>4600&&money<=8800) {
			int money1=money-4600;
			money=4600;
			money=money*15/100*10000;
			money1=money1*24/100*10000;
			int sum=money+money1-5220000;
			System.out.print("귀하가 납부해야될 세금은"+sum+"원 입니다");
		}else if(money>8800&&money<=15000) {
			int money1=money-8800;
			money=8800;
			money=money*24/100*10000;
			money1=money1*35/100*10000;
			int sum=money+money1-14900000;
			System.out.print("귀하가 납부해야될 세금은"+sum+"원 입니다");
		}else if(money>15000&&money<=30000) {
			int money1=money-15000;
			money=15000;
			money=money*35/100*10000;
			money1=money1*38/100*10000;
			int sum=money+money1-19400000;
			System.out.print("귀하가 납부해야될 세금은"+sum+"원 입니다");
		}else if(money>30000&&money<=50000) {
			int money1=money-30000;
			money=30000;
			money=money*38/100*10000;
			money1=money1*40/100*10000;
			int sum=money+money1-2540000;
			System.out.print("귀하가 납부해야될 세금은"+sum+"원 입니다");
		}else if(money>50000) {
			int money1=money-50000;
			money=50000;
			money=money*40/100*10000;
			money1=money1*42/100*10000;
			int sum=money+money1-35400000;
			System.out.print("귀하가 납부해야될 세금은"+sum+"원 입니다");	
		}
		
		






		
		
	}

}
