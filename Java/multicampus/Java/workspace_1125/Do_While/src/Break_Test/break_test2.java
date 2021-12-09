package Break_Test;

public class break_test2 {
	public static void main(String[] args) {
		//break = switch, for, while, do한테만 영향을 미친다
		
		int i,j;
		for(i = 1; i <= 10; i++) {
			for(j =1; j <= 10; j++) {
				if(i == 6) {
					break; //for 블럭을 찾아서 빠져나간다
				} System.out.print(j + " ");
			} System.out.println();
		}
		
		for(i = 1; i <= 10; i++) {
			for(j =1; j <= 10; j++) {
				if(i == 6) {
					continue; // continue 다음 문정 건너 뛰어서 증감식으로 점프
				}System.out.println(i);
			} 
		}
	}

}
