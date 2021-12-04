package numbergame;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

// Random 숫자를 제공하고 5번안에 맞추는 게임
// 입력값과 정답을 비교하는 문구 나옴

public class NumberGame {
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();
    int computer = rand.nextInt(10) + 1;
    int cnt = 0;
    boolean match = false;
    int num;
    ArrayList<Integer> numList = new ArrayList<>();

    public void start() {
        while (cnt < 5 && match == false) {
            num = sc.nextInt();
            numList.add(num);
            cnt++;
            if (computer > num) {
                System.out.println("입력값이 작습니다.");
            } else if (computer < num) {
                System.out.println("입력값이 큽니다.");
            } else {
                System.out.println("정답이 맞습니다.");
                match = true;
            }
        }
        if(match) {
            System.out.printf("%d번만에 맞췄습니다.\n",cnt);
        } else {
            System.out.println("아쉽군요 기회를 다 사용했습니다.");
        }
    }
}
