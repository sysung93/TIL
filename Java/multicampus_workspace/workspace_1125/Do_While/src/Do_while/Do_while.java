package Do_while;

public class Do_while {
	public static void main(String[] args) {
		//while문은 한번도 수행 안될 수 있다. 그러나 do while 문은 반드시 한번은 수행된다.
		int i = 10;
		while ( i < 3) {
			System.out.println("while i = " +i);
			i += 1;
		} 
		
		//shilt tab : 앞으로 땡기기
		//tab : 뒤로가기
		//ctrl-shift-x : 대문자
		//ctrl-shift-y : 소문자
		i = 1;
		do {
			System.out.println(i);
			i++;
		} while(i <= 10);
	}

}
