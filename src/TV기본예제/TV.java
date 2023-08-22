package TV기본예제;

public class TV { //TV에 대한 설계 도면
    private boolean isON; // TV전원
    private int channel; // 채널
    private int volume; //볼륨
    TV() { //ex.공장 기본 셋팅값
        isON = false;
        channel = 11;
        volume = 10;
        System.out.println("전원 : " + isON + ", 채널 : " + channel + ", 볼륨 : " + volume);
    }
    TV(boolean isON, int ch,  int vol){
        this.isON = isON;
        channel = ch;
        volume = vol;
        System.out.println("전원 : " + isON + ", 채널 : " + channel + ", 볼륨 : " + volume);
    }
    public void setON(boolean isON) {
        this.isON = isON;
        String onOffStr = (isON) ? "ON" : "OFF";
        System.out.println("TV전원이" + onOffStr + " 되었습니다");
    }
    public void setChannel(int ch) {
        if (ch >= 1 && ch <= 999) {
            channel = ch;
            System.out.println("채널을 '" + channel + "'로 변경하였습니다." );
        } else {
            System.out.println("혀용범위를 벗어난 채널입니다.");
        }
    }
    public void setVolume(int vol) {
        if(vol >=0 && vol < 100) {
            volume = vol;
            System.out.println("볼륨을 '" + volume + "' 으로 변경하였습니다.");
        } else {
            System.out.println("허용범위를 벗어난 볼륨입니다.");
        }
    }
    public void getInfoTV() {
        String onOffStr = (isON) ? "ON" : "OFF";
        System.out.println("=".repeat(5) + "TV info" + "=".repeat(5));
        System.out.println("전원 : " + onOffStr);
        System.out.println("볼륨 : " + volume);
        System.out.println("채널 : " + channel);
    }
}
