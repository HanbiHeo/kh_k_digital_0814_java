package 매개변수람다식;
//0904
@FunctionalInterface //함수형 프로그램을 만들기 위해 사용하는 인터페이스임을 알리기 위한 어노테이션. 함수형 프로그램이라는걸 명시적으로 나타내기 위해 붙여줌. 내부에 함수가 한개만 존재함.
interface MyFuncInterface{
    void method(int x); //상속받는애가 반드시 구현해줘야함.
}
@FunctionalInterface //리턴값이 있는 람다식
interface MyFuncInterface2{
   int min(int x, int y);
}

public class LambdaEx1 {
    public static void main(String[] args) {
//        MyFuncInterface fi = x -> { //매개변수가 한개인 경우 () 생략가능
//            int result = x * 5;
//            System.out.println(result);
//        }; //함수로 구현함
//        fi.method(10); // 일회용으로 한번 만들어서 사용함.

        MyFuncInterface2 fi2 = (x, y) -> x < y ? x : y; //구현부가 한줄인 경우 {}생략 가능, return생략
        System.out.println(fi2.min(3,4));
    }
}
