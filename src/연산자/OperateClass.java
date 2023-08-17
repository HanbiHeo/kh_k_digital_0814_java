package 연산자;
//2023.08.16

import java.util.Scanner;

//산술연산자 : 사칙연산(+, -, *, /)과 나머지 연산자(%)
public class OperateClass {
    public static void main(String[] args) {
        int num1 = 10, num2 = 2;
//        System.out.println("덧셈 : " + (num1 + num2));
//        System.out.println("뺄셈 : " + (num1 - num2));
//        System.out.println("곱셈 : " + (num1 * num2));
//        System.out.println("나눗셈 : " +((double) num1 / num2));
//        System.out.println("나머지 : " + (num1 % num2)); // 나머지 연산자 알고리즘에 많이 씀. 중요.
//        System.out.println("몫 : " + (num1 / num2));

        //대입연산자 : 변수에 값을 대입하는 연산자( = ), 프로그램에서 = 같다라는 의미가 아니라 값을 대입한다는 의미
//        if(number == 100) {
//
//        }
//        System.out.println(num1 += 2); // 복합대입연산자 num1 = num1 + 2;
//        System.out.println(num1 -= 2); // 복합대입연산자 num1 = num1 - 2;
//        System.out.println(num1 *= 2); // 복합대입연산자 num1 = num1 * 2;
//        System.out.println(num1 /= 2); // 복합대입연산자 num1 = num1 / 2;

        //증감연산자 : 단항연산자, 피연산자의 값을 1증가 또는 1감소 시키는 연산자
//        System.out.println(++num1); // 11이 찍힘 '++'는 1 증가 전위연산자
//        System.out.println(num1++); //10이 찍힘 후위연산자

//        int tmp = num1++;
//        System.out.println(tmp); // 대입되는 순간에는 10
//        System.out.println(num1); // num1이 대입된 후 11
//        int tmp2 = --num1;
//        System.out.println(tmp2); // 앞에 붙어서 10
//        System.out.println(num1); // num1이 대입된 후 10

        //비교연산자 : 두개의 피연산자를 비교해서 어느쪽이 큰지를 판단.
        int x = 10;
        int y = 20;
        boolean rst1, rst2, rst3;
//        System.out.println(x > y); // 거짓
//        System.out.println(x < y); // 거짓
//        System.out.println(x == y); // 거짓
//        System.out.println(x != y); // 참(같지않은지)
//        System.out.println(x >= y); // 거짓(크거나같은지)
//        System.out.println(x <= y); // 참(작거나같은지)
        
        //논리연산자 : &&(AND연산자, 둘 다 참인 경우 참), ||(OR 연산자, 둘 중 하나만 참이면 참)
        // ! : NOT연산자, 현재가 참이면 거짓, 거짓이면 참. 부정의 연산자.
//        rst1 = (x > 0) && (x > y); //거짓
//        rst2 = (x > 0) || (x > y); //참
//        rst3 = !((x > 0) || (x < y)); //거짓
//        System.out.println(rst1 + " " + rst2 + " " + rst3);

        //삼항연산자 : 3개의 피연산자를 필요로 하는 연산자,
//        Scanner sc = new Scanner(System.in); // 키보드 입력을 받기 위해서
//        System.out.println("나이를 입력 하세요 : ");
//        int age = sc.nextInt(); // 커서가 떨어짐
//        boolean isAdult = (age > 19) ? true : false ;
//        System.out.println(isAdult);

        // 문자열 결합 연산자 : 순차적으로 계산되기 때문에.
//        System.out.println("Java" + 18.04 + 12);
//        System.out.println(3 + 3.3 + "JDK");

        //연산자 우선순위 확인
        int val1 = 5;
        int val2 = 5;
        int val3 = 5;
        int result1, result2, result3;
        result1 = val1 + val2 * val3; //30
        result2 = (val1 + val2) * val3; // 50
        result3 = val1 + (++val2) * val3; //35
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

    }
}
