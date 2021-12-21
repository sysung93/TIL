
class Search {
    int[] nums = new int[] {1, 3, 5, 9, 12, 15, 17, 20, 33, 34};
    void display() {
        System.out.println();
        for (int n : nums) {
            System.out.printf("%4d", n);
        }
        System.out.println();
    }

    //Sequential(순차검색),  Linear(선형검색)
    void LinearSearch( ){
        int key = 20;
        boolean find = false;
        // boolean 변수 어떤 상태에 도달했던 경우가 있다 또는 없다. false면 못찾음

    int i = 0;
        while(!find && i < nums.length){
            if(nums[i] == key){
                find = true;
            } else {
                i++;
            }
        }
        if(find){
            System.out.printf("%d번 방에 있습니다.\n", i);
        } else {
            System.out.println("찾을 수 없습니다.");
        }
    }


}

public class SearchMain {
    public static void main(String[] args) {
        Search s = new Search();
        s.display();
        s.LinearSearch();
    }

}
