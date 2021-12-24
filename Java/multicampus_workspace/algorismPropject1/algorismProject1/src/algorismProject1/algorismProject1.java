package algorismProject1;

import java.util.Scanner;

public class algorismProject1 {
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
		
	}
	
	static void quickSort(int[] a, int left, int right) {
		int pl = left;
		int pr = right;
		int x = a[(pl + pr) / 2];
		
		do {
			while (a[pl] > x) pl++;
			while (a[pr] < x) pr--;
			if(pl <= pr) {
				swap(a, pl++, pr--);
			}
		} while(pl <= pr);
		
		if(left < pr) {
			quickSort(a, left, pr);
		}
		if(pl < right) {
			quickSort(a, pl, right);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�л��� �Է� : ");
		int num = sc.nextInt();
		int[] x = new int[num];
		
		for(int i = 0; i < num; i++) {
			System.out.print("�л�" + (i+1) + "���� �Է� : ");
			x[i] = sc.nextInt();
		}
		
		quickSort(x, 0, num - 1);
		
		
		System.out.println("���� ������ ����");
		for(int i = 0; i < num; i++) {
			System.out.printf("%d�� : %d\n", (i+1) , x[i]);	
		}
		
		sc.close();
	}
}
