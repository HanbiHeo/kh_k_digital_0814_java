package 생성자오버로딩;
//230822_4
public class ConstructEx {
    public static void main(String[] args) {
        Car car = new Car();
        car.carInfo();

        Car santafe = new Car("싼타페");
        santafe.carInfo();

        Car avante = new Car("아반떼", "화이트");
        avante.carInfo();

        Car grendure = new Car("그랜져", "블루", 220);
        grendure.carInfo();

        Car tucsan = new Car("투싼", "블랙", 240, 170);
        tucsan.carInfo();
    }
}
