package 변수의스코프;
//2023.08.16
public class VarScopeClass2 {
    public static void main(String[] args) {
        //  문자 자료형 : 자바에서는 유니코드를 사용 (2바이트로 전세계의 모든 문자를 표시), 앞의 1바이트는 ASCII와 동일
        char ch = 'A'; //자바에서 문자는 작은 따옴표를 사용 (큰따옴표는 문자열, 작은따옴표는 문자 하나) 유니코드로 저장됨.
        //실제 저장은 정수값으로 저장됨
       // String cha = "A";

        System.out.println(ch);
        System.out.println((int)ch); // 명시적으로  형을 int형으로 변경함.

        char ch2 =66; // char 형은 음수가 없음. 코드값에 음수가 없으니까 당연히 음수 없음.
        System.out.println(ch2); // 문자에 대한 코드값이 움직임.
        System.out.println((int)ch2);

        // 실수 자료형 : float(4바이트Byte, 32비트,bit), double(8바이트), 근사치 계산법;소수점이 계속 떨어진다면, 반올림을 통해 근사치 계산법을 씀.
        //관례상 Byte는 대문자, bit는 소문자. 속도와 저장공간등의 표시시 표현방법이 다름.
//        float height = 175.5f; //float는 무조건 뒤에 f를 붙여주어야함.
//        double pi = 3.14159d; //d 안써도 됨.
        double num1 = 0.1;
        for(int i = 0; i < 1000; i++) {
            num1 += 0.1;
        }
        System.out.println(num1);


    }
}
