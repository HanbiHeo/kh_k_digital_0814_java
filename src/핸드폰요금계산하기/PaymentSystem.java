package 핸드폰요금계산하기;

import java.util.Scanner;
//230822_7_test
//영식 요금 : 30초당 10원(30초가 되면 2통)
//민식 요금 : 50초당 15원()
//입력 _ 첫째줄 : 통화의 횟수(20회 미만), 둘째줄 : 통화당 통화 시간(초 단위s)
//출력은 싼 요금제를 출력, 영식Y, 민식M
//총 통화 요금이 같은 경우는 YM 총통화요금 표시
public class PaymentSystem {
    public static void main(String[] args) {
        int[] call = new int[20];        //통화 횟수에 대한 통화 시간을 입력 받기위한 배열
        int yPay = 0, mPay = 0;     // 값을 누적해야 하니 초기화를 해야하니 밖에서 만들고 들어감
        Scanner sc = new Scanner(System.in);
//        System.out.println("통화 횟수를 입력하시오 : ");
        int cnt = sc.nextInt(); //통화 횟수 입력받아 변수에 대입
        for(int i = 0; i < cnt; i++) { // 통화횟수당 통화시간 입력받음

            call[i] = sc.nextInt();
        }
        //총 통화요금구하기
        for(int i = 0; i < cnt; i++) {
            yPay += (call[i] / 30) * 10 + 10; // 한통화당 10원 누적됨. 기본 10원
            mPay += (call[i] / 60) * 15 + 15;
        }
        if(yPay > mPay) {
            System.out.println("M " + mPay);
        } else if(yPay < mPay) {
            System.out.println("Y " + yPay);
        } else {
            System.out.println("Y M" + yPay);
        }

//        System.out.println("통화 시간을 입력하시오 : ");
//        int i = sc.nextInt();
    }
}
