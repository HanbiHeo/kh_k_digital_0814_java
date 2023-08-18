package for반복문;
//2023.08.18_3
// for (초기식;조건식;증감식) (참인동안 수행되는 구분)
// 주로 정해진 횟수를 반복하는 경우에 사용됩니다.
public class ForEx {
    public static void main(String[] args) {

//        for(int i = 1; i <= 100; i++) {
//            System.out.printf("%4d", i); // 오른쪽 정렬 4개의 공간 (100의자리)
//            if(i % 10 == 0) System.out.println(); //1에서 100까지
//        }
        int i = 1;
        for(;;) {
            System.out.printf("%4d", i); // 오른쪽 정렬 4개의 공간 (100의자리)
            if(i % 10 == 0) System.out.println(); //1에서 100까지
            i++;
            if(i  > 100) break;
        } // 위의 예제와 같은 결과가 나오지만 복잡함.



//        int i =  1;
//        while(true) {
//            System.out.printf("%4d", i);
//            if(i % 10 == 0) System.out.println();
//            i++;
//            if(i > 100) break;
//        }
    }
}
