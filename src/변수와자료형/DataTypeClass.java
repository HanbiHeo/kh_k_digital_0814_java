package 변수와자료형;
//2023.08.14
// 변수란, 값을 저장할 수 있는 메모리 공간에 이름을 붙이는 것 ; 식별을 할 수 있어야 함.
public class DataTypeClass {
    public static void main(String[] args) {
        //프로그램 하나에 메인 하나만 있어야함, 원래는
        int age; //정수형 변수 선언.   자바에서 int는 4바이트 ; 4바이트(4byte=32bit) 공간을 확보하고 초기값은 아직 없음, 정수값(소수점 이하는 없는 값)을 저장하는 목적.
        double value; //실수값을 저장하기 위한 변수 선언.

//        int 1st; // 숫자가 앞에 오면 안됨.
//        int st1; // 숫자가 앞에오는게 아니라 가능.
//        int_class; // class는 예약어(조건문, 반복문 등 자바에서 예약해둔 키워드)이기 때문에 안됨.
//        int_a@; //특수문자는 _ 혹은 $ 만 가능
        int _______1234; //가능 숫자가 앞이 아니라 가능
        int $$$$$______; //가능
        int taxRate; //camel 표기법 ; 자바는 카멜 표기법 사용함.(개발자간의 원활한 소통을 위해 관례상)
        
        char gender = 'M'; //선언과 동시에 초기화. gender라는 변수에 문자M을 대입한다는 의미. char는 2바이트
        // 자바는 유니코드.  2바이트에 표현 문자 약 6만 5천은 전세계문자가 다 들어감. 그래서 char는 2바이트 가능. 숫자는 음수가 나오나 char는 음수가 없음.(=문자는 음수 없음)
        //때문에 char ; 2바이트 쓸 수 있음.

        //논리형 변수 선언 ; 참과 거짓을 판별하기 위해서 사용하는 자료형
        boolean istrue = true; //자바에서는 true or false 값을 가짐. = boolean값을 가짐.
        // 기타 c언어나 자바 스크립트는 0을 제외한 모든 건 true  다른 언어는 0을 넣어도 false로 간주하나
        // 자바에서는 true 혹은 false 의 예약어만 사용할 수 있음. 다른언어 못 옴

        //정수형 변수 선언(정수의 4가지 타입) : 소수점 이하가 없고 양수와 음수가 존재.
        byte bNum; // 1Byte크기의 변수 선언. 1Byte == 8bit(256가지 경우의 수)를 양, 음수로 나눔(-128 ~ +127[0때문에 127] 까지 ; 0은 양수.)
        short sNum; // 2Byte크기의 변수 선언.
        int iNum; // 4Byte //int형을 가장 많이 씀
        long lNum; // 8Byte
        // byte, short는 잘 쓰지 않음. 이점이 없음. 네개이 데이터중 제일 빠른건 int. 프로그램은 int기준임. 21억(42억의 음,양) 바이트 보다 클 것 같으면 long

        //실수형 선언
        float fNum; // 실수 범위가 4byte
        double dNum; //8byte. 실수에서는 기본이 double형으로, double을 주로 씀.
        //실수 연산은 최대한 피하는게 좋다. 정확한 값으로 떨어지지 않기때문에 근사치로 계산하게 됨. 때문에 연산하는 컴파일러마다 오차가 생김.
        //정확한 값이 안나오기 때문에 조건문의 기준값으로 쓰지 않음. 코드의 기준값이 될 수 없음,
        // AI에서는 모호한 값이 많기때문에 실수형도 많이 쓴다.

        int num1, num2; // 같은 타입의 변수를 동시에 선언할 수 있음. (콤마,로 구분)
        double num3 = 3.14; // 선언과 동시에 값을 초기화 함.
        double num4 = 1.23, num5 = 4.56; // 같은값을 동시에 주면서 초기화 가능
        int hour = 4;
        int minute = 50;
        System.out.println(hour + "시간 " + minute + "분");


    }

    class  NameCard {
        String name;
        String address;
        String eMail;
        String phoneNum;
        //위에는 자바의 네임카드. 밑은 별도의 네임카드에 대한 커스터마이징 자료형.
        //하나의 클래스로 묶어 자료형을 만들 수 있다.
    }
}
