package 영화표예매;
import java.util.Scanner;
//23.08.23_1
//사용자 극장의 좌석을 선택, 판매된 좌석을 개수만큼 판매 금액을 계산
// 1. 예매하기와 종료하기 메뉴 만들기 (종료하기를 선택시 총 판매금액을 계산함)
// 2. 극장의 좌석은 10개
// 3. 각 좌석당 금액은 12,000원
public class MovieMain {
    public static void main(String[] args) {
        MovieTicket ticket = new MovieTicket(13000); //생성자를 추가함, 좌석당 가격을 정할 수 있음.
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("[1] 예매하기");
            System.out.println("[2] 종료하기");
            System.out.print("  :  ");
            if(sc.nextInt() == 1) ticket.selectSeat(); // 사용자가 좌석을 입력함. == 사용자가 1을 입력 하면,
            else {
                System.out.println("총 판매 금액 : " + ticket.totalAmount());
                break;
            }
        }
    }
}
