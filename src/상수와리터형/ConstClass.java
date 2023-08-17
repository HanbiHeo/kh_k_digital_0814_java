package 상수와리터형;
//2023.08.16
import javax.lang.model.element.NestingKind;
import java.util.Scanner; // 스캐너를 사용하기 위해 import 해야함 스캐너는 기본적으로 포함이 되지 않기때문에 임포트 시켜야함.
// 상수 : 변수와 마찬가지로 메모리에 저장할 공간을 확보하는 것. 단 한번만 값을 지정할 수 있음. 한번 쓰면 그다음부터는 바꿀 수 없음.
// 값을 한번 쓰고 나면 read only 상태가 됨 = 메모리 관점에서 보면 메모리는 읽기만 하고 쓰기는 못하게 바꿈. write 불가 상태로 바뀜.
// final 키워드를 사용 ; 단 한번만 초기화 되는 상태가 됨.
public class ConstClass {
    final static String KH_DOMAIN = "http://192.167.12.13"; // static 은 단 한번만 만들어 진다는 뜻임.
    final static String PORT_NUM = "8111";
    public static void main(String[] args) {
//        int AGE = 30; //final int age = 30; 가 되면 상수이기 때문에 age 의 값은 바뀔 수 없음.
//        //자바는 선언과 별도로 단 한번 값의 대입이 가능 = 자바에서는 어느 위치든 상관 없이 한번만 값을 지정해주면 됨. c나 c++ 은 바로 값을 지정해줘야함.
//        // 상수는 관례상 대문자를 사용.
//        char gender = 'M';
//
//        if(gender == 'M'){
//            AGE =33;
//        } // 변수이기 때문에 age 의 값이 바뀌 수 있음.
//        System.out.println(AGE);

        final double TAX_RATE = 0.10; // 세율 값을 고정함
//        Scanner sc = new Scanner(System.in); // 표준 입력을 받기 위해서  사용
//        System.out.print("수입을 입력 하세요 : "); // print'ln' 줄바꿈을 안하기 위해 뺌.
//        int income = sc.nextInt(); // 키보드로 부터 입력받은 값을 정수형 변수에 대입 함.
//        System.out.println("당신이 내야 할 세금은 " + (income * TAX_RATE) + "입니다.");

        System.out.println(KH_DOMAIN);
        System.out.println(PORT_NUM);

    }
}

//자바 스크립트에서는 실수형을 많이 씀.
