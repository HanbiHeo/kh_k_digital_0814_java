package 중첩인터페이스;

public class CallListener  implements Button.OnClickListener { // 클래스 버튼 내의 인터페이스 상속을 해야함
    @Override
    public void onClick() {
        System.out.println("전화를 겁니다. ");
    }
}