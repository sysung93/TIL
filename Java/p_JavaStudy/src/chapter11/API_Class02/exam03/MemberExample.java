package chapter11.API_Class02.exam03;

public class MemberExample {
    public static void main(String[] args) {
        Member original = new Member("blue", "홍길동","12345", 25,true);

        Member cloned = original.getMember();
        cloned.password = "67890";

        System.out.println("[원본 객체의 필드값]");
        System.out.println("id: " + original.id);
        System.out.println("mane: " + original.name);
        System.out.println("password: " + original.password);
        System.out.println("age: " + original.age);
        System.out.println("adult: " + original.adult);
        System.out.println();
        System.out.println("[복제된 객체의 필드값]");
        System.out.println("id: " + cloned.id);
        System.out.println("mane: " + cloned.name);
        System.out.println("password: " + cloned.password);
        System.out.println("age: " + cloned.age);
        System.out.println("adult: " + cloned.adult);
    }
}
