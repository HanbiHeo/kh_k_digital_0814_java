package 윤년계산하기코테;
//2023.08.16

import java.util.Scanner;

// 연도가 4로 나누어 떨어진다. 4의 배수
// 100으로 나누어 떨어지면 연도는 윤년이 아니다.
// 400으로 나누어 떨어지면 윤년이다.
public class ExampleTest1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("년도를 입력 하세요 : ");
        int year = sc.nextInt();

        if (year % 4 == 0 && (year %100 != 0 || year % 400 == 0)) {
            System.out.println(year + "(은)는 윤년입니다.");
            //조건이 참인 경우 수행되는 구간
        } else {
            System.out.println(year + "(은)는 윤년이 아닙니다.");
            //조건이 거짓인 경우 수행되는 구간
        }
        //속도는 비트 용량은 바이트

    }
}
