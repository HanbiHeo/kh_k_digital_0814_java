package 상속기본0823;

public class Animal { //public은 하나여야 함. 아무데서나 참조 가능.
    String name;
    void setName(String name) {
        this.name = name;
    }
}
//클래스 이름과 파일 이름은 같아야 함!! class앞에는 디폴트가 걸려있음.
// Animal을 상속받아 Dog 클래스를 만듦
class Dog extends Animal {
    void cute() {
        System.out.println(this.name + " is cute");
    }
}
//다단계상속
class HouseDog extends Dog { //있는걸 재정의. 오버라이딩된게 우선 출력됨. 없으면 부모걸 씀. 추상화에서는 반드시 오버라이딩이 되야함.
    void cute() {
        System.out.println(this.name + " is cute and kind");
    }
    void cute(int age) {
        System.out.println(this.name + " is cute and kind, he is " + age + " years old");
    }
}
