package e_method;

import java.util.*;

public class Ex99_복습3 {
	
	public static void main(String[] args) {
		
		input();
		output();
		
	}
	 static void output() {
       
		 System.out.println("i"+", n"+", m");
		 
	 }
	 static void input() {
		 Scanner input =new Scanner(System.in);
		 System.out.println("입력하시오(입력 예시 2 ,3 , a)->");
		 int i = input.nextInt();
		 int n = input.nextInt();
		 char m = input.nextLine().charAt(0);
		 input.close();
		 makeSquare('i','n','m');
	 }
	 
	 static void makeSquare(int i,int n, char m ) {
		 char [][] ch = new char['i']['n'];
		 
	 for(int a=0; a<ch.length;a++) {
		 for(int b=0; b<ch[a].length; b++) {
			 ch[a][b]= m;
		           m++;
		    System.out.print(ch[a][b]+" ");
		 		 
		 }
		 System.out.println(); 
	 }
	 
			
		
	 }
	 }

