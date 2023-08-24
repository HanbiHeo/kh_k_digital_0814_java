package 다형성매개변수의다형성2;
//0824_4
import javax.swing.*;
import java.util.Scanner;

//0824_4
public class DriverMain {
    public static void main(String[] args) {
        Driver driver = new Driver("철수");
        Bus bus = new Bus();
        Taxi taxi = new Taxi();
        SportsCar sportsCar = new SportsCar();
        Scanner sc = new Scanner(System.in);
        System.out.print("운전하고 싶은 차를 선택 [1]버스 [2]택시[3]스포츠카 : ");
        int selCar = sc.nextInt();
        switch (selCar) {
            case 1: driver.drive(bus); break;
            case 2 : driver.drive(taxi); break;
            case 3 : driver.drive(sportsCar); break;
            default : System.out.println("차량 선택을 잘못하셨습니다.");
        }
    }
}
