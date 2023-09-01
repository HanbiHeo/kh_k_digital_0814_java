package 전자레인지만들기나누기나머지;

import java.util.Scanner;

//0901
//1. 3개의 시간조절용 버튼  A/B/C가 달린 전자레인지.
// A(5분=300)   B(1분=60)   C(10초) 버튼을 눌러서
//최소 횟수를 눌러 요리 시간을 설정하는 문제.
//맞출 수 없으면 -1로 반환
// (A*a) + (B*b) + (C*c) = T
//if (a+b+c) = mini
// 입력된 정수는 1 ≤ T ≤ 10,000 이다.
public class Microwave {
    public static void main(String[] args) {
        int t, a, b, c; //t는 요리시간을 초로 입력, a(5m), b(1m), c(10s)
        Scanner sc = new Scanner(System.in);
        System.out.println("시간 : ");
        t = sc.nextInt();
        if(t % 10 != 0) {
            System.out.println("-1");
            return;
        }
            a = t / 300; //5분 미만 버튼,
            b = t %300 / 60; // 1분
            c = t % 300 % 60 / 10; //10초 -> 큰수부터 나누어 내려가면 편함..
            System.out.printf("%d %d %d \n", a, b, c);

//        int[] sec = {10, 60, 300};
//        int[] inputTime = new int[sec.length];
//        int t = time;
//        if(1 <= t && t <= 10000) {
//            for (int i = sec.length - 1; i >= 0; i--) {
//                inputTime[i] = time / sec[i];
//                time %= sec[i];
//            }
//            System.out.println("최소한의 버튼 조작 방법 : ");
//        }
//        for(int i = 0; i < sec.length; i++) {
//            System.out.println(sec[i] + " : " + inputTime[i]);
//        }
    }
}
