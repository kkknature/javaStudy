interface RemoteControl2 {
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;

    void turnOn();
    void turnOff();
    void setVolume(int volume);
}

class Television implements RemoteControl2 {
    private int volume;

    public void turnOn() {
        System.out.println("TV를 켭니다.");
    }

    public void turnOff() {
        System.out.println("TV를 끕니다.");
    }

    public void setVolume(int volume) {
        if(volume > RemoteControl2.MAX_VOLUME) {
            this.volume = RemoteControl2.MAX_VOLUME;
        } else if (volume < RemoteControl2.MIN_VOLUME) {
            this.volume = RemoteControl2.MIN_VOLUME;
        } else {
            this.volume = volume;
        }

        System.out.println("현재 TV 볼륨: " + this.volume);
    }
}

class Audio implements RemoteControl2 {

    private int volume;

    public void turnOn() {
        System.out.println("Audio를 켭니다.");
    }

    public void turnOff() {
        System.out.println("Audio를 끕니다.");
    }

    public void setVolume(int volume) {
        if(volume > RemoteControl2.MAX_VOLUME) {
            this.volume = RemoteControl2.MAX_VOLUME;
        } else if (volume < RemoteControl2.MIN_VOLUME) {
            this.volume = RemoteControl2.MIN_VOLUME;
        } else {
            this.volume = volume;
        }

        System.out.println("현재 Audio 볼륨: " + this.volume);
    }
}

public class RemoteControlExample2 {
    public static void main(String[] args) {
        
        RemoteControl2 rc;

        rc = new Television();
        rc.turnOn();
        rc.setVolume(5);
        rc.turnOff();

        rc = new Audio();
        rc.turnOn();
        rc.setVolume(5);
        rc.turnOff();
    }
}
