

package first;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 1. 9개 숫자를 배열에 저장
 *
 * 2. 9개 숫자의 총합을 구해두기
 *
 * 3. 9개담은 숫자배열을 오름차순 정렬
 *
 * 3. 정렬된 숫자배열에서 2개를 골라서 총합해서 빼기
 *
 * 4. 이때 7개의 숫자가 남은거니까 이 총합이 100이면 정답
 *
 * 5. 해당 배열을 돌면서 고른숫자를 제외한 숫자들을 출력
 *
 */

public class bj2309_dwarf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];
        int sum = 0;

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        Arrays.sort(arr);

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                if(sum - (arr[i] + arr[j]) == 100){
                    for(int a = 0; a < arr.length; a++){
                        if(a != i && a != j) {
                            System.out.println(arr[a]);
                        }
                    }
                    return;
                }
            }
        }

    }

}
