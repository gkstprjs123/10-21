package com.human.ex;

public class start001 {

	public static void main(String[] args) {
		
//		int j=1;
//		
//		if(j>0) {
//			System.out.println("i은 양수");
//		}else {
//			if(j<0) {
//				System.out.println("i은 음수");
//			}else {
//				if(j==0) {
//					System.out.println("i은 0");
//				}else {
//					System.out.println("i은 양수, 음수, 0아님");
//				}
//			}
//		}
//		int i=1;
//		if(i>0) {
//			System.out.println("i은 양수 ");
//		}else if(i<0){
//			System.out.println("i은 음수");
//		}else if(i==0) {
//			System.out.println("i은 0");
//			
//		}else {
//			System.out.println("i은 양수, 음수, 0아님");
//		}
//

		//5는 최우수 4는 우수 3은 보통 2,1,0은 불합격
		
//		int i=5;
//		if(i==5) {
//			System.out.println("최우수");
//		}else if(i==4) {
//			System.out.println("우수");
//		}else if(i==3) {
//			System.out.println("보통");
//			
//		}else {
//			System.out.println("불합격");
//		}
		//2
//		java.util.Scanner scanner =
//				new java.util.Scanner(System.in);
//		
//			int a=0;
//		for(int i=6;a<6;) {
//			System.out.print("수입력");
//			a = Integer.parseInt(scanner.nextLine());
//		
//			if(a==5) {
//				System.out.println("최우수");
//			}else if(a==4) {
//				System.out.println("우수");
//			}else if(a==3) {
//				System.out.println("보통");
//				
//			}else {
//				System.out.println("불합격");
//			}
//		
//		}
		//switch case문으로 변경
		//기본적으로 명확한 점수만 허용
		//문자열 실수 허용하지 않음
		//최신프로그램언어나 자바에서 문자열이나 실수를 허용하기도함
		//switch는 범위 조회가 불가능하다. 명확한것만 가능.
		//범위조회를 하고 싶으면 else if 문을 사용하여야 한다.
		//break를 안쓰면 아래로 흘러내려서 break가 나오거나 default까지 다다를 때까지 아래 케이스들이 출력된다. 
		
		//미응시를 추가해보자. 미응시는 5~0이외의 숫자가 들어오면
		//미응시로 표기한다.
//		int i=1;
//		
//		switch(i) {
//		
//		case 5:
//			System.out.println("최우수");
//			break;
//		case 4:
//			System.out.println("우수");
//			break;
//		case 3:
//			System.out.println("보통");
//			break;
//		case 2:
//		case 1:
//		case 0:
//			System.out.println("블합격");
//			break;
//		default :
//			System.out.println("미응시");	
//			break;
//		}
//		
		
		//미응시를 추가해보자. 미응시는 5~0이외의 숫자가 들어오면
		//미응시로 표기한다.
//		int i=;
//		if(i==5) {
//			System.out.println("최우수");
//		}else if(i==4){
//			System.out.println("우수");
//		}else if(i==3){
//			System.out.println("보통");
//		}else if(i<3){
//			System.out.println("불합격");
//		}else if(i<0||i>5) {
//			System.out.println("미응시");
//		}
//		
	 	
		//1개만 출력하고 나머지가 같을때 boolean을 사용하면 좋음
		// and : 둘다 true면 true or: 둘중에 하나만 true면 true
		
		//a||b&&c 
		//t,t,f :  true  t,f,f: true  f,t,f: false  f,f,f: false  
//		boolean isFlag1=true,isFlag2=true;
//		
//		isFlag1=2>1;isFlag2=1>2;
//		
//		if(isFlag1==true){
//			if(isFlag1==true) {
//				System.out.println("1번isFlag1은 true isflag2는 true ");
//			}else {
//				System.out.println("2번 isFlag1은 true isflag2는 false ");
//			}
//		}else {
//			if(isFlag2==true) {
//				System.out.println("3번 isFlag1은 false isFlag2는 true");
//			}else {
//				System.out.println("4번 isflag1은 false isFlag2는 false ");
//			}
//		}
		//다음문제와 동일한 결과가 나오는 프로그램을 구현해보자
		//다음코드는 if문이 중첩되어있는데 if문을 중첩하지않고 같은 결과가 나오도록 기술.
		//if(isFlag1==true&&isFlag2==true)
		//isFlag1&&isFlag2
		
		//
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}