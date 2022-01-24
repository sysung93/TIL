class Sort
{
    int []nums;
    void init()
    {
        nums = new int[] {3, 1, 9, 8, 6, 7, 5, 4, 2, 10};
    }
    void display()
    {
        for(int n : nums) {
            System.out.printf("%3d", n);
        }
        System.out.println();
    }
   
   /*
    * 1. 셀렉트정렬 
    최대값 최소값 알고리즘을 응용

오름차순  :  젤 첫번째 방에 젤 작은값을 위치시키자 
            두번째방에 두번째 작은값을 위치시키자 
            세번째방에 세번째 작은값을 위치시키자 

    원본 :   
            3  1  9  8  6  7  5  4  2  10
            1  3  9  8  6  7  5  4  2  10    -------- 1바퀴  a[0]   a[1]~a[9]
               2  9  8  6  7  5  4  3  10    -------- 2바퀴  a[1]   a[2]~a[9]
                  3  9  8  7  6  5  4  10    -------- 3바퀴  a[2]   a[3]~a[9]
                     4  9  8  7  6  5  10    -------- 3바퀴  a[3]   a[4]~a[9]
                        5  9  8  7  5  10    -------- 3바퀴  a[4]   a[5]~a[9]
   */

    void selectSort1()
    {
        System.out.println("정렬중 .....................................");
        for(int i=0; i<nums.length-1; i++)
        {
            for(int j=i+1; j<nums.length; j++)
            {
                if(nums[i]>nums[j])
                {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
            System.out.printf("%3d 회: ", (i+1));
            display();
        }
        System.out.println("정렬완료 .....................................");
    }


    void selectSort2()
    {
        System.out.println("정렬중 .....................................");
        int min, pos;

        for(int i=0; i<nums.length-1; i++)
        {
            min = nums[i];
            pos=i;
            for(int j=i+1; j<nums.length; j++)
            {
                if(min>nums[j])
                {
                    min = nums[j];
                    pos=j;
                }
            }

            int temp = nums[i];
            nums[i] = nums[pos];
            nums[pos] = temp;

            System.out.printf("%3d 회: ", (i+1));
            display();
        }
        System.out.println("정렬완료 .....................................");
    }
   

   /*
    * 2. 버블정렬 
    오름차순:자기 옆자리랑 비교 더 큰애를 뒤로 보낸다.  거품처럼 보임 
          j , j+1   j-1 j
       
    원본 :   
            3  1  9  8  6  7  5  4  2  10                      0:   0 ~ 9
           1  3  8  6  7  5  4  2  9  10  뒤쪽부터 정렬이 이루어짐   1:   0 ~ 8 
           1  3  6  7  5  4  2  8  9                          2:   0 ~ 7
           1  3  6  5  4  2  7  8                             3:   0 ~ 6
           1  3  5  4  2  6  7
           1  3  4  2  5  6
           1  3  2  4  5
           1  2  3  4
           1  2  3
           1  2
              
           1 2 3 4 5 6 7 8 9 10
           
    */

    void bubbleSort1()
    {
        System.out.println("정렬중 .....................................");
        for(int i=0; i<nums.length-1; i++)
        {
            for(int j=0; j< nums.length-1 -i; j++)
            {
                if( nums[j] > nums[j+1])
                {
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
            System.out.printf("%3d 회: ", (i+1));
            display();
        }
        System.out.println("정렬완료 .....................................");
    }

    void bubbleSort2() //개선된 버블정렬
    {
        boolean flag=false;
        System.out.println("정렬중 .....................................");
        for(int i=0; i<nums.length-1; i++)
        {
            flag=false;
            for(int j=0; j< nums.length-1 -i; j++)
            {
                if( nums[j] > nums[j+1])
                {
                    flag=true;
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
            if(flag==false)
                break;
            System.out.printf("%3d 회: ", (i+1));
            display();
        }
        System.out.println("정렬완료 .....................................");
    }

    //삽입정렬 - 데이터를 자기 위치를 찾아서 끼워넣기
   /*
     3  1  9  8  6  7  5  4  2  10
              
   */
    void insertionSort()
    {
        int i, j;
        // 처음에 0은 이미 정렬된 것, 0번방에서 1번방 데이터가 들어가 우리치 찾고 나머지 땡기기 작업
        for (i = 1; i < nums.length; i++){
            int temp = nums[i]; //위치 찾을 변수 값을 temp에 저장
            //i번째 위치부터 0에 도달할 때까지
            for(j = i; j > 0 && nums[j-1] > temp; j--){
                nums[j] = nums[j-1];// 뒤로 땡기기
            // while(j > 0 && temp < nums[j-1]){
                // nums[j] = nums[j-1]
                // j--
                // }
            }
            nums[j] = temp; // 들어갈 위치에 삽입
            display();
        }
    }

    /*
    퀵정렬
         a         40  57  15  1  12   75   5  86  89  11

    기준점: a[0] = 40 (0번째기준)
    key = 0
    L=1   범위의 끝(오른쪽상한)이거나 아니면  40 보다 큰값을 만날때까지 하나씩 증가하면서 이동한다    1,  57
    R=9   범위의 끝(왼쪽하한)이거나 아니면 40보다 작은값을 만날때까지 하나식 감소하면서 이동한다

    L < R   L위치의 값과 R위치의 값을 바꾼다

    L > R   두개의 그룹이 나눠지니가 key위치값와 R위치의 값이 바뀌어야 한다

     40  11  15  1  12   75   5  86  89  57
                         L    R

    40  11  15  1  12   5    75  86  89  57
                          L    R

    40  11  15  1  12   5    75  86  89  57   두개의 그룹으로 쪼개진다.
                        R    L
    첫번째 그룹에서 40이 젤 크니까 key 위치와 R위치를 바꿔치기한다

    재귀호출 - 함수가 자기 자신을 호출한다
    5  11  15  1  12   40          75  86  89  57   두개의 그룹으로 쪼개진다.
                        R          L

    qsort( nums, start, R-1);
    qsort(nums, L+1, end);
       */
    //배열과 범위를 전달해야 한다
    void quicksort(int []nums, int start, int end) {
        //각 개수가 하나씩 되면
        if(start>=end)
            return;

        int key = start; //왼쪽하한자리
        int left = start+1;
        int right = end;

        while( left<=right)
        {
            while (left<=end && nums[left]<=nums[key]) left++;
            while (right>start && nums[right]>=nums[key]) right--;

            if(left<=right)
            {
                //서로바꿔치기
                int temp = nums[left];
                nums[left] =nums[right];
                nums[right]=temp;
            }
            else
            {
                //right, key를 바꿔치기
                int temp = nums[right];
                nums[right]=nums[key];
                nums[key] = temp;
            }
        }

        display(nums);

    }

    void display(int []nums)
    {
        for(int n : nums) {
            System.out.printf("%3d", n);
        }
        System.out.println();
    }
}

public class SortMain {
    public static void main(String[] args) {
        Sort sort = new Sort();
        sort.init();
        sort.display();
        sort.selectSort1();
        sort.display();

        sort.init();
        sort.selectSort2();
        sort.display();

        sort.init();
        sort.bubbleSort1();
        sort.display();

        sort.bubbleSort2();
        sort.display();

        int []nums = new int [] {40,  11,  15,  1,  12,   75,   5,  86,  89,  57};
        sort.quicksort(nums, 0, nums.length-1);

    }
}





