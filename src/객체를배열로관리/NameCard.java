package 객체를배열로관리;

public class NameCard {
    private String name;
    private String mail;
    private String phone;
    private int age;

    public void setName(String name) { // 세터
        this.name = name;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void printInfo() { // 게터 대신 바로 출력함.
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("연락처 : " + phone);
        System.out.println("이메일 : " + mail);
    }
}
