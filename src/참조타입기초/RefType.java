package 참조타입기초;
//08.21_1
//자바의 타입(데이타타입)은 기본타입과 참조타입으로 나누어 진다
//기본타입은 정수, 실수, 문자, 논리값 등을 저장하는 타입이다 (실제 값이 변수에 저장된다)
//참조타입은 객체의 주소를 변수에 저장하는 타입니다 (배열, 열거형, 인터페이스, 클래스, 문자열)
public class RefType {
    public static void main(String[] args) {
        //========================기본타입 예제=============================
        int age = 25; //int형으로 만들어진 age라는 변수에 25라는 값을 저장함
        double price = 100.5; // double형으로 만들어진 price라는 변수에 100.5라는 실수값을 저장함
        //========================참조타입 예제=============================
        String name = "Hershey";  // string형으로 만들어진 name에는 실제 "Hershey"라는 문자열이 없고 주소가 있음
//        System.out.println(name); 
//        int unbox = 0; // int형의 기본타입이라서 null들어갈 수 없음. 값을 대입히야함
//        Integer  boxedValue = null; //참조타입이라 값이 아니라 주소가 들어감. null도 가능하고 0도 들어감
//        int intValue = boxedValue;
//        System.out.println(intValue); // 가리키고 있는 대상이 없음. null. 
        
        String strVal1 = "나희도"; //리터럴 상수로 고정
        String strVal2 = "나희도";
        String strVal3 = new String("나희도"); // heap 영역의 메모리 공간을 확보함

        //참조변수에서 ==, != (참조변수에서 주소가 같은지 물어보게 됨)
        if(strVal1 == strVal2) {// 주소가 같은지 물어봄
            System.out.println("strVal1 과 strVal3를 참조하는 주소가 같음");
        } else {
            System.out.println("strVal1 과 strVal3를 참조하는 주소가 다름");
        }

        if(strVal1.equals(strVal2)){//포함된 내용, 즉 문자열이 같은지 물어봄(stlVal1, strVal3)
            System.out.println("strVal1과 strVal3의 내용이 같음");
        }
    }
}
