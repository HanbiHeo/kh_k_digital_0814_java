package 아이패드만들기;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import static java.lang.Thread.sleep;

public class IPadPro {
    int screen; //11인치, 12.9인치
    int color; // 스피이스그레이, 실버
    int memory; //128GB, 256GB, 512GB, 1TB
    int network; //Wi-fi only, Wi-fi+Cellular
    String name; //각인서비스시 이름 저장
    String productDate; //제품 생산일자
    String serialNum; //제품의 일련번호(제품의 고유값)
    static int cnt = 0; //클래스 소속의 변수, 생산개수 확인하려는 용도, 즉 클래스가 객체로 만들어진 횟수
    IPadPro(String name) {
        this.name = name;
        Date now = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyMMdd"); //시간정보를 표시하는 형식을 적용
        productDate = sdf.format(now); // 생산한 년/월/일을 가져 옴
        cnt++; // 전체적으로 몇개 생산되었는지 확인 가능
        productDate += cnt; //문자열에 생산개수 이어붙이기
    }
    boolean continueOrder() {
        Scanner sc = new Scanner(System.in);
        System.out.println("=".repeat(5) + "iPad Pro 구입하기" + "=".repeat(5));
        System.out.print("구입하시려면 yes / 종료는 quit : ");
        String isContinue = sc.next();
        if(isContinue.equalsIgnoreCase/*대소문자구분안함*/("yes")) return true; //구입을 진행함
        else return false; // 구입 진행 안함
    }
    //화면사이즈 정하기
    void setScreen(){
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.print("디스플레이 선택 [1] 11인치, [2] 12.9인치  :  ");
            screen = sc.nextInt();
            if(screen == 1 || screen == 2) return;
            System.out.println("디스플레이를 다시 선택하시오.");
        }
    }
    void setColor(){
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("컬러선택 [1]스페이스그레이, [2] 실버  :  ");
            color = sc.nextInt();
            if(color == 1 || color == 2) return;
            System.out.println("컬러를 다시 선택하시오.");
        }
    }
    void setMemory() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("용량 선택 [1]128GB [2]256GB  [3]512GB  [4]1TB  :  ");
            memory = sc.nextInt();
            if(memory > 0 && memory < 5) return;
            System.out.println("용량을 다시 선택하시오.");
        }
    }
    void setNetwork() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("네트워크 타입 선택 [1]Wi-fi only [2]Wi-fi+Cellular  :  ");
            network = sc.nextInt();
            if (network == 1 || network == 2) return;
            System.out.println("네트워크 타입을 다시 선택하시오.");
        }
    }
    void setName() {
        Scanner sc = new Scanner(System.in);
        System.out.print("각인 서비스를 신청 하시겠습니까? (yes / no)  :  ");
        String service = sc.next();
        if(service.equalsIgnoreCase("yes")) {
            System.out.print("이름을 입력 하세요 : ");
            name = sc.next();
        }
    }
    void setSerialNum() {
        String screenStr = (screen == 1) ? "11" : "13"; // ? valueIfTrue : valueIfFalse의 뜻
        /*위 코드는 screen 변수의 값이 1인지 확인하고, 만약 screen이 1이라면 "11"을, 그렇지 않다면 "13"을 screenStr 변수에 할당합니다.
         이것은 if-else 구문과 비슷한 역할을 하지만 더 간단한 형태로 작성된 것입니다.*/
        String[] memStr = {"", "128", "256","512", "1024"};
        String netStr = (network == 1) ? "W" : "C";
        serialNum = "iPad" + screenStr + memStr[memory] + netStr + productDate; //일렬번호 생성
    }
    void progressPad() throws InterruptedException {
        int  cnt = 0;
        while(true) {
            sleep(300); // 0.3초마다 sleep
            cnt++;
            System.out.print(" << iPad Pro 제작 중 : [ " + cnt + "% ] >>");
            System.out.print("\r"); // 커서 앞으로 당겨서 다시 작성
            if(cnt >= 100) break;
        }
    }
    void setProductPad() {
        final String[] screenType = {"","11인치", "12.9인치"};
        final String[] colorType = {"", "스페이스그레이", "실버"};
        final String[] memType = {"", "128GB", "256GB", "512GB", "1TB"};
        final String[] netType = {"", "Wi-fi", "Wi-fi + Cellular"};
        System.out.println("=".repeat(5) + "iPad Pro" + "사양" + "=".repeat(5));
        System.out.println("화면 크기 : " + screenType[screen]);
        System.out.println("제품 색상 : " + colorType[color]);
        System.out.println("제품 용량 : " + memType[memory]);
        System.out.println("네트워크 : " + netType[network]);
        System.out.println("이름 : " + name);
        System.out.println("일련번호 : " + serialNum);
        System.out.println("-".repeat(40));
    }
}
