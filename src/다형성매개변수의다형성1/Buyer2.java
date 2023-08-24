package 다형성매개변수의다형성1;

public class Buyer2 {
    int money = 1000;
    int bonusPoint = 0;
    void buy(Product1 p) { // 상속관계를 이용해 p 만. "구매에 대한 메소, 부모 클래스의 참조변수로 자식 객체를 접근함"
        money -= p.price;
        bonusPoint += p.bonusPoint;
    }
    void viewInfo() {
        System.out.println("잔액 : " + money);
        System.out.println("누적 포인트 : " + bonusPoint);
    }
}
