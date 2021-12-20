public class min1 {
    static int min1(int a, int b, int c) {
        int min = a;

        if(min > b){
            min = b;
        }
        if(min > c){
            min = c;
        }
        return min;
    }

    public static void main(String[] args) {
        System.out.println(min1(1,2,3));
    }
}

