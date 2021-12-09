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
	
	//equals�� overriding hashCode �Լ��� �������̵� �ض�
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
		
		//notify, notifyall, wait - �����ĵ�
		
		System.out.println(obj.getClass());
		System.out.println(obj.toString());
		
		//�� ��ü�� ����ȭ���� �� ��ü�� �ٸ��� �Ǵ°�.
		System.out.println(obj.hashCode());
		
		List<Score> sList = new ArrayList<Score>();
		sList.add(new Score("ȫ�浿", 50, 40));
		sList.add(new Score("���ҿ�", 100, 100));
		sList.add(new Score("������", 80, 80));
		sList.add(new Score("�ڻ���", 70, 80));
		sList.add(new Score("�̹α�", 100, 90));
		sList.add(new Score("������", 70, 70));
		
		int pos = sList.indexOf(new Score("���ҿ�", 0, 0));
		System.out.println(pos);
		
		//sort ������������
		for(Score s : sList) {
			System.out.println(s);
		}
	}

}
