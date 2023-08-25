package 추상클래스;

import 상속기본0823.Animal;

public class AnimalMain {
    public static void main(String[] args) {
       //  AnimalClass animalClass = new AnimalClass()  구현 안됨
        Cat cat = new Cat();
        cat.cry();
        cat.sleep();

        Dog dog = new Dog();
        dog.cry();
        dog.sleep();

//추상클래스의 참조 변수로 상속 객체를 접근, 자주 쓰이는 방법
        AnimalClass animal = new Cat();
        animal.sleep();
    }
}
