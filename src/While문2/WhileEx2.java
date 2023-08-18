package While문2;

import java.util.Scanner;

//2023/08/18 _2
// while :반복 횟수를 알 수 없는 경우
// do while: 한번은 수행하고 조건을 물어 봄
public class WhileEx2 {
    public static void main(String[] args) {
        int age; //나이를 입력받는 경우
//        Scanner sc = new Scanner(System.in);
//        while (true) { //무한의 횟수를 반복하기 위해 조건식을 참으로 만듦 (반드시 탈출문이 필요함)
//            System.out.print("나이를 입력 하세요 : ");
//            age = sc.nextInt(); //나이 입력을 안주면 프로그램이 멈춤
//            if(age > 0 && age < 200) break; //1~199살 사이만 정상적으로 입력된 나이로 간주
//            System.out.println("나이를 잘 못 입력 하셨습니다.");
//        }


        //do while
        do {
            System.out.print("나이를 입력 하세요. : ");
            Scanner sc = new Scanner(System.in);
                    age = sc.nextInt();
        } while(age <=0 || age >= 200);

        System.out.println("입력하신 나이는" + age + "입니다");
    }
}
