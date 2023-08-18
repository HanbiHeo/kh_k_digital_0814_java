package Seven배수구하기;

import java.util.Scanner;

//08.18_5
//1 ~ 1000사이의 7의 배수를 구하고 한줄에 10개 항목씩 출력 하기
public class MultipleEx1 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        //첫시도
//        for(int i = 0; i < 10; i++) {
//            System.out.print();
//            for (){
//            }
//        }

        // 1.
//        for(int i = 1; i <= 1000; i++) {
//            if(i % 7 == 0) {
//                System.out.printf("%5d", i);
//                if(i % 70 == 0) System.out.println();
//            }
//        }

        //2. 수행속도는 위에것보다 빠름(불편항 수행코드를 줄이는것도 중요함)
        int cnt = 0;
        for(int i = 7; i <= 1000; i+=7) { //반복횟수 줄이기
            cnt++;
            System.out.printf("%5d", i);
            if(cnt == 10) {
                System.out.println();
                cnt = 0;
            }
        }

    }
}
