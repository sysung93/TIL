public class Exercise01 {
    public static void main(String[] args) {
        //1. 은행 게좌번호를 저장할 account 변수 선언 계좌번호 "01-123-456"
        String account = "01-123-456";
        //2. 잔액을 저장할 balance 변수를선언 초기값 0
        int balance = 0;
        //3. 입금액을 저장할 deposit 변수를 선언 초기값 0
        int deposit = 0;
        //4. 출금액을 저장할 withdraw 변수를 선언 초기값 0
        int withdraw = 0;
        //5. 은행 이율을 계산할 rate 변수를 선언 이율 3.3
        double rate = 0.033;
        //6. 이자 금액을 저장할 interest 변수 선언 초기값 0.0
        double interest = 0.0;
        //7. deposit 변수에 입금할 500,000만원 저장
        deposit = 500000;
        //8. 잔액을 계산(balance = balance + deposit)
        balance = balance + deposit;
        //9. withdraw 변수에 출금할 200,000만원 저장
        withdraw = -200000;
        //10. 잔액계산(balance = balance + withdraw)
        balance = balance + withdraw;
        //11. 이자계산(interest = balance * rate)
        interest = balance * rate;
        //12. 현재 잔액출력
        System.out.println(balance+interest);
    }
}
