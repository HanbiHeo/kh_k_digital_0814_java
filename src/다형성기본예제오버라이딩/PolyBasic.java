package 다형성기본예제오버라이딩;
//0824_2
public class PolyBasic {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Child child = new Child();
        child.out();
        child.display();
        parent.display();

        Parent p = new Child(); //부모클래스의 참조변수로 자식객체를 접근 함
        p.display(); // display는 부모, 자식중 자식게 불려짐. 오버라이딩 된게 우선 불려짐. '오버라이딩이 일어난 자식 메소드가 호출 됨'
    }
}
