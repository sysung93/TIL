package Chapter3;

public class Day4_chapter3_Quiz1 {
    public static void main(String[] args) {
       //문제 4
       //534자루의 연필을 30명의 학생들에게 똑같은 개수로 나누어 줄 때 학생당
       //몇 개를 가질 수 있고 최종적으로 몇개가 남는지 구하시오

        int pencils = 534;
        int students = 30;

        //학생 한명이 가지는 연필 수
        int pencilsPerStudent = pencils / students;
        System.out.println(pencilsPerStudent);

        //남은 연필 수
        int pencilsLeft = pencils % students;
        System.out.println(pencilsLeft);
    }
}
