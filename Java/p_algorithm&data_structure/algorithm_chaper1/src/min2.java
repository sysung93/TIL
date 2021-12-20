public class min2 {
    static int min2(int a, int b, int c, int d) {
        int min = a;

        if(min > b){
            min = b;
        }
        if(min > c){
            min = c;
        }
        if(min > d){
            min = d;
        }
        return min;
    }

    public static void main(String[] args) {
        System.out.println(min2(1,2,3, 4));
    }
}

