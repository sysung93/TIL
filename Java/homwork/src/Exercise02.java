public class Exercise02 {
    public static void main(String[] args) {
        int num = 10;
        int sum1 = 0;
        int sum2 = 0;

        //num이 홀수이면 0 부터 num까지 홀수의 합을 출력, 짝수이면 짝수 합 출력
        for(int i = 0; i <= num; i++) {
            if (i % 2 == 0) {
                sum1 += i;
            } else {
                sum2 += i;
            }
        }

        if(num % 2 == 0) {
            System.out.println(sum1);
        } else {
        System.out.println(sum2);
        }
    }
}
