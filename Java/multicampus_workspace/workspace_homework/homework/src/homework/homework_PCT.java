package homework;

import java.util.Scanner;

public class homework_PCT {
	public static void main(String[] args) {
		
//		�̸�, �ʱ�, ����, �Ŀ�����Ʈ, �������� ���� �Է¹޾Ƽ� ������ ����� ���Ѵ� 
//
//		����� 800�̻�  A���, 600�̻� B ��� 400�̻� C ��� , D ��� ����� ��� 
//
//		������ �Ʒ� �ҽ� �����ϰ� ��������  A ����� ����̾����� B,C,D ����� ���� ����̾����� ��� 
//
//		����Ұ� 

				final int COUNT=3;
				
				//1.�Էº����� ��º��� �����ϱ� 
				String[] name = new String[COUNT];
				int[] write_score = new int[COUNT];
				int[] word_score = new int[COUNT];
				int[] ppt_score = new int[COUNT];
				int[] spread_score = new int[COUNT];
				int[] total_score = new int[COUNT];
				
				int[] grades = new int[COUNT];
				int A = 0;
				int B = 0;
				int C = 0;
				int D = 0;
				
				
				int i;
				Scanner sc = new Scanner(System.in); 
				
				//2. �Է��� �޴´� 
				for(i=0; i < COUNT; i++)
				{
					System.out.print("�̸� : ");
					name[i] = sc.next();
					
					System.out.print("�ʱ� ������ �Է��ϼ���(0 ~ 400��) : ");
					write_score[i] = sc.nextInt();
			
					System.out.print("���� ������ �Է��ϼ���(0 ~ 250��) : ");
					word_score[i] = sc.nextInt();
					
					System.out.print("���������̼� ������ �Է��ϼ���(0 ~ 150��) : ");
					ppt_score[i] = sc.nextInt();		
					
					System.out.print("���������Ʈ ������ �Է��ϼ���(0 ~ 200��) : ");
					spread_score[i] = sc.nextInt();		
				}
				
				//3.����� �Ѵ� 
				for(i = 0; i < COUNT; i++)
				{
					total_score[i] = write_score[i] + word_score[i] + ppt_score[i] + spread_score[i]; 
				}
				
				for(i = 0; i < COUNT; i++) {
					if(total_score[i] >= 800) {
						grades[i] = 'A';
						A++;
					} else if(total_score[i] >= 600) {
						grades[i] = 'B';
						B++;
					} else if(total_score[i] >= 400) {
						grades[i] = 'C';
						C++;
					} else {
						grades[i] = 'D';
						D++;
					}
					
				}
				
				System.out.println("--------------------------------------------------------------");
				System.out.printf("�̸�\t�ʱ�����\t��������\t���������̼�����\t���������Ʈ����\t����\n");
				System.out.println("--------------------------------------------------------------");
				
				//4.����ϱ�
				for(i=0; i<COUNT; i++)
				{
					System.out.printf("%s\t", name[i]);
					System.out.printf("%d\t", write_score[i]);
					System.out.printf("%d\t", word_score[i]);
					System.out.printf("%d\t", ppt_score[i]);
					System.out.printf("%d\t", spread_score[i]);
					System.out.printf("%d\n", total_score[i]);
				}
				
				System.out.printf("A����� %d�� �Դϴ�. \n", A);
				System.out.printf("B����� %d�� �Դϴ�.\n", B);
				System.out.printf("C����� %d�� �Դϴ�.\n", C);
				System.out.printf("D�����  %d�� �Դϴ�.\n", D);
		}
	
}
	



