package 스트링토커나이저;

import java.util.Scanner;
import java.util.StringTokenizer;

//0830
//문자열이 특정 문자열로 연결되어 있는 경우, 구분자를 기준으로 부분 문자열로 만듦.(split()메소드와 용도가 같음)
//countTokens() : 꺼내지 않고 남아있는 토큰의 수
// hasMoreTokens() : 남아있는 토큰이 있는지 여부 확인. 있으면 true 넘어옴.
// nextToken() : 토큰을 하나씩 꺼내 옴
public class StringToken {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("이름을 / 기준으로 입력 하세요 : ");
        String names = sc.nextLine();
//        StringTokenizer st = new StringTokenizer(names, "/");
//        String[] nameStr = new String[st.countTokens()];
//        int idx = 0;
//        while (st.hasMoreTokens()) {//참인동안 남아있는 토큰을 돌리기 위해 와일문
//            nameStr[idx++] = st.nextToken();
//        }
//
//        String[] nameStr = names.split("/"); // 토큰 대신 스플릿
//
//        for(String e : nameStr) System.out.print(e + " ");

        //Class 클래스, 클래스의 이름이 클래스.
        String s = new String();
        Class c = s.getClass();
        System.out.println(c); // 클래스의 이름을 알려주는 용도로 쓴다.
    }
}
