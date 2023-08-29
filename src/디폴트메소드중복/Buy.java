package 디폴트메소드중복;

public interface Buy {
    void buy(); // public abstract 자동으로 추가 됨.
    default void order() { //예외적으로 구현부를 가짐. 인터페이스 상속이 광범위하게 일어남.부모가 구현부를 가짐
        System.out.println("구매 주문");
    }
}
interface Sell {
    void sell();
    default void order() {
        System.out.println("판매 주문");
    }
}

class Customer implements Buy, Sell {

    @Override
    public void buy() {

    }

    @Override
    public void sell() {

    }

    @Override
    public void order() {
        Buy.super.order(); //Buy or Sell 둘 중 하나만 명시해주면 됨. 아니면 명시적으로 둘 다 지정해주어도 돌아감.
       // Sell.super.order();
        //오버라이딩은 필수
    }
}