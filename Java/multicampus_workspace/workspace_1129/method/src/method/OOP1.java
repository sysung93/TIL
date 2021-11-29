package method;

public class OOP1 {
	public static void main(String[] args) {
		//1. 객체 생성하기
		//객체 참조변수 선언, null 또는 new 클래스명()으로 초기화 가능
		Person p1;
		//heap 공간에 객체를 만들고 객체의 주소를 전달
		//만일 객체를 만들 공간이 없을 경우 null값을 준다
		p1 = new Person();
		
		p1.name = "홍길동";
		p1.phone = "010-0000-0000";
		p1.address = "서초구 역삼동";
		
		System.out.println(p1.name);
		System.out.println(p1.phone);
		System.out.println(p1.address);
		
		//배열 - 참조, 객체 - 참조
		//객체배열 -참조의 참조
		
		//객체 3개 담을 배열만 작성
		Person[] persons = new Person[3];
		//객체따로
		persons[0] = new Person();
		
		System.out.println(persons[0].name);
		System.out.println(persons[0].phone);
		System.out.println(persons[0].address);
		
		persons[1] = new Person();
		persons[1].setPerson("박상태", "010-9999-9999", "송파구");
		persons[1].output();
		
		//클래스를 남이 만든걸 가져다 쓰려고 한다
		persons[2] = new Person();
		persons[2].output();
		
		p1 = new Person("홍길동", 23, "010-2222-3333", "은평구");
		p1.output();
	}
}

