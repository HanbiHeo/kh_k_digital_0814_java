package This에대한예제;

public class Car {
    private String model;    //자동차 명
    private int year;              // 출고년도
    private String color;      // 색상
    private int maxSpeed;  //최고속도
    Car() {}
    Car(String model) {
        this(model, 2022, "black", 280); // 생성자에서 다른 생성자 불러올 때.
    }
    Car(String model, int year, String color, int speed){
        this.model = model;//자기 자신을 객체로 하는 객체를 참조함
        this.year = year;
        this.color = color; // 전달받은 매개변수와 인스턴스필드의 이름이 같은 경우 this 넣어주고
        maxSpeed = speed; //그렇지 않은경우 this생략 가능함
    }
}
