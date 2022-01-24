//관련 있는 것 끼리 묶기
// 클래스명은 첫 글자를 대문자로 하는게 좋다
class Person {
	//변수 필드 속성
	String name;
	String phone;
	String address;
}

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
	}
}