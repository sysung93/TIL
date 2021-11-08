package chapter11.API_Class05.exam03;


public class NewInstanceExample {
    public static void main(String[] args) {
        Class clazz = null;
        try {
            //clazz = Class.forName("chapter11.API_Class05.exam03.SendAction");
            clazz = Class.forName("chapter11.API_Class05.exam03.ReceiveAction");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Action action = null;
        try {
            action = (Action) clazz.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        action.execute();
    }
}