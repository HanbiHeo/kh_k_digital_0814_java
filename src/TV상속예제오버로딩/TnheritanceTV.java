package TV상속예제오버로딩;
//0824_1
//이전에 만들었던 TV에서 상속관계를 적용하고 오버라이딩의 이점을 확인
public class TnheritanceTV {
    public static void main(String[] args) {
        PrototypeTV prototypeTV = new ProductTV(); // 상속을 주는 클래스가 인스턴스화 된다는 의미는 추상화가 아니라는 의미
        ProductTV smartTV = new ProductTV("HomeTV");
        smartTV.setPower(true);
        smartTV.setVolume(120);
        smartTV.setChannel(1500, false);
        smartTV.viewTV();
    }
}
