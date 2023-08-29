package 박싱과언박싱;
//0829
public class BoxingMain {
    public static void main(String[] args) {
        Integer num = 12; //박싱 인테자란 객체타입에 기본타입을 집어넣음. = '오토박싱'
//        Integer num = new Integer(12); //이것이 기본형태. 이걸 위 형태로 박싱.
//        System.out.println(num);

        Character ch = 'x'; //오토박싱이 일어남.
        char c = ch;  //오토 언박싱
        System.out.println(c); // 기본타입과 참조타입을 변경하며 쓸 수 있는 박싱, 언박싱 기능이 있음.
    }
}
