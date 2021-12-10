
package chapter5;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Day7_Exercise09 {
    public static void main(String[] args) {
        //최고 점수 및 평균점수 구하시오

        boolean run = true;
        int studentNum = 0;
        int[] scores = null;

        int max = 0;
        int sum = 0;
        int count = 0;
        double avg = 0;

        Scanner scanner = new Scanner(System.in);

        while(run) {
            System.out.println("-------------------------------------------------");
            System.out.println("1.학생수 | 2.점수영역 | 3.점수리스트 | 4.분석 | 5.종료 ");
            System.out.println("-------------------------------------------------");
            System.out.print("선택> ");

            int selectNO = scanner.nextInt();

            if(selectNO == 1) {
                System.out.print("학생수> ");
                studentNum = scanner.nextInt();

            } else if(selectNO == 2) {
                scores = new int[studentNum];
                for(int i = 0; i < scores.length; i++) {
                    System.out.print("scores[" + i + "]> ");
                    scores[i] = scanner.nextInt();
                }
            } else if(selectNO == 3) {
                for(int i = 0; i < scores.length; i++) {
                    System.out.println("scores[" + i + "]:" + scores[i]);
                }
            } else if(selectNO == 4) {
                for(int i = 0; i < scores.length; i++) {
                    max = Math.max(max, scores[i]);
                }
                System.out.println("최고 점수: " + max);

                for(int i = 0; i < scores.length; i++){
                    sum += scores[i];
                    count++;
                }
                avg = (double) sum / count;
                System.out.println("평균 점수: " + avg);

            } else if(selectNO == 5) {
                System.out.print("프로그램종료");
                break;
            }
        }

    }
}
