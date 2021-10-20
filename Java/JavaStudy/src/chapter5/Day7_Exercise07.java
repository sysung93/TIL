package chapter5;

public class Day7_Exercise07 {
    public static void main(String[] args) {
        //다음 배열의 항목에서 최대값 구하기(for문 이용)


        int[] array = {1, 5, 3, 8, 2};
        int max = array[0];

        for(int i = 1; i < array.length; i++){
            max = Math.max(max,array[i]);
        }
        System.out.println(max);

        for(int v : array){
            if(max < v){
                max = v;
            }
        }
        System.out.println(max);

    }
}
