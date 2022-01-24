//{1,2,3,4} 10
//{5,6,7,8}
//{9,10,11,12}
//{13,14,15,16}
//행열 합 구하기
public class exercise01 {
    /*
    public static void display(int [][]nums){
        int i, j;
        for(i = 0; i < nums.length; i++){
            for(j = 0; j < nums.length; j++){
                System.out.printf("%3d", nums[i][j]);
                System.out.println();
            }
        }
    }
*/
    public static void main(String[] args){
        int i, j;
        int[][] arr = {{1,2,3,4,0},{5,6,7,8,0},{9,10,11,12,0},{13,14,15,16,0},{0,0,0,0,0}};
        for(i = 0; i < 4; i++){
            for(j = 0; j < 4; j++){
                arr[i][4] += arr[i][j];
                arr[4][j] += arr[i][j];
                arr[4][4] += arr[i][j];
            }
        }

        for(i = 0; i < arr.length; i++){
            for(j = 0; j < arr.length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}