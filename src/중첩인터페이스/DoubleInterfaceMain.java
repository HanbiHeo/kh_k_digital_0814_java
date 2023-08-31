package 중첩인터페이스;
//0829
//중첩인터페이스는 클래스 내부에 선언한 인터페이스 입니다.
//중첩인터페이스는 주로 UI프로그래밍에서 이벤트 처리를 목적으로 사용
public class DoubleInterfaceMain {
    public static void main(String[] args) {
        Button btn = new Button();
        btn.setOnClickListener(new CallListener());
        btn.touch();
        btn.setOnClickListener(new MessageListener());
        btn.touch();
    }
}
