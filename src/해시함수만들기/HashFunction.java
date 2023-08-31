package 해시함수만들기;

import java.util.Scanner;

//0831
//자바에 해시함수 있으나 이해하기 위해 예제 만들기
public class HashFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열 입력 : ");        //임의의 값 입력받기
        String in = sc.next();//문자열 입력받기
        int sum = 0;
        for(int i =0; i < in.length(); i++) {
            sum += in.charAt(i); // 문자열에서 문자의 ASCII코드값을 더해줌
        }
        System.out.println("배열의 인덱스 : " + (sum % 100));
    }
}
