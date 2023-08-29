package Math클래스;

import java.util.Random;

//0829
// Math 클래스는 수학에서 자주 사용하는 상수들과 함수를 미리 구현해 놓은 클래스
// Math 클래스의 모든 메소드는 Static 이므로 객체생성없이 바로 사용 가능
// java.lang 패키지에 포함되어있어 import가 필요없다.
// random() 이라는 메소드는 0.1 ~ 1 미만의 임의의 더블형 값을 반환한다.
public class MathClass {
    public static void main(String[] args) {
        System.out.println((int)Math.random() * 100); //0~99 int를 붙임으로서 소수점 날림.

// ceil() : 소수점이하가 있으면 무조건 올림
        System.out.println(Math.ceil(10.0));
        System.out.println(Math.ceil(10.1));
        System.out.println(Math.ceil(10.00000001));
// floor() : 소수점 이하를 무조건 날림
        System.out.println(Math.floor(10.0));
        System.out.println(Math.floor(10.9));
        System.out.println(Math.floor(10.00000001));
// round() : 반올림, 소수점 첫째자리에서 반올림
        System.out.println(Math.round(10.0));
        System.out.println(Math.round(10.4999));
        System.out.println(Math.round(10.5));
// max()와 min() 두 값중 큰 값과 작은값 찾아줌
        int x = 10;
        int y = 20;
        System.out.println(Math.max(x, y));
        System.out.println(Math.min(x, y));
    }
}
