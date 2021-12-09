package example;

public class Multi_For_exam4 {
	public static void main(String[] args) {
		//A-Z까지 순서대로 나오게 한 후 한칸씩 뒤로 미루기 abc... bcd....cde... zab...
		int a = 65; 
		for(int i = 0; i < 26; i++) {
			for(int j = 0; j < 26; j++) {
				//현재 찍을 알파벳
				int alpa = a + i + j;
				if(alpa > 'Z') {
					alpa -= 26;
				} System.out.print((char)alpa);
			} System.out.println();
		}
	}

}
