package While문;
//2023/08/18 _1
import java.util.Scanner;

// 주어진 조건이 참인 동안 해당 블록을 반복해서 수행함. 주로 반복횟수를 알 수 없거나 특정 조건이 충족될때까지
// 반복해야 하는 경우에 사용.
public class WhileEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력 하세요 : "); // 입력을 받기 위해 스캐너 생성
        int n = sc.nextInt();
        int sum = 0; // 초기화. 합계를 구한 변수를 초기화 지역변수는 범위{블럭} 안에서 자동 소멸

        //for 문 ; 초기식,조건식,증감식
        for(int i = 1; i <= n; i++) { // 세미콜론 들어가는 이유, 하나의 명령문이 끝날 때 알려줌. 여기서는 총 명령문 3개
            // (마지막 문에는 ; 안붙여도 됨)
            sum += i;
        }

        /*while 문
          while (n > 0) { // 조건식을 만족아면 계속 돌아간다. 0보다 큰 수가 오면 반복 수행
              sum += n; // sum = sum + n; 과 같다
              n--; //탈출조건. 없으면 무한루프. 입력 받은 값을 한번 돌 때 마다 1씩 감소시킴.
       }*/
        System.out.println("주어진 정수의 합 : " + sum);
    }
}
