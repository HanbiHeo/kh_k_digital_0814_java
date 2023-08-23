package 변수의스코프;
//2023.08.14
// 변수가 할당되고 사용되는 범위 확인

public class VarScopeClass {
    public static void main(String[] args) {
//        int value = 10; // int 형으로 선언된 value 변수에 10을 대입(=할당)
//        int sum = value + 20; //int 형으로 선언된 sum은 value의 값에서 20을 더한 값
//        System.out.println("SUM의 값 : " + sum);
        //이것은 변수의 범위는 아님. 일반적인것을 보여주는 예시

//        int n =20;
//        if (n > 10) { //중괄호는 블록 스코프, 블록에 대한 범위
//            int m = 30;
//            m = n-10;
//            System.out.println("m 값 : " + m);
//            int k = n+ m; // 중괄호 안에 있기 때문에 m의 값이 나옴
//        }
//        int k = n + m; // m이 빨갛게 뜨는 이유는 블록 스코프 안에서 m은 사용되고 사라짐.

//자료형의 종류 및 표현범위 중
//문자열 String 은 참조형. 바이트가 없음. 데이터 크기가 큰 경우에는 주소만 제시. 주소 크기는 8바이트.  'S'tirng 대문자인 이유는 기본타입이 아닌 주소를 가지는 참조타입이기 때문.
//기본타입과 참조타입에 대한 추가 복습.
//c, c++는 주소를 알 수 있고 조작 가능. ios
//java는 참조타입의 주소 알 수 없고 변경 불가능. 안정성을 위해 성능을 포기함. 자바에서는 주소 개념이 없고 참조타입임.
//참조형은 8바이트

        byte num1 = 127; // -128 ~ 127
    num1++; // 증가연산자. 값이 뒤집혀 버림.

    System.out.println(num1);
    //   int k = n+ m; // m이 빨갛게 뜨는 이유 ; 중괄호의 역할이 중요. block scope. m은 괄호 밖에 있기 때문에 연산이 되지 않음. m은 중괄호가 닫히면 사라짐.

    }
}
