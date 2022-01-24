package example;

public class Multi_For_exam02 {
	public static void main(String[] args) {
		int k = 65;
		for(int i = 0; i < 26; i++) {
			for(int j= 0; j < 26; j++) {
				int alpa = k+i+j;
				if(alpa > 'Z') {
					//z넘어가면 a 부터 시작
					alpa-= 26;
				}
				System.out.print((char)alpa);
			}
			System.out.println();
		}
		/*for(int i = 0; i < 26; i++) {
			 * 	k =i;
			 * 	for(j = 0; j < 26; j++) {
			 * 	System.out.print((char)(k + 'A'))
			 *  k++;
			 *  if(k >= 26)
			 *  	k = 0;
			 *  } System.out.println();
		 * }
		 * 
		 */
		 
	}

}
