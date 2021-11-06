package chapter10.Exception04.exam01;

public class TryWithResourcesExample {
    public static void main(String[] args) {
        try(FileInputStream fis = new FileInputStream("file.txt")){
            fis.read();
            throw new Exception();
        } catch(Exception e){
            System.out.println("예외 처리 코드가 실행되었습니다.");
        }
    }
}
