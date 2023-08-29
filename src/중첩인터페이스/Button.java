package 중첩인터페이스;

public class Button { // button class 만들기
    OnClickListener listener; // 생성된 객체의 주소를 대입받기 위함. 인터페이스에 대한 참조변수
    
    void setOnClickListener(OnClickListener listener) {
        this.listener = listener;
    }
    
    void touch() {
        listener.onClick(); // 구현객체의 onClick()메소드 호출
    }
    
    //클래내부에서 인터페이스를 만듦 (중첩 인터페이스)
    interface  OnClickListener {
        void onClick();
    }
}
