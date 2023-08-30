package 홀짝정렬배열과어레이리스트;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OddEvenFunc {
//    int[] input = new int[7]; //입력이 7개로 제한
//    int[] even = new int[7];
//    int[] odd = new int[7];
//    int eIdx = 0; //짝수 배열 인덱스
//    int oIdx = 0; //홀수 배열 인덱스
    List<Integer> input = new ArrayList<>();
    List<Integer> even = new ArrayList<>();
    List<Integer> odd = new ArrayList<>();

    //7개의 정수 입력받아서 배열에 넣기
    public void inputFunc(){
        System.out.print("입력 : ");
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 7; i++) {
//            input[i] = sc.nextInt();
            input.add(sc.nextInt());
        }
    }
    public void oddEvenCalc(){
//        for (int i = 0; i < 7; i ++) {
//            if(input[i] % 2 == 0) even[eIdx++] = input[i];
//            else odd[oIdx++] = input[i];
//        }
        for(Integer e : input) {
            if(e % 2 == 0) even.add(e);
            else odd.add(e);
        }
    }
    public void oddEvenOutput(){
        System.out.print("홀수 : ");
//        for(int i = 0; i < oIdx; i++) {
//            System.out.printf("%2d", odd[i]);
//        }
        for(Integer e : odd) System.out.print(e + " ");
        System.out.println();
        System.out.print("짝수 : ");
        for(Integer e : even) System.out.print(e + " ");
//        for(int i = 0; i < eIdx; i++) {
//            System.out.printf("%2d", even[i]);
//        }
    }
}
