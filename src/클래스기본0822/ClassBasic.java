package 클래스기본0822;
//230822_1
public class ClassBasic {
    public static void main(String[] args) {
        Student s1 = new Student();//student class에 대한 참조변수(주소가 저장), new는 동적 할당
        System.out.println(s1.setName("Hershey"));
        s1.setAddr("경기도 양주시");
        s1.showInfo();
        Student s2 = new Student();
        s2.setName("패트");
        s2.setAddr("서울시 서대문구");
        s2.showInfo();
        Student s3 = new Student();
        s3.setName("매트");
        s3.setAddr("경기도 용인시");
        s3.showInfo();
    }
}
