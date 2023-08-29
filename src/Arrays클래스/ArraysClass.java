package Arrays클래스;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

//0829
//ArraysClass 는 배열을 다루기 위한 다양한 메소드를 포함하고 있음.
public class ArraysClass {
    public static void main(String[] args) {
//        int[] arr = {5, 3, 4, 7, 8, 9, 1, 2}; //값을 직접 넣을때는 new 라는 객체를 생성할 필요 없음. 컴파일러가 자동으로 몇개인지 알고있음.
//        Arrays.sort(arr); // 오름차순 정렬 퀵쇼트, 병합정렬이 가미된...
//        for(int e : arr) System.out.print(e + " ");

        Integer[] arr = {5, 3, 4, 7, 8, 9, 1, 2};
//        Arrays.sort(arr, Collections.reverseOrder());  // 내림차순 정렬
//        for(int e : arr) System.out.print(e + " ");

        //정렬 오버라이딩 : 재정의
//        Arrays.sort(arr, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                if(o1 > o2) return 1; //오름차순 정렬을 만들어줌. o는 배열의 값. o1, o2 값을 받아 앞에께 크면 순서를 바꿔달라는 명령
////                if(o1 < 02) return 1; //내림차순
//            }
//        };
    }
}
