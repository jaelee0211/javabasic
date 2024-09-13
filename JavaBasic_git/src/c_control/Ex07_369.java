package c_control;

public class Ex07_369 {

	public static void main(String[] args) {

		for(int i=1; i<=50; i++) {
			int su = i;
			boolean su369= false;

			while(su!=0) {
				int na = su%10;            //0이 될때까지 반복

				if(na==3| na==6|na==9) {
					System.out.print("짝");
					su369 = true;
				}
				su=su / 10;

			}
			if(!su369) System.out.println(i);
			else System.out.println();
		}
	}
}
