package com.human.ex;

public class java009 {
	

	public static void main(String[] args) {
	
//		for(int i=0; i<1000; i++) {
//        int a=(int)(Math.random()*51)+5; //�ڿ� +5�� �����ϴ� �� �տ� *51�� 5~ 51���� ���ڸ� �������� ����
//         
//        if(a==55||a==44||a==11||a==22||a==33) {
//    	System.out.println(a);
//        }
//	
//		}
		
		String a="1";
		String b="2";
		boolean flag=true;
		
		for(int i=0; i<5; i++) {
		   if(flag) {
		     	System.out.print(a+" ");
		   }else {
			    System.out.print(b+" ");
		   }
		   if(i%2==0) {
			   flag=false;
		   }else {
			   flag=true;
		   }
		}
		
		
		
		
		
	
		
		
	}

}
