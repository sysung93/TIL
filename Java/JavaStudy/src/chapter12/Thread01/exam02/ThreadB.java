package chapter12.Thread01.exam02;

public class ThreadB extends java.lang.Thread {
    @Override
    public void run() {
        for(int i = 0; i < 2; i++) {
            System.out.println(getName() + "가 출력한 내용");
        }
    }
}
