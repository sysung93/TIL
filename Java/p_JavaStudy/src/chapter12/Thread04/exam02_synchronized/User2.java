package chapter12.Thread04.exam02_synchronized;

public class User2 extends Thread{
    private Calculator calculator;

    public void setCalculator(Calculator calculator) {
        this.setName("User1");
        this.calculator = calculator;
    }

    @Override
    public void run() {
        try {
            calculator.setMemory(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

