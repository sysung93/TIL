package chapter12.Thread04.exam01_unsynchronized;

public class Calculator {
    private int memory;

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) throws InterruptedException {
        this.memory = memory;
        Thread.sleep(2000);
        System.out.println(Thread.currentThread().getName() + ":" + this.memory);
    }

}
