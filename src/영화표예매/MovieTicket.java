package 영화표예매;

import java.util.Scanner;

public class MovieTicket {
    int seat[] = new int[10];    //좌석의 개수 정하기 / 인스턴스 필드
    int ticketPrice;
    MovieTicket(int price) {
        ticketPrice = price;
    }
    // 판매된 좌석의 개수를 확인. 총 판매금액을 구해서 반환
    int totalAmount() {
        int cnt = 0; // 지역변수
        for(int val : seat) { // val이라는 변수는 seat 배열을 처음부터 마지막까지 순화하는 요소
            if(val == 1) cnt++; //val이 1이면 판매된 좌석이라는 의미
        }
        return cnt * ticketPrice; // 반환값이 int형
    }
    void printSeat() { // 선택가능한 좌석의 목록을 보여주는 부분
        for (int s : seat) {
            if (s == 0)/*판매가 안되었다는 말*/ System.out.print("[    ]"/*판매가 안되면 공백*/);
            else System.out.print("[ V ]"); // 판매가 된 좌석을 의미
        }
        System.out.println();
    }

    //좌석을 판매하는 경우
    void selectSeat() {
        printSeat(); // 좌석의 상태를 보여주는 메소드 호출
        Scanner sc = new Scanner(System.in);
        System.out.print("좌석을 선택 하세요 : ");
        int selSeat = sc.nextInt(); // 사용자가 선택한 좌석을 입력 받음(사용자는 1부터 생각함 ; 맨 앞의 좌석을 0이라고 생각하지 않음)
        if(seat[selSeat-1] == 0)  { /*사용자는 1부터 인식하기 때문에 -1 해주어야함*/
            seat[selSeat-1] = 1; // 판매가 안된 좌석이기 때문에 판매 함
            printSeat(); // 판매 이후에 좌석 상태를 다시 보여줌
        }else System.out.println("이미 예약된 좌석 입니다. 다른 좌석을 선택 하세요.");
    }
}
