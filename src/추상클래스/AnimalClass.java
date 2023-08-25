package 추상클래스;
//추상클래스는 클래스 앞에 abstract 키워드를 붙여서 만듦
//추상클래스는 객체화 안됨
//내부에 0개 이상의 추상 메소드가 포함되어 있음
//추상 메소드는 반드시 상속받는 클래스에서 오버라이딩 해주어야 함(해당 메소드의 기능을 구체화 시킴)
public abstract class AnimalClass { //abstract 분이면 객체로 못만듦
    abstract void cry(); // ;이건 이름만 있는거(명시만 한거). {!!구현부가 있음!!}이건 실체가 있는 것.
    //abstract가 붙으면서 추상메소드가 됨 : 상속받은 클래스에서 구체화를 해줘야함(:오버라이딩 해야함).
    void sleep() { // 이건 일반 메소드. 상속 해도되고 안해도 됨.
        System.out.println("zzzz");
    }
}
class Cat extends AnimalClass {
    @Override
    void cry() { // cry라는 메소드를 오버라이딩 함. (구현부를 만듦)
        System.out.println("야아아아ㅏㅏㅏㅏ");
    }
    @Override
    void sleep(){
        System.out.println("ZZZZZZZZZZZ");
    }
}
class Dog extends AnimalClass{

    @Override
    void cry() {
        System.out.println("우오아왕");
    }
}
