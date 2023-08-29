package 추상클래스두번째;
//230825_ + 0829 (익명의 객체)
public class SmartMain {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone("Iphone Pro 14");
        smartPhone.setPower(true);
        smartPhone.internet();
        smartPhone.call();

        Phone phone = new Phone("목업") {
            @Override
            void call() {
                System.out.println("목업폰이라 통화가 되지 않습니다.");
            }
        };
        phone.call();
    }
}
