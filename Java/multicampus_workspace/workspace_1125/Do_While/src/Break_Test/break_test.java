package Break_Test;

public class break_test {
	public static void main(String[] args) {
		//break = switch, for, while, do한테만 영향을 미친다
		
		int i;
		for(i = 1; i <= 10; i++) {
			if(i == 6) {
				break; //for 블럭을 찾아서 빠져나간다
			}
			System.out.println(i);
		}
	}

}
