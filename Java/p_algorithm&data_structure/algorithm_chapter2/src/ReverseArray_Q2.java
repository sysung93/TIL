import java.util.Scanner;

public class ReverseArray_Q2 {

    //배열 요소 a[idx1]과 a[idx2]의 값을 바꿈꿈
   static void swap(int[] a, int idx1, int idx2){
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
   }
   static void reverse(int[] a){
       for(int i = 0; i < a.length / 2; i++){
           swap(a, i, a.length-1-i);
           System.out.printf("a[%d]과(와) a[%d]를 교환합니다.\n",i,a.length-1-i);
           printa(a);
       }
   }

   static void printa(int[] a){
       for(int i = 0; i < a.length; i++){
           System.out.print(a[i] + " ");
       }
       System.out.println();
   }

   public static void main(String[] args) {
       int[] a = {5, 10, 73, 2, -5, 42};
       printa(a);
       reverse(a);
   }
}
