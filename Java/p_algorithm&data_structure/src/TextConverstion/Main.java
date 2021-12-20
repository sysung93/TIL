package TextConverstion;

import java.util.Scanner;

public class Main {
    public String solution(String str){
        String answer = "";
        for(char x : str.toCharArray()){
            if(Character.isLowerCase(x)){ //x가 소문자인지 물어보는 것
                answer += Character.toUpperCase(x);
            }else{
                answer += Character.toLowerCase(x);
            }
           /* if(x >= 65 && x<=90){ //askii코드 대문자 65-90 소문자 97-122
                answer += (char)(x-32);
            }else{
                answer += (char)(x+32);
            }*/
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.print(T.solution(str));


    }
}
