package c_control;

import java.util.Scanner;

public class Ex06_예제 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력");
		int row = sc.nextInt();
		int c=1;
		for(int a=0 ; a<row ; a++,c-=15) {
			for(int b=0; b<row ; b++) {
				System.out.print(c+" " );
				c+=4;
			}
			System.out.println();
		}
		
		
			
		}
	}

