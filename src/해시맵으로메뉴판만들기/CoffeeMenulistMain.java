package 해시맵으로메뉴판만들기;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//0831
//HashMap으로 커피메뉴 리스트 만들기
public class CoffeeMenulistMain {
    //문자열로 만들어진 key와 객체(커피의 정보가 포함된)를 값으로 사용
    static Map<String, MenuInfo> map = new HashMap<>(); // 해당하는 모든 메뉴에 대한 값을 가져올 수 있음.
    public static void main(String[] args) {
        makeMenu(); // 불러줌
        seletMenu(); // 불러줌
    }
    static void makeMenu(){
        map.put("Americano", new MenuInfo("Americano", 2500, "Coffee", "기본 커피")); // key 와 value 값을 사용.
        map.put("Espresso", new MenuInfo("Espresso", 2500, "Coffee", "샷 커피")); // key 와 value 값을 사용.
        map.put("Latte", new MenuInfo("Latte", 4000, "Coffee", "우유가 포함된 커피")); // key 와 value 값을 사용.
    }
    static void seletMenu() {
        Scanner sc = new Scanner(System.in);
        String key = ""; //키를 받기 위한 문자열 변수. 초기화
        while (true) {
            System.out.println("=".repeat(10) + "Menu List" + "=".repeat(10));
            System.out.print("[1] 메뉴 보기 [2] 메뉴 조회 [3] 메뉴 추가 [4] 메뉴 삭제 [5] 메뉴 수정 [6]종료 : ");
            int selMenu = sc.nextInt();
            switch (selMenu) {
                case 1:
                    System.out.println("=".repeat(10) + "메뉴 보기" + "=".repeat(10));
                    for(String e : map.keySet()) {
                        System.out.println("메뉴 : " + map.get(e).name);
                        System.out.println("가격 : " + map.get(e).price);
                        System.out.println("분류 : " + map.get(e).category);
                        System.out.println("설명 : " + map.get(e).description);
                        System.out.println("-".repeat(42));
                    }
                    break;

                case 2:
                    System.out.print("조회할 메뉴를 입력하세요 : ");
                    key = sc.next();
                    //포함여부 확인하는 메소드는 containsKey(Key) : 맵 내의 해당 키가 있는지 확인하여 결과를 반환
                    if(map.containsKey(key)){ // map에 입력된key값이 있는지 확인
                        System.out.println("메뉴 : " + map.get(key).name);
                        System.out.println("가격 : " + map.get(key).price);
                        System.out.println("분류 : " + map.get(key).category);
                        System.out.println("설명 : " + map.get(key).description);
                    }   else System.out.println("해당메뉴가 존재하지 않습니다");
                    break;

                case 3: // 추가는 할 수 있으나 map에서는 순서 보장 안됨.
                    System.out.print("추가할 메뉴를 입력하세요 : ");
                    key = sc.next();
                    if(map.containsKey(key)) { // 이미 있는값은 추가가 아닌 수정
                        System.out.println("해당 메뉴가 이미 존재 합니다.");
                    } else { // 아니면 신규메뉴니 추가
                        System.out.print("가격 입력 :");
                        int price = sc.nextInt();
                        System.out.print("분류입력 : ");
                        String category = sc.next();
                        sc.nextLine();
                        System.out.print("설명입력 : ");
                        String description = sc.nextLine();
                        map.put(key, new MenuInfo(key, price, category, description));
                    }
                    break;
                case 4:
                    System.out.print("삭제할 메뉴를 입력하세요 : ");
                    key = sc.next();
                    if(map.containsKey(key)) {
                        map.remove((key));
                        System.out.println(key + "메뉴를 삭제하였습니다.");
                    } else {
                        System.out.println("입력하신 메뉴가 없습니다.");
                    }
                    break;
                case 5:
                    System.out.print("수정할 메뉴를 입력하세요 : ");
                    key = sc.next();
                    if(map.containsKey(key)) { // 같은 키 값이면
                        System.out.print("가격 입력 :");
                        int price = sc.nextInt();
                        System.out.print("분류입력 : ");
                        String category = sc.next();
                        sc.nextLine();
                        System.out.print("설명입력 : ");
                        String description = sc.nextLine();
                        //key값은 동일하고 값이 변경되는 경우에 replace() 사용.
                        map.replace(key, new MenuInfo(key, price, category, description));
                    } else {
                        System.out.println("수정할 메뉴가 없습니다.");
                    }
                    break;
                case 6:
                    System.out.println("메뉴를 종료합니다.");
                    System.exit(0); // return 대신 강제종료 써도 됨.
                default: System.out.println("선택하신 메뉴가 없습니다.");
            }
        }
    }
}
