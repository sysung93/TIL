package chapter8.Interface03.exam03;

public class RemoteControlExample {
    public static void main(String[] args) {
        SmartTelevision tv = new SmartTelevision();

        RemoteControl rc = tv;
        rc.turnOn();
        rc.turnOff();
        rc.setVolume(5);

        Searchable searchable = tv;
        searchable.search("http://cafe.mobilewebapp");

    }
}
