package 예외처리세번째;
//0904
//NullPointerException(NPE) : Java에서 발생하는 대표적인 런타입 에러입니다. 참조하려는 객체가 없는 경우 발생합니다.
public class ExceptionEx3 {
    public static void main(String[] args) {
        Test test = null;

        if(test != null) {
            String testStr = test.name;
            System.out.println(testStr);
        } else {
            System.out.println("test가 null 입니다.");
        }

    }
}
class Test {
    String name = "철수";
}
