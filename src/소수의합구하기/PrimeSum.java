package 소수의합구하기;

import java.util.Scanner;

//230822_6_test
//입력받은 정수보다 미만의 소수의 합을 구하는 함수를 만드세요
//예 ) 12이면 2+3+5+11=28
//1과 자기자신 이외의 자연수로 나누어지지않는 수
public class PrimeSum {
    public static void main(String[] args) {
//         //정수 입력받기
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        int n = sc.nextInt();
        int sum = 0;
        //입력받은 정수 미만의 소수를 찾기위해 반복적으로 prime()메소드를 호출
        for(int i = 2; i < n; i++) sum += prime(i); // 2에서 입력받은 정수 미만 중 소수만 누적
        System.out.println(sum);
        
        //입력받은 수 미만의 소수 찾기
        
//        //소수인지 판별하기
//        int sum = 0;
//        for (int num = 2; num < n; num++){
//            if (isPrime(num)) {
//                sum += num;
//            }
//        }
//        //합 출력하기
//        System.out.println("정수의 소수 합 : " + sum);
    }
    
    static int prime(int n) {
        boolean isPrime = true;
        for(int i = 2; i < n; i++) {
            if(n % i == 0) isPrime = false;
        }
        if(isPrime) return n; // 소수인 경우 매개변수로 전달된 값을 반환
        else return 0;
    }
}
