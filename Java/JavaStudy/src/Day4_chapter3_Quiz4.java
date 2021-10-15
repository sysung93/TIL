public class Day4_chapter3_Quiz4 {
    public static void main(String[] args) {
       //문제 8
       //NaN검사 코드

        double x = 5.0;
        double y = 0.0;

        double z = x % y;

        if(Double.isNaN(z)) {
            System.out.println("0.0으로 나눌 수 없습니다");
        } else {
            double result = z + 10;
            System.out.println("결과:" + result);
        }


    }
}
