package chapter8.Interface05.exam01;

public class HankookTire implements Tire{
    @Override
    public void roll() {
        System.out.println("한국 타이어가 굴러갑니다.");
    }
}
