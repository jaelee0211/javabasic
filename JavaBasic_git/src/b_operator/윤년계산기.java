package b_operator;

import java.util.Scanner;

public class 윤년계산기 {
	public static void main (String[] args) {
		
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
			
		if(a%400 == 0) {
			System.out.println("윤년 맞음");
			
	}else if(a%100 == 0) {
		System.out.println("윤년 맞음");
	}else if (a%4 == 0)
		System.out.println("윤년 맞음");
}
	

}
/*
 * if(a%4 == 0) {	
 *     
 * 
 * 
*/
