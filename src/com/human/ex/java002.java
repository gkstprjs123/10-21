package com.human.ex;

public class java002 {

	public static void main(String[] args) {
	  
//		//1. 숫자를 하나 입력받아 홀수 인지 짝수 인지 구하는 프로그램을 구하여라
		java.util.Scanner scanner=
				new java.util.Scanner( System.in);
//		
//		System.out.print("숫자를 입력해주세요:");
//		int a=Integer.parseInt(scanner.nextLine());
//		if(a%2==0) {
//			System.out.print("입력 받은 숫자는 짝수이다");
//		}else {
//			System.out.print("입력 받은 숫자는 홀수이다");
//					
//		}
//		
//		//2. 문제 2. 숫자 2개를 입력 받아 첫번째 숫자가 두번째 숫자의 배수인지 아닌지 출력하는 프로그램을 구하여라.
//
//		System.out.print("첫번째 숫자를 입력해주세요:");
//		int b=Integer.parseInt(scanner.nextLine());
//		System.out.print("두번째 숫자를 입력해주세요:");
//		int c=Integer.parseInt(scanner.nextLine());	
//		
//		if(b%c==0) {
//			System.out.print(b+"는(은)"+c+"의 배수입니다.");
//		}else {
//			System.out.print(b+"는"+c+"의 배수가 아닙니다.");
//		}
		
		//3. 문제 3. a 원을 동전으로 바꾸면 500원짜리 몇 개 100원짜리 몇 개가 되는가?
		
//		System.out.print("금액을 입력해주세요:");
//		int a=Integer.parseInt(scanner.nextLine());
//		int b=a/500;
//		int c=(a%500)/100;
//		System.out.println("500원짜리"+b+"개 백원짜리"+c+"개");
		
		//4.문제 4. 500원짜리 n개 100원짜리 m개 총 얼마인가?

//		System.out.print("500원짜리 몇개입니까:");
//		int a=Integer.parseInt(scanner.nextLine());
//		System.out.print("100원짜리 몇개입니까:");
//		int b=Integer.parseInt(scanner.nextLine());
//		a=a*500;
//		b=b*100;
//		System.out.print("총 금액은 "+(a+b)+"원 입니다");
		
		//문제 5. n초를 입력 받아 시분초로 바꿔보자.
		
//		System.out.print("초를 입력해주세요:");
//		int a=Integer.parseInt(scanner.nextLine());
//		
//		int b=a/3600;
//		int c=(a%3600)/60;
//		int d=a%60;
//		System.out.print(b+"시"+c+"분"+d+"초이다");
		
		//문제 6. n시간 m분 l초는 총 몇초인가?
//		System.out.print("시를 입력해주세요:");
//		int a=Integer.parseInt(scanner.nextLine());
//		System.out.print("분을 입력해주세요:");
//		int b=Integer.parseInt(scanner.nextLine());
//		
//		int sum=a*3600+b*60+1;
//		System.out.print("입력 받은 시+분+1초는"+sum+"초 입니다");
		
		//문제 1) a, b 의 수를 입력 받아 두 수를 교환한 다음에 두 수를 출력하는 코드를 작성해 보자.
        
//		System.out.print("첫번째 수를 입력해주세요:");
//		int a=Integer.parseInt(scanner.nextLine());
//		System.out.print("두번째 수를 입력해주세요:");
//		int b=Integer.parseInt(scanner.nextLine());
//		
//	    System.out.println("교환 되기전:"+a+","+b);
//	    int t=a;
//	    a=b;
//	    b=t;
//	    System.out.print("교환 된 후:"+a+","+b);
		
		//문제 2) 3개의 수를 입력 받아 가장 작은 수를 a, 다음 작은수를 b, 나머지 수를 c에 넣어 작은수부터 출력해 보자. 다음을 만족 시키자. 
		
//		System.out.print("첫번째 수를 입력해주세요:");
//		int a=Integer.parseInt(scanner.nextLine());
//		System.out.print("두번째 수를 입력해주세요:");
//		int b=Integer.parseInt(scanner.nextLine());
//		System.out.print("세번째 수를 입력해주세요:");
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
		
		//1.사용자에게 양수 5  혹은 음수 5를 입력 받아 절대값을 출력하는 프로그램을 만들어 보자.
//		int i=5;
//		int j=-5;
//		i=Math.abs(i);
//		j=Math.abs(j);
//		System.out.print("두 수의 절대값은"+i+","+j+"이다");
		
		//2.두수를 입력받아 같은지 아니면 큰지 작은지 기술해 보자.
//		System.out.print("첫번째 수를 입력해주세요:");
//		int a=Integer.parseInt(scanner.nextLine());
//		System.out.print("두번째 수를 입력해주세요:");
//		int b=Integer.parseInt(scanner.nextLine());
//		
//		if(a==b) {
//			System.out.print("두수는 같습니다");
//		}else if(a>b) {
//			System.out.print("첫번째수가 두번째수보다 큽니다");
//		}else {
//			System.out.print("두번째수가 첫번째수보다 큽니다");
//		}
		
		//3.사용자에게 숫자를 하나 입력받아 126의 약수인지 아닌지 기술해 보자.
		
//		System.out.print("수를 입력해주세요:");
//		int a=Integer.parseInt(scanner.nextLine());
//		if(126%a==0) {
//			System.out.print("입력 받은 수는 126의 약수입니다");
//		}else {
//			System.out.print("입력 받은 수는 126의 약수가 아닙니다");
//
//		}
		
		//4.국영수과목의 점수를 입력받아 평균이 80이상이면 합격 이하면 불합격을 출력해 보자.
//		System.out.print("국어 점수를 입력해주세요:");
//		int a=Integer.parseInt(scanner.nextLine());
//		System.out.print("영어 점수를 입력해주세요:");
//		int b=Integer.parseInt(scanner.nextLine());
//		System.out.print("수학 점수를 입력해주세요:");
//		int c=Integer.parseInt(scanner.nextLine());
//		
//		a=(a+b+c)/3;
//		
//		if(a>=80) {
//			System.out.print("합격");
//		}else {
//			System.out.print("불합격");
//		}
		
		//5.사용자에게 입력받은수가 5이하이면 x+15 초과 이면 x+5 한값이 출력되는 프로그램을 만들어 보자.
//		System.out.print("수를 입력해주세요:");
//		int x=Integer.parseInt(scanner.nextLine());
//		if(x<=5) {
//			x=x+15;
//		}else if(x>5) {
//			x=x+5;
//		}
//		System.out.print(x)
		
		//1.입력받은 수가 3의 배수 이거나 7의 배수이면 ‘3또는 7의 배수’가 출력되고, 
		//2의 배수도 되고 5의 배수도 되면 ‘2와 5의 배수’를 출력하고 두가지 경우 다 만족하면 2가지 다 출력하는 프로그램을 만들어 보자.
		
//		System.out.print("수를 입력해주세요:");
//		int a=Integer.parseInt(scanner.nextLine());
//		
//		if((a%3==0||a%7==0)&&a%2==0&&a%5==0) {
//			System.out.print("입력받은 수는 3또는7의배수이고 2와 5의 배수도 된다");
//		}else if(a%3==0||a%7==0){
//			System.out.print("입력받은 수는 3또는7의배수");
//		}else if(a%2==0&&a%5==0) {
//			System.out.print("입력받은 수는 2와 5의 배수");
//		}else {
//			System.out.print("만족하지 못함");
//		}
		
		//2.버스요금계산하는 프로그램을 구현해보자. 15세 이하는 1300원 초과는 1600원이고  버스카드로 결제하면 100원 할인해 준다.
//		System.out.print("나이를 입력해주세요:");
//		int a=Integer.parseInt(scanner.nextLine());
//		System.out.print("버스카드로 결제하시겠습니까?1.YES 2.NO:");
//		int b=Integer.parseInt(scanner.nextLine());
//		if(b==1) {
//			if(a>15) {
//				System.out.print("버스 요금은 1500원입니다");
//			}else if(a<=15){
//				System.out.print("버스 요금은 1200원입니다");
//			}
//		}else if(b==2) {
//			if(a>15) {
//				System.out.print("버스 요금은 1600원입니다");
//			}else if(a<=15){
//				System.out.print("버스 요금은 1300원입니다");
//			}
//		}
		
		//1.왼쪽은 비만도 산출식이다. 사용자 입력을 받아 아래 표와 같은 결과가 나오도록 프로그램을 구현하여라
//		System.out.print("성인이십니까?1.yes 2.no:");
//		int a=Integer.parseInt(scanner.nextLine());
//		if(a==1) {
//			System.out.print("키를 입력해주세요:");
//			int b=Integer.parseInt(scanner.nextLine());
//			System.out.print("몸무게를 입력해주세요:");
//			int c=Integer.parseInt(scanner.nextLine());
//			double x=c/((b-100)*0.9)*100;
//			  if(x<100) {
//				  System.out.print("체중미달");
//			  }else if(100<x&&x<110) {
//				  System.out.print("정상");
//			  }else if(110<x&&x<120) {
//				  System.out.print("과체중");
//			  }else if(120<x&&x<150) {
//				  System.out.print("비만");
//			  }else if(x>150) {
//				  System.out.print("고도비만");
//			  }
//		}else if(a==2) {
//			System.out.print("키를 입력해주세요:");
//			int b=Integer.parseInt(scanner.nextLine());
//			System.out.print("몸무게를 입력해주세요:");
//			int c=Integer.parseInt(scanner.nextLine());
//			double x=c/((b-100)*0.9)*100;
//			  if(x<95) {
//				  System.out.print("체중미달");
//			  }else if(95<x&&x<120) {
//				  System.out.print("정상");
//			  }else if(120<x&&x<130) {
//				  System.out.print("경도 비만");
//			  }else if(130<x&&x<150) {
//				  System.out.print("중도 비만");
//			  }else if(x>150) {
//				  System.out.print("고도비만");
//			  }
//		}
		
		//아래 그림을 보고 노란색을 출력해 보자.
		
		//1400~1800출력
//		System.out.print("수를 입력하세요");
//		int a=Integer.parseInt(scanner.nextLine());
//		if(a>=1400&&a<=1800) {
//			System.out.print(a);
//		}else{
//			System.out.print("수가 범위내 없음");
//		}
		
		// &&연산자
//		System.out.print("수를 입력하세요");
//	     	int a=Integer.parseInt(scanner.nextLine());
//			if(a>=1400&&a<=1800) {
//				System.out.print(a);
//			}else{
//				System.out.print("수가 범위내 없음");
//			}
		

		
		

	}

}
