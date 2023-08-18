package 별찍기연습;

import java.util.Scanner;

//023.08.18_6 삼각형 별찍기
//입력받은 만큼 별찍기
//예 ) 5를 입력하면
/*
* *
* **
* ****
* *****
* ****** */
public class StarEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("별 개수를 입력하세요 : ");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < i+1; j++) {
                System.out.print("*   ");
            }
            System.out.println();
        }
    }
}
