package chapter12.Thread06.exam06_stop;

public class PrintThread2 extends Thread{
    @Override
    public void run() {
//        while(true) {
//            System.out.println("실행 중");
//            try {
//                Thread.sleep(1);
//            } catch (InterruptedException e) { }
//        }

        while(true) {
            System.out.println("실행 중");
            if(Thread.interrupted()) {
                break;
            }
        }
        System.out.println("자원 정리");
        System.out.println("실행 종료");
    }
}
