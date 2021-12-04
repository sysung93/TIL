import java.util.Scanner;

class MyUtil {
	Scanner sc = new Scanner(System.in);
	void readArray(int[] nums) {
		for(int i = 0; i < nums.length; i++) {
			System.out.printf("%d��° : ", i + 1);
			nums[i] = sc.nextInt();
		}
	}
	public void writeArray(int[] nums) {
		for(int i = 0; i < nums.length; i++) {
			System.out.printf("%4d", nums[i]);
		}
		System.out.println();
	}
	//�迭�ָ� �ִ밪 ��ġ ��ȯ �Լ�
	
	int getmaxPos(int[] nums) {
		int max;
		int pos;
		
		max = nums[0];
		pos = 0;
		for(int i = 1; i < nums.length; i++) {
			if( max < nums[i]) {
				max = nums[i];
				pos = i;
			}
		}
		return pos;
	}
	
	//���迭 ������ ��հ� �������� �Լ�
	double getAvg(int[] nums) {
		int sum = 0;
		for(int i = 0; i < nums.length; i++) {
			sum += nums[i];
		}
		return (double)sum/nums.length;
	} 
	
}
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[10];
		MyUtil util = new MyUtil();
//		util.readArray(a);
//		util.writeArray(a);
		System.out.println(util.getmaxPos(new int[] {2, 3, 1, 5, 9, 8, 7, 11}));
		System.out.println(util.getAvg(new int[] {1, 2, 3, 4, 5}));
//		int[] b = new int(5);
//		util.readArray(b);
//		util.writeArray(b);
	}

}
