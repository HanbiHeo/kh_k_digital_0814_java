package Vector클래스;

import java.util.List;
import java.util.Vector;

//0830
//ArrayList 구조와 메소드가 동일함, 동기화가 지원되어서 멀티 쓰레드 환경에서 안전함. 하지만 ArrayList 대비 성능이 떨어짐.
public class VectorClass {
    public static void main(String[] args) {
        List<NameCard> list = new Vector<>(); //=ArrayList, LinkedList 다 동작함.
        list.add(new NameCard("우영우", "oo@gmail.com", "010-1234-5678",  "변호사"));
        list.add(new NameCard("동그라미", "round@gmail.com", "010-1134-5378",  "파트타이머"));
        list.add(new NameCard("준호", "jun@gmail.com", "010-1133-7778",  "직장인"));

        for(NameCard e : list) {
            System.out.println("이름 : " + e.name);
            System.out.println("메일 : " + e.mail);
            System.out.println("핸드폰 : " + e.phone);
            System.out.println("직업 : " + e.jobs);
            System.out.println();
        }
    }
}

class NameCard {
    String name;
    String mail;
    String phone;
    String jobs;

    public NameCard(String name, String mail, String phone, String jobs) { // 생성자
        this.name = name;
        this.mail = mail;
        this.phone = phone;
        this.jobs = jobs;
    }
}
