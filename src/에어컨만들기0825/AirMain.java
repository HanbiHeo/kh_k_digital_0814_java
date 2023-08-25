package 에어컨만들기0825;

import java.util.Scanner;

import static java.lang.Thread.sleep;

public class AirMain {
    public static void main(String[] args) throws InterruptedException {
        Aircon lgAircon = new Aircon();
        Scanner sc = new Scanner(System.in);
        int elapsedTime = 0;
        boolean isSetTemp = false;
        System.out.print("에어컨을 켜시겠습니까 (yes/no) : ");
        String isOn = sc.next();
        if (isOn.equals("yes")) {
            lgAircon.setPower(true);
            lgAircon.setAirconState();
            while (true) {
                sleep(500);
                elapsedTime++;
                switch (lgAircon.getWindSep()) {
                    case 1:
                        if (elapsedTime >= 60) isSetTemp = true;
                        break;
                    case 2:
                        if (elapsedTime >= 30) isSetTemp = true;
                        break;
                    case 3:
                        if (elapsedTime >= 20) isSetTemp = true;
                        break;
                    default:
                        if (elapsedTime >= 61) isSetTemp = true;
                }
                if (isSetTemp) {
                    if (lgAircon.isHeater()) lgAircon.setCurrTemp(1);
                    if (lgAircon.isCooler()) lgAircon.setCurrTemp(-1);
                    lgAircon.airconInfo();
                    elapsedTime = 0;
                }
                if (lgAircon.getCurrTemp() == lgAircon.getSetTemp()) {
                    System.out.println("에어컨을 종료합니다");
                    break;
                }
            }
        }
    }
}
