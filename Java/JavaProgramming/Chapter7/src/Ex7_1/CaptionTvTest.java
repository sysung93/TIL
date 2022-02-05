package Ex7_1;

public class CaptionTvTest {
    public static void main(String[] args) {
        CaptionTv ctv = new CaptionTv();
        ctv.channel = 10;
        ctv.channelUp();
        System.out.println(ctv.channel);

        ctv.displayCation("hello, world");
        ctv.caption = true;
        ctv.displayCation("hello, world");
    }
}
