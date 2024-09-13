package 연습장;

import java.util.Scanner;

public class Ex_for숫자사각형 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 2개 입력");
		int row = sc.nextInt();
		int col = sc.nextInt();
		int c=1;
		
		for(int a=0; a<row ; a++) {
			if(a%2==0) {                        
				for(int b=0; b<col ; b++) {
					System.out.print(c +" ");
					c++;
				}
			}else {
				for(int b=0; b<col ; b++) {
					int sum =(-2)*b+col+c-1;
							System.out.print(sum +" ");
					c++;
				}
			}
			
			
//			for(int b=0; b<col ; b++) {
//				System.out.print(c +" ");
//				c++;
//			}
			System.out.println();
		}
	}
}
