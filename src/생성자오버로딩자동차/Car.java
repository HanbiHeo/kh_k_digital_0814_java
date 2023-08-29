package 생성자오버로딩자동차;

public class Car { // 인스턴스필드
    String company = "현대자동차";
    String model;
    String color;
    int speed;
    int horsePower;

    Car() { }

    Car(String model) {
        this.model = model;
    }
    Car(String model, String color) {
        this. model = model;
        this.color = color;
    }
    Car(String model, String color, int speed){
        this. model = model;
        this.color = color;
        this.speed = speed;
    }
    Car(String model, String color, int speed, int horsePower){
        this. model = model;
        this.color = color;
        this.speed = speed;
        this.horsePower = horsePower;
    }

    //숨어있는 디폴트 생성자(생성자를 안만들면 숨어있는 생성자가 있음. 클래스 이름과 같음.)
//    Car() {
//    }


    public void carInfo() { //인스턴스필드의 메소드
        System.out.println(company + "  ");
        System.out.println(model + "  ");
        System.out.println(color + "  ");
        System.out.println(speed + "  ");
        System.out.println(horsePower + "  ");
    }
}
