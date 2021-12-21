import java.util.Scanner;

public class algorismProject1 {
    static int []nums= new int[]{13, 1, 15, 17, 6, 9, 8, 7, 4, 11};

    static void display(int []nums, int start, int end)
    {
        for(int i=start; i<=end; i++)
            System.out.printf("%3d", nums[i]);
        System.out.println();
    }

    //퀵정렬은 재귀호출을 사용하는 알고리즘
    static void quicksort( int []nums, int start, int end)
    {
        //start~end 까지가 정렬을 해야할 범위가 된다.
        if(start>=end) return;//배열이 분해되다가 요소가 하나가 되면 그만 하고 리턴하자

        //1.기준점 - 프로그래머 마음
        int key, left, right;//기준점의 위치, 정렬의 왼쪽 하한, 오른쪽 상한

        key = start; //절대 0주면 큰일난다.
        left = start+1;
        right = end;

        while(left<=right)
        {
            //left는 우측 상한을 만나던가 기준값보다 큰값을 만나거나
            while(left<=end && nums[left] <= nums[key] ) left++;//상한을 벗어날 수 있다
            while(right>start && nums[right] >= nums[key] ) right--;//상한을 벗어날 수 있다

            //  0 && A 언제나 0의 결과가 나온다 뒤에 연산할 필요가 없다.
            //  1 || A 언제나 1

            if(left <=right)
            {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right]=temp;
            }
            else
            {
                int temp = nums[key];
                nums[key] = nums[right];
                nums[right]=temp;
            }
        }

//      display(nums, start, right-1);
//      System.out.println();
//      display(nums, right+1, end);
        quicksort(nums, start, right-1);
        quicksort(nums, right+1, end);

    }

    public static void main(String[] args) {
//      display(nums, 0, 9);
//      display(nums, 3, 7);
//      display(nums, 6, 9);
//
//      quicksort(nums, 0, 9);  // 0,4  , 5,  6~9
//      display(nums, 0, 9);

        Scanner sc = new Scanner(System.in);

        System.out.print("학생숫자는 ?");
        int count = sc.nextInt();
        nums = new int[count];

        for(int i=0; i<count; i++)
        {
            System.out.print("성적 : ");
            nums[i] = sc.nextInt();
        }

        quicksort(nums, 0, count-1);
        display(nums, 0, count-1);

    }
}









