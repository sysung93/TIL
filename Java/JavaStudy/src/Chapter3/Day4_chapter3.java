package Chapter3;

public class Day4_chapter3 {
    public static void main(String[] args) {
        //Inpinity와 Nan
        int x = 5;
        double y = 0.0;

        double z = 5/y;
        System.out.println(Double.isInfinite(z));

        double n = 5%y;
        System.out.println(Double.isNaN(n));

        if(Double.isInfinite(z) || Double.isNaN(z)) {
            System.out.println("값 산출 불가");
        } else {
            System.out.println( z + 2);
        }

    }
}
