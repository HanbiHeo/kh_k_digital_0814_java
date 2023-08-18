package 연습문제;
// 세자리 정수 입력받아 가장 큰 수 출력
import java.util.Scanner;
//int num; 100의 자리 정수 입력하기 위한 변수
//int a, b, c; 1의자리 정수 입력받기 위한 변수

public class pra2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("세자리의 정수를 입력하세요 : ");
        int num = sc.nextInt();
        int a = num / 100;
        int b = (num % 100) / 10;
        int c = num % 10;

        /*
        if(a > b) {
        if (a > c) System.out.println(a);
        else {System.out.println(c);
        } esle {
        if (b > c) System.out.println(b);
        else {System.out.println(c);
         }
         */

        if (a > b) {
            System.out.println(Math.max(a, c));
        } else {
            System.out.println(Math.max(b, c));
        }
    }

    public static class pre3_3 {
    }
}
