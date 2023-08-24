package 접근제한자;

public class Parent {
    public String name;
    String money; // 디폴트(default)는 같은 패키지 내에 있어야 접근 허용.상속관계있더라도 같은 패키지 내 아니면 접근 제한됨.
    protected String addr;
    public Parent(){
        name = "Parent";
        money = "100억";
        addr = "서울시 강남구 역삼동";
    }

}

