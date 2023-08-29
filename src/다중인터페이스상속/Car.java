package 다중인터페이스상속;

public class Car { // 생성자 만들기
    protected int speed; // 상속관계가 성립되면 접근 가능.
    protected String color;
    protected String year;
    public Car(){ //생성자
        speed = 150;
        color = "white";
        year = "1999";
    }
}
