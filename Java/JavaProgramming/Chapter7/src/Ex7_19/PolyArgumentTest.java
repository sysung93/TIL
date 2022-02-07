package Ex7_19;

public class PolyArgumentTest {
    public static void main(String[] args) {
        Ex7_19.Buyer b = new Buyer();
        b.buy(new Tv());
        b.buy(new Computer());
        b.buy(new Audio());
        b.summary();

    }
}
