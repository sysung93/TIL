package chapter12.Thread01.exam02;

public class ThreadA extends ThreadB {
    public ThreadA() {
        setName("ThreadA");
    }
    @Override
    public void run() {
        for(int i = 0; i < 2; i++) {
            System.out.println(getName() + "가 출력한 내용");
        }
    }
}
