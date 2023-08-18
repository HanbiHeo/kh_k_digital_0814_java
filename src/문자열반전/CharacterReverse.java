package 문자열반전;

import java.util.Scanner;

//Q. 문자열을 입력 받음 : abcd -> bcda .갯수는 입력 안받음
// 문자열의 길이는 length()로 확인 가능
// 반전하는 법
public class CharacterReverse {
    public static void main(String[] args) {

        //첫시도
        Scanner sc = new Scanner(System.in);
        System.out.println("문자열 입력 : ");
//        String ori = sc.next();
//        String rev = "";
//        for (int i = 0; i < ori.charAt(i); i++) {
//            rev = ori.charAt(i) + rev;
//        }
//        System.out.println("반전 문자열 : " + rev);

        //다시해석
        String input = sc.next();
        int pos = input.length() - 1;//길이정보보다는 포지션이 먼저 필요 (마지막의 위치만 알면 된다.) 문자열이 반전될 시작 위치 = 랭스에서 -1의 위치
        while (pos > -1) {
            System.out.print(input.charAt(pos));
            pos--;
        }
    }
}
