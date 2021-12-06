package chapter12.Thread06.exam05_wait_notify;

public class DataBox {
    private String data;

    public synchronized String getData() {
        if(this.data == null) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        String retrunValue = data;
        System.out.println("ConsummerThread가 읽은 데이터 : " + retrunValue);
        data = null;
        notify();
        return retrunValue;

    }

    public synchronized void setData(String data) {
        if(this.data != null) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.data = data;
        System.out.println("producerThread가 생성한 데이터 : " + data);
        notify();
    }
}
