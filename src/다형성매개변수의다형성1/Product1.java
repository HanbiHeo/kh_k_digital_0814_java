package 다형성매개변수의다형성1;

public class Product1 {
    int price;
    int bonusPoint;
}
class TV extends Product1 {
    TV() {
        this.price = 100;
        this.bonusPoint = 10;
    }
}
class Computer extends Product1 {
    Computer() {
        this.price = 200;
        this.bonusPoint = 20;
    }
}
class Audio extends Product1 {
    Audio() {
        this.price = 120;
        this.bonusPoint = 12;
    }
}
