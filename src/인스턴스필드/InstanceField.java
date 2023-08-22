package 인스턴스필드;
//230822_3
public class InstanceField {
    public static void main(String[] args) {
        int val = 30; //지역변수
        FieldTest fieldTest1 = new FieldTest();
        fieldTest1.instanceVal = 200;
        FieldTest fieldTest2 = new FieldTest();
        fieldTest2.instanceVal = 300; //각각의 객체마다 값을 다르게 설정할 수 있음

        FieldTest.classVal = 1000;
    }
}
