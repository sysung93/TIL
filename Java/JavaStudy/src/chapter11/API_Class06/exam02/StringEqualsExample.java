package chapter11.API_Class06.exam02;

public class StringEqualsExample {
    public static void main(String[] args) {
        String strVar1 = new String("신민철");
        String strVar2 = "신민철";
        String strVar3 = "신민철";

        if(strVar1 == strVar2) {
            System.out.println("같은 String 객체를 참조");
        } else{
            System.out.println("다른 String 객체를 참조");
        }

        if(strVar2 == strVar3) {
            System.out.println("같은 String 객체를 참조");
        } else{
            System.out.println("다른 String 객체를 참조");
        }

        System.out.println();

        if(strVar1.equals(strVar2)) {
            System.out.println("같은 문자열을 가짐");
        } else {
            System.out.println("다른 문자열을 가짐");
        }


        if(strVar2.equals(strVar3)) {
            System.out.println("같은 문자열을 가짐");
        } else {
            System.out.println("다른 문자열을 가짐");
        }
    }

}
