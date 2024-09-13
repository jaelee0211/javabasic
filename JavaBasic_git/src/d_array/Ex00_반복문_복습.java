package d_array;

public class Ex00_반복문_복습 {

	public static void main(String[] args) {
		
//		double temp = Math.random();  //0.0<= 랜덤값<1.0
//		System.out.println(temp);
		
		//for 문
		for(int i=0; i<6;i++){
		int temp = (int)(Math.random()*10)+1 ;  //1부터 10까지의 랜덤수 나옴
		System.out.print(temp+"/");
		}
	    //while문
		int num= 0;
		while(num<6) {
			int temp = (int)(Math.random()*10)+1 ; 
			System.out.print(temp+"/");
			num++;
		}
	    // do while
		int b= 0;
		 do{
			int temp = (int)(Math.random()*10)+1 ; 
			System.out.print(temp+"/");
			b++;
		 }while(b<6);
		 System.out.println();
	     
	
	}
}
