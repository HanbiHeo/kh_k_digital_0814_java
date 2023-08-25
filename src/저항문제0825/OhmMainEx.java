package 저항문제0825;
//230825
import java.util.Scanner;

//230825 색의 저항갑
//색의 값과 곱을 각, 첫째 둘째는 색은 값을 더하고. 마지막 색은 곱을 해야함
//1 세가지 색을 입력 받는다. 2첫번째, 두번째 입력된 색은 문자열로 더한다. 3마지막 색은 색의 곱만큼 곱한다.
//첫번째 컬러 문자열은 10의자리 수
//두번째 컬러 문자열은 1의 자리 수
//세번째 컬러 문자열은 곱하는 수
//화이트는 int가 아닌 long을 써야한다.
//형변환을 해야함..
public class OhmMainEx {
    public static void main(String[] args) {
        String[] color = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
        int frt = 0, sec = 0, thd = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("세가지 색상을 입력하시오 : ");
        String frtColor = sc.next();
        String secColor = sc.next();
        String thdColor = sc.next();
        for(int i = 0; i < color.length; i++) {
            if(frtColor.equals(color[i])) frt = i; // 첫번째 입력받은 컬러 문자열의 인덱스 값을 구함(10의자리)
            if(secColor.equals(color[i])) sec = i; // 두번째 입력받은 컬러 문자열의 인덱스 값을 구함(1의자리)
            if(thdColor.equals(color[i])) thd = i; // 세번째 입력받은 컬러 문자열의 인덱스 값을 구함 (곱하는 수)
        }
        System.out.println((long)((frt * 10) + sec) * (long)(Math.pow(10, thd)));
    }
}
