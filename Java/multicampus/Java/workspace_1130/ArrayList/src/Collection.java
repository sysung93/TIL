import java.util.ArrayList;

public class Collection {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("커피");
		list.add("망고주스");
		list.add("오렌지주스");
		list.add("자몽에이드");
		list.add("카라멜마키아또");
		
		System.out.println("데이터 카운트 : " + list.size());
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		//데이터를 찾는 함수
		int pos = list.indexOf("망고주스");
		System.out.println(pos);
		
		pos = list.indexOf("딸기주스");
		System.out.println(pos); // 자바는 함수에 오류가 있으면 -1반환, 참조일땐 null
		
		//----------------------------------------
		
		list.sort(null);
		//abc순 가나다라순으으로 정렬이라한다.
		
		for(String s : list) {
			System.out.println(s);
		}
		
		System.out.println("삭제 후----------");
		list.remove(1); //위치값으로 삭제
		list.remove("카라멜마끼아또"); //이름으로 삭제
		
		for(String s : list) {
			System.out.println(s);
		}
		
		System.out.println("전체삭제 후-----------");
		list.clear();
		
		for(String s : list) {
			System.out.println(s);
		}
		
	}
}
