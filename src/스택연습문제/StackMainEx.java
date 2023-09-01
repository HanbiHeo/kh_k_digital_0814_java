package 스택연습문제;

import java.util.Scanner;
import java.util.Stack;

//0901
//스택을 이용해서 열림괄호, 닫힘괄호 체크하기
public class StackMainEx {
    public static void main(String[] args) {
        Stack<Character> st = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("수식 입력 : ");
        String exp = sc.next();
        //입력받은 문자열을 길이만큼 반복순회
        for(int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);
            if(ch == '(') {
                st.push(ch);
            } else if (ch == ')')  {
                if(!st.empty()) st.pop();//닫힘괄호일 때 비어있지 않으면 팝.
//                else {
//                    System.out.println("괄호가 일치하지 않습니다.");
//                    return;
//                }
            }
        }
        if(st.isEmpty()) {
            System.out.println("괄호가 일치 합니다."); //들어온 괄호만큼 다 나갔을때.
        }else {
            System.out.println("괄호가 일치하지 않습니다."); // 괄호의 갯수만 체크한것. 들어간 괄호만큼 나와야함
        }
    }
}
