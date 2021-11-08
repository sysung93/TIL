package chapter11.API_Class06.exam02;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

public class StringGetByteExample {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String str = "안녕하세요";

        byte[] bytes1 = str.getBytes();
        System.out.println("bytes.length: " + bytes1.length );
        String str1 = new String(bytes1);
        System.out.println("bytes1 -> String: " + str1);
        System.out.println();
        byte[] bytes2 = str.getBytes("EUC-KR");
        System.out.println("bytes2.length: " + bytes2.length);
        String str2 = new String(bytes2, "EUC-KR");
        System.out.println("bytes2 -> String: " + str2);
        System.out.println();
        byte[] bytes3 = str.getBytes("UTF-8");
        System.out.println("bytes3.length: " + bytes3.length);
        String str3 = new String(bytes3, "UTF-8");
        System.out.println("bytes3 -> String: " + str3);
    }
}
