package 제네릭연습1;
//0830
public class GenericEx1 {
    public static void main(String[] args) { //어떤 타입을 넣던 타입만 넣어주면 그 타입이 동작을 함.
//        Person<String> p1 = new Person<>("고유림");
//        System.out.println(p1.info);
//        Person<Integer> p2 = new Person<>(21);
//        System.out.println(p2.info);

        //멀티타입 브라켓
        Product<String, Integer> pr1 = new Product<>();
        pr1.setName("스마트TV");
        pr1.setYear(2023);
        System.out.println(pr1.getName() + " " + pr1.getYear());

        Product<Integer, String> pr2 = new Product<>();
        pr2.setName(123455);
        pr2.setYear("2023");
        System.out.println(pr2.getName() + " " + pr2.getYear());
    }
}



class Product<T, M> {
    private T name;
    private M year;

    public T getName() {
        return name;
    }
    public void setName(T name) {
        this.name = name;
    }
    public M getYear() {
        return year;
    }
    public void setYear(M year) {
        this.year = year;
    }
}

//class Person{
//    public String info;
//    Person(String info) {
//        this.info = info; //기존의 기본클래스타입
//    }
class Person <T> { // 대문자로 타입변수를 입력함
    public T info;
    Person(T info) {
        this.info = info; // T 자체가 변수. 객체타입은 아무거나 다 올 수 있음.
    }
}
