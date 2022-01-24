package method_Weekpay;

public class WeekPay {
	String name;
	int per_pay;
	int work_time;
	int base_pay;
	int over_pay;
	int total_pay;
	
	// source > Generate Constructor from Superclass
	public WeekPay() {
		this.name = "";
		this.work_time = 20;
		this.per_pay = 10000;
		// TODO Auto-generated constructor stub
	}
	
	//source > Generate Constructor using Field
	public WeekPay(String name, int per_pay, int work_time) {
		super();
		this.name = name;
		this.per_pay = per_pay;
		this.work_time = work_time;
	}
	//급여 계산함수 만들기
	public void process() {
		this.base_pay = this.per_pay * this.work_time;
		over_pay = 0;
		if(work_time > 20) {
			over_pay = (int)((work_time - 20) * per_pay * 0.5);
		}
		total_pay = base_pay + over_pay;
	}
	
	public void output() {
		System.out.printf("%s\t",name);
		System.out.printf("%s\t",work_time);
		System.out.printf("%s\t",per_pay);
		System.out.printf("%s\t",base_pay);
		System.out.printf("%s\t",over_pay);
		System.out.printf("%s\t",total_pay);
		System.out.println();
	}
	
	
}
