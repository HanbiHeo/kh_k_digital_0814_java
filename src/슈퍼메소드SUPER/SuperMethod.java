package 슈퍼메소드SUPER;
//0824_5
//super : 부모의 필드나 메소드를 접근할 때 사용
//super() : 부모의 생성자를 호출
public class SuperMethod {
    public static void main(String[] args) {
        Child child = new Child(); // 부모 생성자 받은 차일드 생성자.
//        child.childMethod();
        child.display();
    }
}
class Parent {
//    int x = 10;
    int a;
    Parent() {a = 10;}
    Parent(int n) { a = n;}
    
}
class Child extends Parent{
//    int x = 20;
//    void childMethod() {
//        System.out.println("x : " + x); // 자식 필드 접근
//        System.out.println("x : " + this.x); // this는 숨어있었음. 안 써도 됨. 자식 필드 접근
//        System.out.println("x : " + super.x); //부모의 필드 접근
//    }
    int b;
    Child() {
//        super(100)
        b = 20;
    }
    void display() {
        System.out.println(a);
        System.out.println(b);
    }
}
