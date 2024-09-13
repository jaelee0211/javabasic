package c_control;

public class Ex07_방탈출 {

	public static void main(String[] args) {
		int count = 0;
		
		for(int i=1; i<=10000; i++) {
			int num = i;  
			                
			while(num>0) {   
				if((num%10)==8) {  
					count++;       
				}                 
				
				num /= 10;
			}
		}
		
		System.out.println(count);
	}
}
/*
 * i는 반복되기 전까지는 증가가 되지 않기 때문 변수 num으로 한번 더 설정
 * num을 10으로 나누었을 때 나머지 값이 8일때 count증가 num의 수가 0이
 * 될 때까지 10으로 나누고 if문에서 반복 
 * 이 과정을 i=1에서부터 10000까지 반복하여 8의 수를 센 값의 합을 count로 출력 
 */

