package 스위치문;

import java.util.Scanner;

//23.08.17_2
//조건에 조건식이 올 수 없고, 조건의 값이 와야함.
//조건 값에는 정수, 문자, 문자열이 올 수 있음. (실수는 못옴. 조건값은 명확해야함)
//장점은 if문에 비해서 가독성이 좋음. 성능이 약간 좋음. 조건문 중 if문이 제일 느리고 다음이 스위치, 삼항이 제일 빠름.
//단점은 조건식이나 범위가 올 수 없음.
//break는 사용시 유의해야함
public class SwitchEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("계절을 입력 하세요 : ");
        String season = sc.next();
        switch (season) {
            case "spring" :  // case에는 [ ; ]을 쓰지 않음.
            case "SPRING" :
                System.out.println("꽃이 피는 봄이 왔어요.");
                break;
            case "summer" :
                System.out.println("무더운 여름 입니다..");
                break;
            case "fall" :
            case "autumn" :
                System.out.println("천고마비의 가을입니다.");
                break;
            case "winter" :
                System.out.println("**********아직 겨율이네요**********");
                break;
            default:
                System.out.println("계절을 잘못 입력하셨습니다.");

        }
    }
}
