import java.util.Scanner;

public class exam05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double richter = sc.nextDouble();
		
		if(richter < 5.0) {
			System.out.println("경미하거나 거의 피해 없음");
		} else if(richter < 5.5) {
			System.out.println("약간의 피해");
		} else if(richter < 6.5) {
			System.out.println("중대한 피해, 벽이 부서지거나 떨어짐");
		} else if(richter < 7.5) {
			System.out.println("재해, 집 또는 건물이 붕괴될 수 있음");
		} else
				System.out.println("재앙, 대부분의 건물이 붕괴됨");

	}

}
