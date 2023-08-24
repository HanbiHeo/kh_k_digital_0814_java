package 나머지서로다른나머지개수0824;

import java.util.Scanner;

//0824_6
//자연수 A, B에서 A%B는 A= sc B=42
//수 10개 입력받아 이를 42로 나눈 나머지를 구한다.
//나머지의 서로다른 값이 몇개인지 출력한다
public class Num {
    public static void main(String[] args) {
        int[] num = new int[42]; // 나머지 값을 다 넣을 배수를 만들기.
        int input; // 입력 받은 값을 넣기 위해
        int cnt = 0; // 42로 나누었을 때 나머지가 다른 경우, 총 합계
        Scanner sc = new Scanner(System.in);
        System.out.print("10개 수 입력 : ");
        for(int i = 0; i < 10; i++) { //for 10번 돌리기
            input = sc.nextInt();
            num[input % 42] = 1; //**** 입력받은 값을 42로 나눈 나머지에 해당하는 인덱스에 1을 대입****
        }
        for(int val : num) cnt += val;
        System.out.print("서로 다른 나머지의 개수의 합 : " + cnt);
        //입력받은 수 i 를 42로 나눈 %를 구한 후, 나머지가 서로 다른 수의 개수를 세는 것
        //
    }
}
