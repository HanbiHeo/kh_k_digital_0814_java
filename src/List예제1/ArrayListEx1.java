package List예제1;

import java.util.ArrayList;
import java.util.List;

//0830
public class ArrayListEx1 {
    public static void main(String[] args) {
        //List 인터페이스의 참조변수로 ArrayList 객체를 참조함
        List<MenuInfo> menuInfoList = new ArrayList<>();
        //add는 값(객체)를 추가함. 추가할 때 마다 크기가 변함.
        MenuInfo menuInfo1 = new MenuInfo("Americano", 2500, "coffee", true);
        menuInfoList.add(menuInfo1); // 하나의 참조변수를 만들어서 집어넣어줌(위 두줄)
        menuInfoList.add(new MenuInfo("Latte", 4000, "coffee", true));
        menuInfoList.add(new MenuInfo("BlackTea", 4000, "tea", true));
        //향상된 for문 ; get index가 필요 없음 : 배열 또는 Colloection의 자식들만.
        for(MenuInfo menu : menuInfoList) {
            System.out.println(menu.getMenuInfo());
        }
        
        System.out.println();
        
        for(int i = 0; i < menuInfoList.size(); i++) {
            System.out.println(menuInfoList.get(i).getMenuInfo()); // get을 이용해 해당 인덱스를 가져오는 기존의 for문
        }
    }
}
class MenuInfo{
    String name;
    int price;
    String category;
    boolean isTax;

    public MenuInfo(String name, int price, String category, boolean isTax) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.isTax = isTax;
    }
    public String getMenuInfo() {
        return "{"+"\"name\":"+name+","+"\"price\":"+price+","+"\"isTax\":"+isTax+"}";
    }
}
