package chapter12.Thread01.exam02;

public class ThreadNameExample {
    public static void main(String[] args) {
        Thread thread = Thread.currentThread();
        System.out.println("프로그램 시작 스레드 이름: " + thread.getName());

        Thread threadA = new ThreadA();
        System.out.println("ThreadA를 생성한 스레드: " + thread.currentThread().getName());
        threadA.start();

        Thread threadB = new ThreadB();
        System.out.println("ThreadB를 생성한 스레드: " + thread.currentThread().getName());
        threadB.start();
    }
}
