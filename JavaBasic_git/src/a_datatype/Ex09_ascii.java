package a_datatype;

/*
 * c언어의 문자: Ascii_code
 *             한글자를 1B(8bit)로 표현
 *             
 * java언어의 문자 : unicode
 *             한글자를 2B(16bit)로 표현
 * 
 */

/* 메모리 단위
 * 
 *     '1bit: 0(off) /1(on)
 *     '8bit= 1Byte
 *     '1024B=1KB
 *     '1024MB= 1GB
 *     '1024GB= 1TB
 * 
 */

/* [십진수] 숫자10개 : 0,1,2,3,4,5,6,7,8,9
 * 
 *    365 =3*10(2) + 6*10(1) + 5*10(0)
 *        =3*100 +  6*10+ 5*1
 *        =300+60+5
 * 
 * [이진수] 숫자2개 : 0,1
 * 
 * 11010 = 1*2(4) + 1*2(3) + 0*2(2) + 1*2(1) + 0*2(0)
 *       = 1*16+ 1*8+ 0*4+ 1*2+0*1
 *       =16+8+2
 *       =26
 *  
 *[십육진수] 숫자16개 :0,1,2,3,4,5,6,7,8,9 +A,B,C,D,E,F
 * 
 *       6F= 6*16(1)+ 15*1
 *         = 96+15
 *         =111
 *
 * 
 */
public class Ex09_ascii {

	public static void main(String[] args) {
		
		int a ; //4B 정수
		a= 'a'; //4B 변수에 2B값 지정
		
		System.out.println(a);
		
		char ch = (char)70;
		System.out.println(ch);
	}

}
/* [Ascii-code] 1B = 8bit
 * 
 *  _ _ _ _ _ _ _ _
 *  
 *  0 1 0 0         대문자
 *          0 0 0 1 A
 *          
 *  0 1 0 0 0 0 1 0 B
 *  0 1 0 0 0 0 1 1 C
 *  
 *          
 *          A: 01000001 = 1*2(6) + 1*2(0)
 *                      = 64 + 1
 *                      =65
 *    소문자a
 *    
 *                      
*/
