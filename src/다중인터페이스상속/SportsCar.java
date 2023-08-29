package 다중인터페이스상속;

public class SportsCar  extends Car implements Aircon, AutoDrive{
    private boolean isAircon;
    private int setTemp;
    private boolean isAutoDrv;
    private int speed;
    private String color;
    private String year;
    private boolean isTurbo;

    //generator->전부 선택해서 생성자 다 만듦
    public SportsCar(boolean isAircon, int setTemp, boolean isAutoDrv, int speed, String color, String year, boolean isTurbo) {
        this.isAircon = isAircon;
        this.setTemp = setTemp;
        this.isAutoDrv = isAutoDrv;
        this.speed = speed;
        this.color = color;
        this.year = year;
        this.isTurbo = isTurbo;
    }
    public void viewInfo() {
        String airConStr = (isAircon) ? "ON" : "OFF";
        String autoStr = (isAutoDrv) ? "ON" : "OFF";
        String turboStr = (isTurbo) ? "ON" : "OFF";
        System.out.println("속도 : " + speed);
        System.out.println("색상 : " + color);
        System.out.println("제작연도 : " + year);
        System.out.println("에어컨 : " + airConStr);
        System.out.println("에어컨 온도 : " + setTemp);
        System.out.println("자율 주행 : " + autoStr);
        System.out.println("터보 모드 : " + turboStr);
    }

    @Override
    public void airconON() {
        System.out.println("에어컨을 켰습니다.");
    }

    @Override
    public void airconOFF() {
        System.out.println("에어컨을 껐습니다.");
    }

    @Override
    public void setAirconTeap(int tmp) {
        System.out.println("에어컨을 껐습니다.");
    }

    @Override
    public void autoDrvON() {
        System.out.println("자율 주행 모드를 켰습니다.");
    }

    @Override
    public void autoDrvOFF() {
        System.out.println("자율 주행 모드를 껐습니다.");
    }
}
