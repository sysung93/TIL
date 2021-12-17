import java.util.Scanner;

public class max3 {
    //네 값의 최댓값을 구하는 max4 메서드 작성하기

    static int max3(int a, int b, int c, int d){
        int max = a;

        if(max < b){
            max = b;
        }
        if(max < c){
            max = c;
        }
        if(max < d){
            max = d;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(max3(1,2,3,4));
    }
}
