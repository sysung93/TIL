
public class max2 {
    //3개의 정수값 구하기
    static int max2(int a, int b, int c){
        int max = a;
        if(max < b) {
            max = b;
        }
        if(max < c){
            max = c;
        }
        return max;
    }

    public static void main(String[] args) {

        System.out.println("최댓값은" + max2(1, 2, 3) + "입니다.");
    }
}
