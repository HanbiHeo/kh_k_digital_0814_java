package TV상속예제오버로딩;

public class PrototypeTV {
    boolean isPower; //전원
    int channel; //채널정보
    int volume; //볼륨
    public PrototypeTV() {
        this.isPower = false;
        this.channel = 10;
        this.volume = 10;
    }
    //생성자 오버로딩
    public PrototypeTV(boolean isPower, int channel, int volume) {
        this.isPower = isPower;
        this.channel = channel;
        this.volume = volume;
    }
    public void setChannel(int ch) {
        if(ch > 0 && ch < 1000) {
            channel = ch;
        } else System.out.println("채널 설정범위가 아닙니다.");
    }
}
