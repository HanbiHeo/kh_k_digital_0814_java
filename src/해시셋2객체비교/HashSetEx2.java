package 해시셋2객체비교;

import java.util.Arrays;
import java.util.HashSet;

//0831
public class HashSetEx2 {
    public static void main(String[] args) {
        HashSet<Member> hashSet = new HashSet<>();
        Member member1 = new Member(1001, "이찬혁");
        Member member2 = new Member(1002, "이수현");
        Member member3 = new Member(1003, "악뮤");
        Member member4 = new Member(1003, "악동뮤지션");
        //중복 아님. 인스턴스 주소가 달라서 hashCode가 다름. 중복제거를 위해서 오버라이딩 해야함
//        hashSet.add(new Member(1003, "악동뮤지션")); // 다 다른 객체, 객체로 판단하지 id값으로 판단하지 않음.
        hashSet.add(member1);
        hashSet.add(member2);
        hashSet.add(member3);
        hashSet.add(member4);
//        for(Member e : hashSet) e.viewMember();

        HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1,2,3,4,5,6));
        HashSet<Integer> s2 = new HashSet<>(Arrays.asList(4,5,6,7,8,9));
//        s1.addAll(s2); // 합집합 : 양쪽 모두 + 중복제거

//        s1.retainAll(s2); //교집합 : 양쪽 같이 있는것
        s1.removeAll(s2); // 차집합 : 앞에서 뒤 뺀것

        System.out.println(s1);
    }
}

class Member {
    int id;
    String name;

    @Override
    public int hashCode() { // id값으로 중복제거를 위한 코드
        return id; 
    }

    @Override
    public boolean equals(Object obj) { // id값으로 중복제거를 위한 코드
        if(obj instanceof Member) { // 다운캐스팅이 성립하는지 확인하기 위한 조건
            Member member = (Member) obj; //원래 형으로 형변환
            if(this.id == member.id) return true; // id가 같으면 중복이라고 판별
            else return false;
        }
        return false;
    }

    public Member(int id, String name) { // 생성자
        this.id = id;
        this.name = name;
    }
    public void viewMember() {
        System.out.println("아이디 : " + id);
        System.out.println("이름 : " + name);
        System.out.println();
    }
}
