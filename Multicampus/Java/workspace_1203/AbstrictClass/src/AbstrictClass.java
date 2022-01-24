import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// 추상클래스 - 추상메서드를 하나 이쌍 갖고있는 클래스이다.
// 추상메서드란 함수의 구현구분이 없는 메서드이다
// 추상클래스는 객체 생성을 못한다
// 추상클래스를 상속받은 클래스도 추상클래스이다.
// 상속받은 클래스가 추상메서드를 재정의(overriding)해줘야 추상클래스가 아니게 된다.
// 사용이유: 상속받은 쪽에서 이 메서드를 반드시 오버라이딩 하기를 바랄때

//ArrayList 클래스 안에 indexOf함수, 데이터를 찾아준다.
//사용자가 만든 클래스 입장에서 indexOf를 써서 데이터를 검하려면
//equals를 오버라이딩 해야한다.
//Object 클래스에서 equals를 추상메서드로 만든다면
//모든 클래스마다 equals를 오버라이딩해야한다.

//comparable - 인터페이스, 추상클래스가 극도로 추상화됨
@SuppressWarnings("rawtypes")
class Person implements Comparable{
	String name;
	String phone;
	String address;
	
	public Person(String name, String phone, String address) {		
		this.name = name;
		this.phone = phone;
		this.address = address;
	}

	@Override
	//정렬
	public int compareTo(Object o) {
		Person temp = (Person)o;
		//this.name 사전순서상 temp.name보다 앞에 있으면 - 값
		//this.name 사전순서상 temp.name보다 와 같으면 0
		//this.name 사전순서상 temp.name보다 뒤에 있으면 + 값
		return this.name.compareTo(temp.name);
	}
	
	
}
public class AbstrictClass {
	public static void main(String[] args) {
		//linkedlist 내부 메커니즘으로 볼 때 중간에 추가삭제시 Arraylist보다 빠르다
		List<String> list = new LinkedList<String>();
		//List<String> list = new ArrayList<String>();
		list.add("빼빼로");
		list.add("에이스");
		list.add("맛동산");
		list.add("다이제스티브");
		list.add("고래밥");
		list.add("자갈치");
		list.add("홈런볼");
		list.add("감자깡");
		list.add("새우깡");
		list.add("계란과자");
		
		list.sort(null);
		
		for(String s : list) {
			System.out.println(s);
		}
		
		List<Person> personList = new ArrayList<Person>();
		personList.add(new Person("홍길동", "010-0000-0000", "봉천1동"));
		personList.add(new Person("임꺽정", "010-0000-0000", "봉천1동"));
		personList.add(new Person("장길산", "010-0000-0000", "봉천1동"));
		personList.add(new Person("김좌진", "010-0000-0000", "봉천1동"));
		personList.add(new Person("이순신", "010-0000-0000", "봉천1동"));
		personList.add(new Person("을지문덕", "010-0000-0000", "봉천1동"));
		personList.add(new Person("강감창", "010-0000-0000", "봉천1동"));
		personList.add(new Person("서휘", "010-0000-0000", "봉천1동"));
		personList.add(new Person("김종서", "010-0000-0000", "봉천1동"));
		personList.add(new Person("최치원", "010-0000-0000", "봉천1동"));
		personList.add(new Person("홍길동", "010-0000-0000", "봉천1동"));
		
		personList.sort(null);
		
		for(Person s : personList) {
			System.out.printf("%s %s %s\n", s.name, s.phone, s.address);
		}
	}

}
