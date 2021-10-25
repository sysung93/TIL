package chapter3;

public class Day4_chapter3_2 {
    public static void main(String[] args) {
        // 입력값의 NaN 검사

        String userInput = "NaN";

        Double val = Double.valueOf(userInput);

        double currentBalance = 10000.0;

        if(Double.isNaN(val)){
            System.out.println("NaN이 입력되어 처리할 수 없음");
            val = 0.0;
        }

        currentBalance += val;
        System.out.println(currentBalance);
    }
}
