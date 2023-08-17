package 시험성적;

import java.util.Scanner;

public class TestResult {
    public static void main(String[] args) {
        //1~100점.
        Scanner sc = new Scanner(System.in);
        System.out.println("성적을 입력하세요 : ");
        int score = sc.nextInt();
        System.out.print("성적 :");
        if (score > 0 || score <100) {
            if (score >=90) System.out.println("A");
            else if (score >=80) System.out.println("B");
            else if (score >=70)System.out.println("C");
            else if (score >=60)System.out.println("D");
            else System.out.println("F");

        }
    }
}
