package KMP알고리즘대문자뽑기;

import java.util.Scanner;

//23.08.23_3
//Knuth-Morris-Pratt => KMP
//Mirko-Slavko => MS
//split("-")메소드를 이용해 문자열을 자르고 자른 문자열의 0번째 인덱스를 선택하는 방법
//0번째 선택, "-"다음의 첫번째 문자를 선택하는 방법
//대문자만 고르는 방법 (chartAt (인덱스이용), toCharArray())
public class KMPex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("메모 : ");
        String name = sc.next();

//        //1.charAt(인덱스) 사용하는 방법
//        for(int i = 0; i < name.length(); i++) {
//            if(name.charAt(i) >= 'A' && name.charAt(i) <= 'Z') System.out.print(name.charAt(i));
//        }

//        //2. 첫번째 문자 선택 + '-' 다음의 문자 선택하는 방법
//        for(int i = 0; i < name.length(); i++) {
//            if(i == 0) System.out.print(name.charAt(i));
//            else {
//                if(name.charAt(i) == '-') System.out.print(name.charAt(i+1));
//            }
//        }

//        //3. split()메소드 이용하는 방법
//        String[] splitName = name.split("-");
//        for(String e : splitName) System.out.print(e.charAt(0));

        //4. toCharArray() 문자열을 문자 배열로 변경하는 방법
        char[] chName = name.toCharArray(); // 문자열을 문자배열로 바꾸는 과정
        for(char ch : chName) {
            if(ch>= 'A' && ch <= 'Z') System.out.print(ch);
        }
    }
}
