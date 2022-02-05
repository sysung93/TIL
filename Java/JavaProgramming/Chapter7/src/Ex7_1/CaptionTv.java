package Ex7_1;

public class CaptionTv extends Tv{
    boolean caption;
    void displayCation(String text){
        if(caption){
            System.out.println(text);
        }
    }
}
