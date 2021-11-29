package method;

//관련 있는 것 끼리 묶기
// 클래스명은 첫 글자를 대문자로 하는게 좋다
class Person {
	//멤버변수 필드 속성
	
	String name;
	String phone;
	String address;
	int age;
	
	// 생성자 - method의 일종인데 객체 만들때 자동으로 호출
	// 이 method는 이름이 정해져있다. 클래스명과 동일해얗 함
	// 생성자는 접근권한이 .public이어야 한다
	// 변수들한테 시작할 때 오류 안나게 기본값을 넣어주거나 기타 등등의 준비작업을 할 수 있다
	// 반환형은 못쓴다
	// 생성자를 만들지 않으면 시스템이 만들어서라도 호출한다. 단 하는일 없음
	// 생성자는 여러개 만들수 있다.
	// 자바가 overloading 이라고 해서 함수가 이름은 같고 형태가 다른 함수를 만들 수 있도록 되어있어 모습만 다르면 여러개 만들어도 됨
	
	Person() {  // new Person()
		name = "";
		phone = "";
		address = "";
		age = 20;
		System.out.println("생성자가 호출되었음");
	}
	
	public Person(String name, int age, String phone, String address) {
		
		//매개변수 name과 클래스변수 name 구분이 안됨
		//this = 참조자, 내꺼, 변수만 그냥 써도 this 참조자 있는걸로 안다
//		name = n;
//		age = ag;
//		phone = p;
//		address = a;
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.address = address;
		System.out.println("매개변수가 있는 생성자가 호출되었음");
	}
	
	//함수를 만들다
	void setPerson(String n, String p, String a) {
		name = n;
		phone = p ;
		address = a;
	}
	
	void output() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(phone);
		System.out.println(address);
	}
}

