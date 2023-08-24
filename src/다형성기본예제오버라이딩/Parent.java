package 다형성기본예제오버라이딩;

public class Parent {
    protected int num = 100000; // 상속관계와 같은 패키지 내에서 접근 가능 //protected가 있으면 패키지가 달라도 접근 가능
    int money = 10000000;
    public void display() {
        System.out.println("부모 클래스 메소드");
    }
}
