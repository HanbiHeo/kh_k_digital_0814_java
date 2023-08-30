package X보다작은수ArrayList;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//0830
//정수 n개로 이루어진 arrayList에서 X가 주어질 때 X보다 작은 수를 모두 출력하는 프로그램
//첫줄에 N, X가 주어짐
//10 5
// 1 10 4 9 2 3 8 5 7 6
// 결과 : 1 4 2 3
public class LessThenX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        System.out.println("정수 입력 : ");
        int n = sc.nextInt(); // 배열 갯수
        int x = sc.nextInt(); //크기를 비교하는 기준 값(미만값을 찾음)
        for(int i = 0; i < n; i++) {
            list.add(sc.nextInt()); // 입력받은값이 add로 인해 들어감. 대입이 아니라 list에 값을 집어넣어줌.
            if(list.get(i) < x) System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
}
