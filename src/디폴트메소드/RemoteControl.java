package 디폴트메소드;

public interface RemoteControl {
    int MAX_VOLUME = 100; // 대문자는 자동으로 final static이 추가 됨. 인터페이스 소속으로 상속이 안됨.
    int MIN_VOLUME = 0;
    void turnON(); //리모콘을 켜는 동작. 추상메소드. 자동으로 public abstract가 추가됨
    void turnOFF();
    void setVolume(int vol);

    //디폴트 메소드는 JDK 1.8 이후 추가됨. 구현부가 생겨서 오버라이딩이 선택사항으로 바뀜
    default void setMute(boolean mute) {
        if(mute) System.out.println("무음 처리 합니다.");
        else System.out.println("무음 해제 합니다.");
    }
    static void changeBattery() {
        System.out.println("건전지를 교환합니다.");
    }
}
