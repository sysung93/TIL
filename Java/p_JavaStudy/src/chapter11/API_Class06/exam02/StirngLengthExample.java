package chapter11.API_Class06.exam02;

public class StirngLengthExample {
    public static void main(String[] args) {
        String ssn = "7306241230123";
        System.out.println(ssn.length());

        if(ssn.length() == 13) {
            System.out.println("주민번호 자리수가 맞습니다.");
        } else {
            System.out.println("주민번호 자리수가 틀립니다.");
        }
    }
}
