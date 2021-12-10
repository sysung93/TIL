package chapter11.API_Class14;

import java.text.MessageFormat;
import java.util.Objects;

public class MessageFormatExample {
    public static void main(String[] args) {
        String id = "java";
        String name = "신용권";
        String tel = "010-123-5678";

        String text  = "회원 ID: {0} \n회원 이름: {1} \n회원 전화: {2}";
        String result1 = MessageFormat.format(text, id, name,tel);
        System.out.println(result1);

        System.out.println();

        /*String sql = "insert into member values({0}, {1}, {2})";
        Objects[] arguments = {"'java'", "'신용권'", "'010-123-4567'"};
        String result2 = MessageFormat.format(sql, arguments);
        System.out.println(result2);*/

    }
}
