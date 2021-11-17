package chapter12.Thread01.exam01;

import java.awt.*;

public class BeepPrintExample3 {
    public static void main(String[] args) {
        // How 1
        /*Thread thread = new BeepThread();
        thread.start();*/

        // How 2
        Thread thread = new Thread() {
            @Override
            public void run() {
                Toolkit toolkit = Toolkit.getDefaultToolkit();
                for (int i = 0; i < 5; i++) {
                    toolkit.beep();
                    try {
                        Thread.sleep(500);
                    } catch (Exception e) {
                    }
                }
            }
        };
        thread.start();

        // "띵"문자열을 5번 출력하는 작업
        for(int i = 0; i < 5; i++) {
            System.out.println("띵");
            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
        }
    }
}
