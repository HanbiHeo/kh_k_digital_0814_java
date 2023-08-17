package 조건문;

import java.util.Scanner;

// 조건문은 조건을 만족하는 경우와 만족하지 않는 경우로 나누어 수행하는 것
public class ConditionEx1 {
    public static void main(String[] args) {
        // if ~ else 문 : 참인경우와 거짓인 경우를 나누어서 수행
//        System.out.print("정수를 입력하세요 : ");
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        if(num > 100) {
//            System.out.println(num + "은(는) 100보다 큽니다.");
//        }
////        else { // else 안넣으면 양수 음수 두개 다 뜸. '그렇지 않은 경우'
////            System.out.println(num + "은(는) 100보다 작아요.");
////      }
//        else if (num < 100){
//            System.out.println(num + "은(는) 100보다 작아요.");
//        }
//        else {
//            System.out.println(num + "은(는) 100과 같아요.");
//        }//예외적인 케이스도 else if로 잡아주어야 함.
        
        System.out.print("문자를 입력 하세요 : ");
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0); // 문자열에서 첫번째만 취하겠다
        if(ch >= 'a' && ch <= 'z') { // a ~ z 사이의 문자(ASCII코드값의 숫자로 계산)
            System.out.println(ch + "(은)는 알파벳 소문자 입니다.");
            if(ch >= 'a' && ch <= 'z') { // a ~ z 사이의 문자(ASCII코드값의 숫자로 계산)
        } else if  (ch >= 'A' && ch <= 'Z'){
                System.out.println(ch + "은(는) 알파벳 대문자 입니다.");
            } else {
                System.out.println(ch +"은(는) 알파벳이 아닙니다.");
            }
            
        }
        
    }
}
