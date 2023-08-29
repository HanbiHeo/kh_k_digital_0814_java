package 열거타입Enum타입두번째예제;
//0829
public class EnumTypeEx2 {
    public static void main(String[] args) {
        Developer developer = new Developer("민호", DevType.BACKEND, Career.JUNIOR, Gender.MALE);
        developer.devInfo();
    }
}
