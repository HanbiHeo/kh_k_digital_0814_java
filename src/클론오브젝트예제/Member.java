package 클론오브젝트예제;
//얕은복사 : 필드값만 복사해 객체를 복제하는 것. 주소가 복제되면 얕은 복사.
//clone()은 Cloneable 인터페이스를 상속받은 경우에만 가능.
public class Member implements Cloneable {
    String id;
    String name;
    String password;
    int age;
    boolean adult;
    void viewInfo() {
        System.out.println("ID" + id);
        System.out.println("이름" + name);
        System.out.println("비밀번호" + password);
        System.out.println("나이" + age);
        System.out.println("성별" + adult);
    }
    public Member(String id, String name, String password, int age, boolean adult) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.age = age;
        this.adult = adult;
    }
    public Member getMember() {
        Member cloned = null;
        try {
            cloned = (Member) clone(); // 클론 메소드는 Object Class 타입이므로 형변환 해줘야함
        }catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return cloned;
    }
}
