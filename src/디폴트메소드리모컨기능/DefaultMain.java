package 디폴트메소드리모컨기능;

import java.util.Scanner;

//230825, 0829 익명의 클래스 추가(플스)
public class DefaultMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("제품선택 [1]오디오 [2]텔레비젼 : ");
        int sel = sc.nextInt();
        RemoteControl rc;
        if(sel == 1) {
            rc = new Audio();
            rc.turnON();
            rc.setVolume(20);
            rc.setMute(true);
            RemoteControl.changeBattery();
        } else {
            rc = new Television();
            rc.turnON();
            rc.setVolume(30);
        }
        RemoteControl ps5 = new RemoteControl() {
            @Override
            public void turnON() {
                System.out.println("플스5를 켭니다");
            }

            @Override
            public void turnOFF() {
                System.out.println("플스5를 끕니다");
            }

            @Override
            public void setVolume(int vol) {

            }
        };
        ps5.turnON();
        ps5.turnOFF();
    }
}
