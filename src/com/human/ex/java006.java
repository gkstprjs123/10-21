package com.human.ex;

public class java006 {
	

	public static void main(String[] args) {
	
		for(int i=0; i<1000; i++) {
        int a=(int)(Math.random()*51)+5; //뒤에 +5가 시작하는 수 앞에 *51이 5~ 51개의 숫자를 랜덤으로 나열
         
        if(a==55||a==44||a==11||a==22||a==33) {
    	System.out.println(a);
        }
	
		}
	
		
		
	}

}
