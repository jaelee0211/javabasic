package c_control;

import java.util.Scanner;

public class Ex06_for중첩_숫자사각형 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("숫자 2개 입력->");
		int row = input.nextInt();
		int col = input.nextInt();
		
		int su = 1;
		
		for(int i=0 ; i<row ; i++) {
			for(int j=0 ; j<col ; j++) { 
				System.out.print(su + " ");
				su++;
			}
			
			   System.out.println();
		}
		
//		for(int i=1; 1<=row ; i++) {
//			for(int j=1; j<=col ; j++) {
//				System.out.println(i*j + " ");
//			}
//			System.out.println();
//		}
		
		
	}
}
