import java.util.Scanner;

public class exam02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int money = sc.nextInt();
		
		int num5000 = (money/50000);
		int num1000 = (money%50000)/10000;
		int num500 = (money%10000)/5000;
		int num100 = (money%5000)/1000;
		int num50 = (money%1000)/500;
		int num10 = (money%500)/100;
		int num5 = (money%100)/50;
		int num1 = (money%100)/10;
		
		System.out.println("50000 -----> " + num5000 + "장");
		System.out.println("10000 -----> " + num1000 + "장");
		System.out.println("5000 -----> " + num500 + "장");
		System.out.println("1000 -----> " + num100 + "장");
		System.out.println("500 -----> " + num50 + "장");
		System.out.println("100 -----> " + num10 + "장");
		System.out.println("50 -----> " + num5 + "장");
		System.out.println("10 -----> " + num1 + "장");
		
		
		
	}

}
