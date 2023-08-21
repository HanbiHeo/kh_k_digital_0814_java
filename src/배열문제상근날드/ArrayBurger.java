package 배열문제상근날드;

import java.util.Scanner;

//08.21_8_test1
//가장 값 싼 세트메뉴 찾기
public class ArrayBurger {
    public static void main(String[] args) {
//        int[] b  =  {800, 700, 900};
//        int[] d = {198, 330};
//        int[] tmp = 0;
//        Scanner sc = new Scanner(System.in);
//        System.out.print("햄버거 값 입력 : ");
//        int bu = sc.nextInt();
//        System.out.print("음료수 값 입력 : ");
//        int dr = sc.nextInt();
//        int set = (bu + dr) - 50;
//        System.out.println("세트메뉴 : " + set);

        // 해설
        int[] menu = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.print("메뉴입력 : ");
        for(int i = 0; i < menu.length; i++)  menu[i] = sc.nextInt(); // 5개의 메뉴 입력받음
        int minBurger = menu[0]; //버거 시작값
        int minDrink = menu[3]; // 음료 시작값
        for(int i = 0; i < menu.length; i++) {
            if(i < 3 && minBurger > menu[i]) minBurger = menu[i]; //값의 최소값
            if(i > 2 && minDrink > menu[i]) minDrink = menu[i];
        }
        //햄버거 3개값 음료 2개값 연속으로 입력받음. 햄버거 중 가장 작은값 + 음료중 가장 작은값을 찾아야 함
        System.out.println(minBurger + minDrink - 50);
        //찾은 값 더하고 세트할인 -50 출력



    }
}
