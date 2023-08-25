package 에어컨만들기0825;

import java.util.Calendar;
import java.util.Scanner;

public class Aircon {
    boolean isPower; //on,off
    int setTemp; //온도설정
    int currTemp; // 현재온도
    boolean isCooler; //에어컨
    boolean isHeater; // 히터
    int windStep; //1단 2단 3단
    Aircon() {
        final int[] monthTemp = {-5, 3, 10, 15, 22, 28, 32, 24, 16, 8, 4};
        Calendar now = Calendar.getInstance();
        int month = now.get(Calendar.MONTH);
        currTemp = monthTemp[month];
        isPower = false;
        setTemp = 18;
        isCooler = false;
        isHeater = false;
        windStep = 1;
    }
    void airconInfo() {
        String onOffStr = (isPower) ? "ON" : "OFF";
        String heaterStr = (isHeater) ? "ON" : "OFF";
        String coolerStr = (isCooler) ? "ON" : "OFF";
        final String[] winStr = {"", "1단계", "2단계", "3단계"};
        System.out.println("전원 : " + onOffStr);
        System.out.println("현재온도 : " + currTemp);
        System.out.println("설정온도 : " + setTemp);
        System.out.println("히터 : " + heaterStr);
        System.out.println("쿨러 : " + coolerStr);
        System.out.println("바람세기 : " + winStr[windStep]);
    }
    public void setAirconState() {
        Scanner sc = new Scanner(System.in);
        System.out.println("현재 온도가 " + currTemp + " 입니다.");
        System.out.print("온도를 설정하세요 : ");
        setTemp = sc.nextInt();
        System.out.println("설정 온도는 " + setTemp + "입니다.");
        System.out.println("바람 세기를 설정 하세요[1]1단 [2]2단 [3]3단");
        windStep = sc.nextInt();
        if (currTemp > setTemp) {
            System.out.println("에어컨이 동작 합니다.");
            isCooler = true;
            isHeater = false;
        } else if (currTemp < setTemp) {
            System.out.println("히터가 동작합니다");
            isCooler = false;
            isHeater = true;
        } else {
            isCooler = false;
            isHeater = false;
        }
    }
    public void setPower(boolean power) {
        isPower = power;
    }
    public int getWindSep() {
        return windStep;
    }
    public boolean isHeater() {
        return isHeater;
    }
    public boolean isCooler() {
        return isCooler;
    }
    public int getCurrTemp() {
        return setTemp;
    }
    public int getSetTemp() {
        return setTemp;
    }

    public void setCurrTemp(int i) {
    }
}
