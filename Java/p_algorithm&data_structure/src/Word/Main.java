package Word;

import java.util.Scanner;

public class Main {
    public String solution(String str){
        String answer = "";
        int m = Integer.MIN_VALUE, pos; //가장 작은 값으로 초기화
        /*String[] s = str.split(" "); // 공백으로 분리
        for(String x : s){
            int len = x.length();
            if(len > m){
                m = len;
                answer = x;
            }
        }*/

        while((pos = str.indexOf(' ')) != -1){
            String tmp = str.substring(0,pos);
            int len = tmp.length();
            if(len > m){
                m = len;
                answer = tmp;
            }
            if(str.length()>m) answer = str; //마지막단어 처리
            str = str.substring(pos+1);
        }

        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.print(T.solution(str));
    }
}
