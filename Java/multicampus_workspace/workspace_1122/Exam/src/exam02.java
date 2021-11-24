import java.util.Scanner;

//화페개수세기
/*(연습문제 2) 화폐개수 세기
10만원 짜리 수표가 들어가는 자판기를 만들려고 합니다. 
자판기에 수표를 입력하면 거스름돈을 계산하여 정확하게 필요한 
화폐들의 개수를 계산하여야 합니다. 
이를 계산하는 프로그램을 작성하시오.
*/
public class exam02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		int num1000 = (a/10000);
		int num500 = (a%10000)/5000;
		int num100 = (a%5000)/1000;
		int num50 = (a%1000)/500;
		int num10 = (a%500)/100;
		int num5 = (a%100)/50;
		int num1 = (a%50)/10;

		
		
		System.out.println("10000 -------> " + num1000 + "장");
		System.out.println("5000 -------> " + num500 + "장");
		System.out.println("1000 -------> " + num100 + "장");
		System.out.println("500 -------> " + num50 + "장");
		System.out.println("100 -------> " + num10 + "장");
		System.out.println("50 -------> " + num5 + "장");
		System.out.println("10 -------> " + num1 + "장");
	}

}
