package Ex7_17;

public class InstanceOfTest {
    public static void main(String[] args) {
        FireEngine fe = new FireEngine();

        if(fe instanceof FireEngine) {
            System.out.println("this is a FireEngine instance.");
        }

        if(fe instanceof Car){
            System.out.println("this is a Car instance.");
        }

    }

}
