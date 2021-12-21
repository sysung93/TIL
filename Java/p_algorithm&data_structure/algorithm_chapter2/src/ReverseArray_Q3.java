import java.util.Scanner;

public class ReverseArray_Q3 {

    //배열 a의 모든 요소의 합계를 구하여 반환하는 메서드 작성
   static int sum(int[] a){

   }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("요솟수 : ");
        int num = sc.nextInt();

        int[] x = new int[num]; //요솟수가 num인 배열

        for(int i = 0; i < num; i++){
            System.out.print("x[" + i + "] :");
            x[i] = sc.nextInt();
        }

        revers(x); //배열 a의 요소를 역순으로 정렬
        System.out.println("요소를 역순으로 정렬했습니다.");
        for(int i = 0; i < num; i++){
            System.out.println("x[" + i + "] = " + x[i]);
        }
    }
}
