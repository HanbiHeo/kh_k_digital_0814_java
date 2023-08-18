package 상근알람설정하기;
//08.18 예제
import java.util.Scanner;

//첫째 줄에 두 정수 H와 M이 주어진다. (0 ≤ H ≤ 23, 0 ≤ M ≤ 59) 그리고 이것은 현재 상근이가
//설정한 놓은 알람 시간 H시 M분을 의미한다.
//입력 시간은 24시간 표현을 사용한다. 24시간 표현에서 하루의 시작은 0:0(자정)이고,
//끝은 23:59(다음날 자정 1분 전)이다. 시간을 나타낼 때, 불필요한 0은 사용하지 않는다.
public class AlarmEx {
    public static void main(String[] args) {
        int H, M, Al;
        Scanner sc = new Scanner(System.in);
        System.out.println("시간을 입력 하시오 : ");
        H = sc.nextInt();
        M = sc.nextInt();
        //시간 * 60분 을 분으로
        Al = (H * 60) + M;
        // 시간과 분을 더하고
        if ( Al < 45 ) {
            Al = (24*60) + M;
        }
        Al -= 45;
        // 시간 나누고 나머지
        System.out.println((Al / 60) + " : " + (Al % 60));


//        //시간과 분을 입력 받기위한 스캐 생성
//        Scanner sc = new Scanner(System.in);
//        //시간과 분을 각각 입력받음
//        System.out.println("시를 입력 하시오(24시간) : ");
//        int H = sc.nextInt(); System.out.print( H+ "시");
//        System.out.println("분을 입력하시오 : ");
//        int M = sc.nextInt(); System.out.print(M + "분");
//        for(0 <= H <=23; 0 <= M <= 59) {
//            System.out.print(H + (M-45));
//        }



        // =========== 정답 ============
//                int hour, min, calc;
        //시간과 분을 입력 받기위한 스캐 생성
//                Scanner sc = new Scanner(System.in);
        //시간과 분을 각각 입력받음
//                System.out.print("시간 입력 : ");
//                hour = sc.nextInt();
//                min = sc.nextInt();
        //45분을 빼야함.45분을 빼야하니 시간과 분을 총 몇분인지 환산함
//                calc = (hour * 60) + min;
        // 계산된 시간이 00시 45분 보다 작으면 하루전날 하루의 시간만큼 더해줌
//                if (calc < 45) {
//                    calc = (24 * 60) + min;
//                }
        //계산된 시간에서 45 빼기
 //                calc -= 45;
        // 결과를 시간과 분으로 환산해서 출력해줌
//                System.out.printf("%d %d\n", (calc / 60), (calc % 60));

    }
}
