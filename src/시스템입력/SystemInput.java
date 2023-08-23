package 시스템입력;
//2023.08.16

import java.util.Scanner;

//Scanner 클래스를 사용해서 입력 받음

public class SystemInput {
    public static void main(String[] args) {
        //sc는 클래스에 대한 객체변수. 클래스는 설계도면 이라고 생각하면 됨
//        Scanner sc = new Scanner(System.in); //new 는 동적으로 할당. 스캐너에 대한 객체 생성
//        byte a = sc.nextByte(); // byte 형의 입력값을 받아 반환(return)
//        short b = sc.nextShort(); //short 형의 입력을 받아 반환
//        int c = sc.nextInt(); // int 형의 입력을 받아 반환
//        long d = sc.nextLong(); // long 형의 입력을 받아 반환
//        char ch = sc.next(). charAt(0); // 문자열에서(sc.next()), 0번째 (첫번째) 문자를 추출(charAt(0);)
//        float e = sc.nextFloat(); //float 형의 입력을 받아 반환
//        double f = sc.nextDouble(); // double 형의 입력을 받아 반환
//        String h = sc.next(); // 공백 기준으로 입력받음
//        String i = sc.nextLine() // 줄바꿈 문자 기준
        Scanner sc = new Scanner(System.in);
        System.out.print("이름을 입력 하세요 : ");
        String name = sc.next(); // 이름을 입력한 후 공백이나 enter(줄바꿈)이 일어나면 다음으로 넘어감. nextLine 에서는 잘 발생하지 않으나, next에서는 엔터누를 때 넘어가버리는 경우가 있음
        //출력하고 오류가 나오면
        sc.nextLine(); //버퍼 비우기. 줄바꿈이 안일어 나면 버퍼 비우기를 해주어야 함. 의미없는 줄바꿈을 하나 넣어줌. 엔터키를 누를 때 넘어가버리는 경우가 가끔 있음.
        // 넣어주면 됨
        System.out.print("주소를 입력 하세요 : ");
        String addr = sc.nextLine(); // 줄바꿈이 일어나면 다음 입력으로 넘어감.
        System.out.print("성별을 입력 하세요 : ");
        char gender = sc.next().charAt(0); //입력 받은 문자열에서 맨앞의 문자 1자 추출
        System.out.print("나이를 입력 하세요 : ");
        int age = sc.nextInt();

        System.out.println("==== 회원 정보 출력 ====");
        System.out.println("이름 : " + name);
        System.out.println("주소: " + addr);
        System.out.println("성별 : " + gender);
        System.out.println("나이 : " + age);

    }
}
