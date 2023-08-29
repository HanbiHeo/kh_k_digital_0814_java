package 다중인터페이스상속;

public interface Aircon {//인터페이스 만들기
    int MAX_TEMP = 30; // 상수라서 대문자. 객체화가 안됨. public final static
    int MIN_TEMP = 0;
    void airconON();
    void airconOFF();
    void setAirconTemp(int tmp);
}
