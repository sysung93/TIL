import java.util.Random;
import java.util.Scanner;

public class MaxOfArrayRand_Q1 {
    static int maxOf(int[] a){
        int max = a[0];
        for(int i = 1; i < a.length; i++){
            if(max < a[i]){
                max = a[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("키의 최대값을 구합니다");

        int num = rd.nextInt(10);
        System.out.println("사람 수: " + num);

        int[] height = new int [num];

        for(int i = 0; i < num; i++){
            height[i] = 100 + rd.nextInt(100);
            System.out.println("height[" + i + "] :" + height[i]);
        }
        System.out.println("최댓값은 " + maxOf(height) + "입니다");

    }
}
