package 주소번호판만들기코테0824;
//0824_6
import java.util.Scanner;

//1<= adr <=9999
//변수, 숫자+1
//1+ adr = 길이 (adr + 1)
// 1= 2 |  2~9=3 |  0=4

//숫자를 str으로 입력받아 int 대입
//해당 숫자가 몇칸으 차지하는지 출력
//0을 입력하면 종료.
public class AddressMake {
    public static void main(String[] args) {
        //각각 숫자가 차지하는 자리수를 먼저 배열로 만듦!!
        int[] numSize = {4, 2, 3, 3, 3, 3, 3, 3, 3, 3}; // 숫자의 길이 !!
        int sum = 0; //입력받은 숫자가 차지하는 총 자리수
        Scanner sc = new Scanner(System.in);
        while(true) {
            String number = sc.next();
            if(number.equals("0")) break;
            for(int i = 0; i < number.length(); i++) {
                sum += numSize[number.charAt(i) - '0'] + 1; // 뒤에 1을 더하는 이유는 각 숫자마다 중간에 공백을 한칸씩 필요로 해서
            }
            System.out.println(sum + 1); // 1을 더하는 이유는 처음 공백을 더해주기 위해
            sum = 0; //다음 계산을 위해 sum 변수를 초기화 함
        }
    }
}
