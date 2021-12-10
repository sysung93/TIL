package chapter8.Interface04.exam02;

public class Audio implements RemoteControl {
    private int volume;
    private boolean mute;

    @Override
    public void turnOn() {
        System.out.println("Audio를 켭니다");
    }

    @Override
    public void turnOff() {
        System.out.println("Audio를 끕니다");
    }

    @Override
    public void setVolume(int volume) {
        if(volume > MAX_VOLUME) {
            this.volume = MAX_VOLUME;
        } else if(volume < MIN_VOLUME){
            this.volume = MIN_VOLUME;
        } else {
            this.volume = volume;
        }
        System.out.println("현재 Audio 볼륨: "+ this.volume);
    }

    @Override
    public void setMute(boolean mute) {
        this.mute = mute;
        if(mute) {
            System.out.println("Audio 무음 처리합니다.");
        } else {
            System.out.println("Audio 무음 해제합니다.");
        }
    }
}
