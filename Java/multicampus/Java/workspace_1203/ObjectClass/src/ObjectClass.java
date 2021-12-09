import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Score implements Cloneable{
	String name = "";
	int kor;
	int eng;
	int total;
}
class Score{
	String name = "";
	int kor;
	int eng;
	int total;
	
	public Score(String name, int kor, int eng) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.total = this.kor + this.eng;
	}
	
	@Override
	public String toString() {
		return String.format("%s %d %d %d", name, kor, eng, total);
	}
	
	//equals를 overriding hashCode 함수도 오버라이딩 해라
	@Override
	public boolean equals(Object obj) {
		Score s = (Score)obj;
		return this.name.equals(s);
		
	}
	
	@Override
	public int hashCode() {
		return this.name.hashCode();
	}
	
}

class ScoreComparator implements Comparator<Score> {
	
	@Override
	public int compare(Score o1, Score o2) {
		return o1.total - o2.total;
	}
	
}

public class ObjectClass {
	public static void main(String[] args) {
		Object obj = new Object();
		
		//notify, notifyall, wait - 스래ㅔ드
		
		System.out.println(obj.getClass());
		System.out.println(obj.toString());
		
		//각 객체를 숫자화시켜 각 객체가 다르게 되는것.
		System.out.println(obj.hashCode());
		
		List<Score> sList = new ArrayList<Score>();
		sList.add(new Score("홍길동", 50, 40));
		sList.add(new Score("정소연", 100, 100));
		sList.add(new Score("이혁주", 80, 80));
		sList.add(new Score("박상태", 70, 80));
		sList.add(new Score("이민규", 100, 90));
		sList.add(new Score("최윤지", 70, 70));
		
		int pos = sList.indexOf(new Score("정소연", 0, 0));
		System.out.println(pos);
		
		//sort 총점기준으로
		for(Score s : sList) {
			System.out.println(s);
		}
	}

}
