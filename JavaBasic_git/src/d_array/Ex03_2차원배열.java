package d_array;

public class Ex03_2차원배열 {

	public static void main(String[] args) {

		char[][] alpha = new char[3][4];//사각형3*4형태의 구조가 아님
		//값입력                   [저장될 1차원 배열의 수][각 1차원 배열의 길이] 
//		for(int i=0; i<alpha.length; i++) {  //
//			for(int j=0; j<4; j++) {
//				alpha[i][j]= '*';
//			}
//			
//		}
		char ch = 'A';                  //
		for(int i=0; i<alpha.length; i++) {
			for(int j=0; j<alpha[i].length; j++) {
				alpha[i][j]= ch; 
				ch++;
			}
		}
		for(int i=0; i<alpha.length; i++) {
			for(int j=0; j<alpha[i].length; j++) {
			System.out.print(alpha[i][j]+" ");
			}
			System.out.println();
		}
	}
}
