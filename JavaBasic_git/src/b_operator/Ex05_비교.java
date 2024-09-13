package b_operator;

/*
 * 
 *  비교연산자
 *  
 *   > >= < <= == !=
 */
public class Ex05_비교 {

	public static void main(String[] args) {
		int kor =89 , eng=87 , math= 77;   
		// 총점, 평균을 구해서 변수에 저장하고 출력
		int total = kor + eng+ math;
		System.out.println("총점= " + total);
		double ave = total/3 ;
				System.out.println("평균= " + ave);
		
				double ave2 = total/3.0 ;
				System.out.println("평균= " + ave2);
				
				double ave3 = (double)total/3 ;
				System.out.println("평균= " + ave3);
				
				/*
				 * [학점 구하기]
				 * 
				 * 평균이 90점 이상이면 A학점
				 * 평균이 80이상 90미만이면 B학점
				 * 평균이 70이상 80미만이면 C학점
				 * 
				 */
				/*
				if(ave >= 90) {                               //만약에 평균값이 90이상이라
					System.out.println("A학점");               //그렇다면 'A'학점 출력
				}else if(ave >= 80){                          //그렇지않다면 만약에 평균값이 80이상이라면
					System.out.println("B학점");                //그렇다면 'B'학점 출력
				}else if(ave >= 70){
					System.out.println("C학점");
				}
	      */
				/*
				if(ave >= 90) {                               //만약에 평균값이 90이상이라
					System.out.println("A학점");               //그렇다면 'A'학점 출력
				} if(ave >= 80){                             //만약에 평균값이 80이상이라면
					System.out.println("B학점");              //그렇다면 'B'학점 출력
				}if(ave >= 70){
					System.out.println("C학점");
				}	
				*/
				/*
				if(ave >= 70) {                            
					System.out.println("C학점");             
				}else if(ave >= 80){                      
					System.out.println("B학점");            
				}else if(ave >= 90){
					System.out.println("C학점");
				}	
				*/
				
	}

}
