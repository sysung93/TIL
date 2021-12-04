package numbergame;

import java.util.ArrayList;
import java.util.Scanner;

// 1. 게임시작, 전적, 종료버튼만들기
// 2. 몇번맞췄는지 만들기(정답, 사용자추측정답, 정답여부, 사용기회횟수,몇번중몇번만에 맞췄는지)

public class NumberGameMgr {
    Scanner sc = new Scanner(System.in);
    ArrayList<NumberGame> list = new ArrayList<>();

    public void start() {
        int num;
        do {
            System.out.println("1. 게임시작");
            System.out.println("2. 전적");
            System.out.println("3. 종료");
            switch (num = sc.nextInt()) {
                case 1:
                    NumberGame game = new NumberGame();
                    System.out.println("게임을 시작합니다.");
                    System.out.println("1-10까지 숫자를 하나만 골라 입력해주세요");
                    game.start();
                    list.add(game);
                    break;
                case 2:
                    displayHistory();
                    break;
                case 3:
                    return;
            }
        } while (true);
    }
    //전적만들기

    public void displayHistory() {
        for(NumberGame game : list) {
            System.out.print("정답 : " + game.computer + "\t");
            System.out.print("사용자 입력기록 : ");
            for(int a : game.numList) {
                System.out.print(a + ", ");
            }
            System.out.print("정답여부 : " + game.match + "\n");
            System.out.println("사용기회횟수 : " + game.cnt);
        }

        int cnt = 0;
        for(NumberGame game : list) {
            if(game.match) {
                cnt++;
            }
        }
       System.out.printf("총 %d번 시도해서 %d번 맞췄습니다. \n", list.size(), cnt);
    }
}
