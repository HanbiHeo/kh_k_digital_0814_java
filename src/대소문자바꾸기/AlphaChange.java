package 대소문자바꾸기;

import java.util.Scanner;

//08.21_10_test3
// charAt(index) : 문자열에서 해당 인덱스 문자를 추출
//toCharArray() : 문자열을 문자 배열로 변환
public class AlphaChange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자 입력 : ");
        String text = sc.next();
        //문자열 길이 만큼 순회하면서 문자에 대한 ASCII 값 확인해서 대문자, 소문자 확인하고 계산해줌
        for(int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if(ch < 'a') System.out.print((char) (ch + ('a' - 'A'))); //대문자가 앞에 있음을 기억해야함
            else System.out.print((char) (ch - ('a' - 'A')));
        }
    }
}
