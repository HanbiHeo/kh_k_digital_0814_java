package 상속기본0823;
//23.08.23_6
//자식 클래스가 부모 클래스의 기능을 물려 받는 것(필드와 메소드)
//키워드는 extends
public class InheritanceEx {
    public static void main(String[] args) {
//        Dog dog = new Dog();
//        dog.setName("Sundol");
//        dog.cute();
        HouseDog houseDog = new HouseDog();
        houseDog.setName("Sundol");
        houseDog.cute(8);
    }
}
