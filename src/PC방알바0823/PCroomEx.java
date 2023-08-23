package PC방알바0823;
//23.08.23_8
import java.util.Scanner;

//23.08.23_7
//1번부터 100번까지의 컴퓨터
//안고싶은자리 입력
//몇번 거절당했는지 사람 수 체크 출력
public class PCroomEx {
    public static void main(String[] args) {
        int[] pcRoom = new int[100];
        int rejectCnt = 0, seatNum;
        Scanner sc = new Scanner(System.in);
        System.out.print("좌석 : ");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            seatNum = sc.nextInt();
            if(pcRoom[seatNum-1] == 1)rejectCnt++;
            else pcRoom[seatNum-1] = 1;
        }
        System.out.println(rejectCnt);
    }
}