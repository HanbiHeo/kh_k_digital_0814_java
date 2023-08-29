package 디폴트메소드리모컨기능;

public class Audio implements RemoteControl{ // 반드시 구현해야 할 메소드가 오버라이드를 통해 자동 구현. 디폴트메소드는 선택사항
    private int volume;

    @Override
    public void turnON() {
        System.out.println("오디오를 켭니다");
    }

    @Override
    public void turnOFF() {
        System.out.println("오디오를 끕니다.");
    }

    @Override
    public void setVolume(int vol) {
        if(vol > RemoteControl.MAX_VOLUME) {
            this.volume = RemoteControl.MAX_VOLUME;
        }
        else if(vol < RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
        } else {
            this.volume = vol;
        }
        System.out.println("현재 오디오 볼륨 : " + this.volume);
    }
    void getInfo() {
        System.out.println("오디오 입니다.");
        System.out.println("현재 오디오 볼륨은 : " + volume + "입니다.");
    }
    @Override
    public void setMute(boolean mute) {
        if(mute) System.out.println("오디오를 무음처리 합니다.");
        else System.out.println("오디오 무음 처리를 해제합니다.");
    }
}
