package 인터페이스기본인터넷연결예제;

import java.util.Scanner;

//230825
public class InterfaceBasic {
    public static void main(String[] args) {
        NetworkAdepter adepter; //완전 추상화가 적용되어있는 Interface 실제구현내용 없음
        Scanner sc = new Scanner(System.in);
        System.out.println("연결할 네트워크 [1]LAN [2]WIFI [3]FIveG  : ");
        int sel = sc.nextInt();
        switch (sel) {
            case 1 :
                adepter = new LAN("KT Megapass");
                adepter.connect();
                break;
            case 2 :
                adepter = new WIFI("SK Telecom");
                adepter.connect();
                break;
            case 3 :
                adepter = new FiveG("LG Uplus");
                adepter.connect();
                break;
            default:
                System.out.println("선택하신 네트워크가 존재하지 않습니다.");
        }
    }
}
