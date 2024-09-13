package b_operator;


public class Ex07_이진논리 {
             public static void main(String[] args)  {    
	      
	
    int a = 15;      //00000000 00000000 00000000 00001111
    int b = 10;      //00000000 00000000 00000000 00001010
    
    int and = a&b ;  //00000000 00000000 00000000 00001010     
     System.out.println("and="+ and);
    
    int Or = a|b;    //00000000 00000000 00000000 00001111
    System.out.println("Or="+ Or);

    int exc = a^b;   //00000000 00000000 00000000 00000101
    System.out.println("exc="+ exc);
    
    }  
	
}	




/*
 *   논리연산자(이진=비트)
 *    
 *   A   B     A&B    A|B    A^B   
 *   -----------------------------
 *   0   0      0      0      0
 *   0   1      0      1      1
 *   1   0      0      1      1
 *   1   1      1      1      0
 * 
 */
