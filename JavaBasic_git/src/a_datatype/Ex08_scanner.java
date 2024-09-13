package a_datatype;

/*
 *   자바에서 콘솔 입력받는 방법
 * 
 *       - java.util.Scanner 클래스 이용 
 * 
 *       - 정수형 입력시 : nextInt()
 *       - 실수형 입력시 : nextDouble()
 *       - 문자열 입력시 : next() / nextLine() ***[숙재] 차이점??
 * 
 */

import java.util.*;

public class Ex08_scanner {

	public static void main(String[] args) {
		
		int kor, eng, math, total;
		
		
		
		
    Scanner input = new Scanner (System.in);
    System.out.print("국어입력->");
    kor = input.nextInt();
    System.out.print("영어입력->");
    eng = input.nextInt();
    System.out.print("수학입력->");
    math= input.nextInt();
   
  //영어점수입려받기, 수학점수입력받기,출력
    total= kor+ eng+ math;
    
    System.out.println("국어:" + kor);
    System.out.println("영어:" + eng);
    System.out.println("수학:" + math);
    System.out.println("총점:" + total);
	}
	

}
