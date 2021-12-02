
public class MyArray {
	private int[] nums;
	private int capacity = 10; //용량
	
	public MyArray() {
		//생성자는 public 이어야한다
		nums = new int[capacity];
	}
	public void setValue(int index, int value) {
		if(index < 0 || index >= capacity) {
			return; // 오류 발생시 함수 종료	
		}
		nums[index] = value;	
	}
	
	public MyArray(int size) {
		if(size < 5) {
			capacity = 5;
		}
		else {
			capacity = size;
		}
		nums = new int[capacity];
	}
	
	public int getValue(int index) {
		if(index < 0 || index >= capacity) {
			return -1; // 함수 앞에 타입이 있는 경우 뭐라도 보내야 한다.
			// int의 경우 오류의 의미로 -1을 반환한다
		}
		return nums[index];
	}
}
