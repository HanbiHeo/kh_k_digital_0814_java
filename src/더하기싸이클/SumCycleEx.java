package 더하기싸이클;
//230822_8_test

import java.util.Scanner;

// 입력받은 수를 더하기 싸이클 조건을 수행하고 몇 회만에 원래 입력한 수와 같아지는지 확인하는 문제
//입력 : 26, 2와 6으로 분리해서 더함 -> 8
//원래값이 1의 자리와 새롭게 만들어진 수와 1의 자리를 다시 더함 -> 68
// 68이 처음 입력받은 수와 같은지 확인
// --------1싸이클 ----------
//6과 8을 다시 분리해서 더함 -> 14
//8과 4 더함 ->12
//처음 입력값과 비교
// --------2싸이클 ----------
//4와 2 더함 ->6
//26 -> 처음값과 비교. 같음.

public class SumCycleEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("입력 : ");
        int input = sc.nextInt(); //최초 숫자 입력받음
        int totalCnt = 0; // 총 싸이클 횟수
        int calcNum = input; // 계산하기 위해 복사. 최초 입력값이 변경되지 않도록 하기 위해서 input복사
        int divSum = 0; //수를 10의 자리와 1의 자리로 분리해서 더하기 위한 변수
        int newNum = 0; //새롭게 만들어진 수
        while (true){
            totalCnt++;
            divSum = (calcNum / 10)/*앞의 숫자*/ + (calcNum % 10); //10자리와 1의 자리 분리해서 더함
            newNum = ((calcNum % 10) * 10) + (divSum % 10); // 앞의 1의 자리 숫자 + 계산된 값의 1의자리
            if(newNum == input) break;
            calcNum = newNum; // 아니면 2번째 싸이클
        }
        System.out.println(totalCnt);
    }
}
