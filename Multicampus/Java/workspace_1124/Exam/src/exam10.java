import java.util.Scanner;

public class exam10 {
	public static void main(String[] args) {
		//1 ~ n까지의 정수의 합산이 1000을 넘는 최초의 n의 값
		Scanner sc = new Scanner(System.in);
		
		int i = 1;
		int sum = 0;
		
		while ( sum < 1000) {
			sum += i;
			i++;
		} System.out.println(i-1);
	}

}
