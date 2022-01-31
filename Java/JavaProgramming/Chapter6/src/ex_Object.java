public class ex_Object {
    public static void main(String[] args) {
        Tv t = new Tv();
        t.channel = 7;
        t.channelDown();
    }
}
    class Tv{
        // tv 속성멤버 변수
        String color;
        boolean power;
        int channel;


        // Tv의 기능(메소드)
        void power() {
            power = !power;
        }

        void channelUp() {
            ++channel;
        }

        void channelDown() {
            --channel;
        }
    }

