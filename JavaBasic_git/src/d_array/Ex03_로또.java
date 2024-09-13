package d_array;

public class Ex03_로또 {
	
	public static void main(String[] args) {
		
		int[][] lotto = new int[5][6];
		//값지정: 임의의 값
		int num =0;
		for(int i=0; i<lotto.length; i++) {
			for(int j=0; j<6; j++) {
				lotto[i][j]= num;
				
			}
			
		//출력
			for(int i=0; i<lotto.length; i++) {
				for(int j=0; j<6; j++) {
				System.out.print(lotto[i][j]+" ");
				}
				System.out.println();
			}
			}

}
