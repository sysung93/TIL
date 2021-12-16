public class exercise02 {
    public static void main(String[] args) {
        int[][] arr = new int[10][10];
        int i, j;
        int k = 1;

        for(i = 0; i < 10; i++){
            for(j = 9-i; j < 10; j++){
                arr[i][j] = k++;
            }
        }

        for(i = 0; i < arr.length; i++){
            for(j = 0; j < arr.length; j++){
                System.out.printf("%3d",arr[i][j]);
            }
            System.out.println();
        }

    }
}
