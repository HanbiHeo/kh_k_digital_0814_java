package 해시맵으로메뉴판만들기;
//1.메뉴인포
public class MenuInfo {
    String name; //커피메뉴 이름
    int price; // 가격
    String category; // 분류
    String description; // 메뉴설명

    public MenuInfo(String name, int price, String category, String description) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.description = description;
    }
}
