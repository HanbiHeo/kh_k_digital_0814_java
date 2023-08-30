package 오브젝트클래스;
//0829
//toString() : 해당 인스턴스의 대한 정보를 문자열로 반환
//'클래스이름@해시코드' 의 형태로 반환 (객체의 메모리 주소를 이용해 해시코드 생성)
public class ObjectClass {
    public static void main(String[] args) {
        Car car01 = new Car();
//        Car car02 = new Car();
//        System.out.println(car01.toString()); //출력시 : 오브젝트클래스.Car@2133c8f8로 찍힘.
//        System.out.println(car02.toString());
//        String test = "미애";
//        Integer test2 = 2300;
//        System.out.println(test.toString()); //toString() 메소드는 오버라이딩해서 사용 가능하며, String, Integer의 경우에는 이미 오버라이딩 되어 있음.
//        System.out.println(test); // test는 참조변수. 오버라이딩해서 실제 값을 찾아와줌.
//        System.out.println(test2);
//        System.out.println(test2.toString());
//        int test3 = 4500;
//        System.out.println(test3);

        Car car02 = car01;
        //equals() 메소드 : 인스턴스를 매개변수로 전달받는 참조변수와 비교하여 그 결과를 반환
        System.out.println(car01.equals(car02)); // 사실은 해쉬코드 값을 묻는 내용임. 해쉬코드값이 같다는건 메모리가 같다는 말
    }
}

class Car {

}