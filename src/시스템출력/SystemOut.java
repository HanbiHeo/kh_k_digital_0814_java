package 시스템출력;
//2023.08.16

import java.util.Scanner;

// System.out : 표준 출력 스트림
// print, println : 오버로딩이 적용된 메소드 이며, 줄바꿈 차이만 있음.
public class SystemOut {
    public static void main(String[] args) {
        String name = "곰돌이사육사";
        String addr = "수원시";
        int age = 22;
        double pi = 3.1415914444;
//
//        System.out.println(age);
//        System.out.println(name);
//        System.out.printf("%s\n", name);   // '\n'은 줄바꿈
//        System.out.printf("%.2f\n", pi); // %.2f 는 소수점 둘째자리까지 표기한다는 명령어
        char gender = 'M';
        int kor = 99, eng = 88, mat = 40;
        
        // 자바스타일 : 오버로딩으로 구현 되어 있음. 오버로딩; 같은 이름으로 여러개의 메소드가 만들어져 있음. C 언어에서는 오버로딩 개념이 없음.
//        System.out.println("======= Java Style =======");
//        System.out.print("======= Java Style =======\n");
//        System.out.println("이름 : " + name);
//        System.out.println("주소 : " + addr);
//        System.out.println("성별 : " + gender);
//        System.out.println("나이 : " + age);
//        System.out.println("총점 :" + kor + eng + mat);
//        System.out.println("총점 :" + (kor + eng + mat)); // 괄호는 연산자 1번째(우선순위가 높다). 괄호 먼저 계산 후 문자열로 연산, 연산 우선순의를 변경하여 덧셈을 먼저 수행.
//        System.out.println(kor + eng + mat);
//
//        System.out.println("평균 : " + ((double)kor + eng + mat / 3)); // 연산자 우선순위와 관련이 있음. 나눗셈 -> 덧셈
//        System.out.println("평균 : " + ((double)(kor + eng + mat) / 3)); //연산자 우선 순위가 덧셈보다 나눗셈이 높아서 순서를 변경해야함.()소괄호를 사용하여 순서 변경.
//        System.out.println("평균 : " + ((kor + eng + mat) / 3.0)); // 앞에 묵시적 형변환

        // C 언어 스타일 : 서식을 지정하는 스타일.
        // 서식 지정자 : %d(decimal 정수), %ld(long 타입의 정수), %u(un 부호 없는 정수형), %f(실수형), %c(문자)
        // 이스케이프 시퀀스 : 탈출하는 조건,  \n(줄바꿈 new line), \r(carriage return 캐리지 리턴, 커서를 라인의 처음으로 이동), \t(tap), \b(back space), \\(백스페이스 하나필요하면 두개 입력)

//        System.out.printf("이름 : %s\n ",  name); // %를 넣으면 뒤에 서식이 오겠구나 예측을 함. %뒤에 바로 서식 넣어주어야 함. s string
//        System.out.printf("오늘의 습도는 %.2f%% 입니다. \n", 85.555555); // 실수형의 출력, 소수점 이하 2자리까지 반올림해서 출력 %% 두개 찍은 이유는  하나는 서식. 하나는 '%'로 인식
//        System.out.printf("성별 : %s\n", gender); // 문자 출력
//        System.out.println("안녕하세요. 저의 이름은 \"곰돌이사육사\" 입니다.");
//        System.out.printf("평균 : %.2f\n ", (kor + eng + mat) / 3.0);
//        System.out.printf("Apple\rBanana\tOrange\b\n");
//        System.out.printf("|%-6d|%-6d|%-6d\n", 100, 2000, 30000); //오른쪽 정렬|%6d|%6d|%6d, 왼쪽 정렬|%-6d|%-6d|%-6d
        Scanner sc = new Scanner(System.in); // System.in 입력을 받을 수 있게.
        System.out.println("정수 입력 : ");
        int n = sc.nextInt();
        for(int i = 1; i <= n * n; i++) {
            System.out.printf("%8d", i);
            if (i % n == 0) System.out.println();
        }
    }
}
