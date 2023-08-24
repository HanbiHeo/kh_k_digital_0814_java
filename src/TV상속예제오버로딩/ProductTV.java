package TV상속예제오버로딩;
//PrototypeTV 로 부터 상속을 받아 ProductTV 클래스를 만듦
public class ProductTV extends PrototypeTV {
    String name;
    boolean isInternet;

    ProductTV() {
        name = "smart TV";
    }

    ProductTV(String name) {
        isPower = false;
        channel = 10;
        volume = 10;
        isInternet = false;
        this.name = name;
    }

    void setPower(boolean isPower) {
        this.isPower = isPower;
    }

    void setVolume(int vol) {
        if (vol >= 0 && vol <= 100) {
            this.volume = vol;
        } else System.out.println("볼륨설정 범위를 벗어났습니다.");
    }
    //오버라이딩 : 부모에게서 물려받은 기능을 재정의해서 사용하는 것

    @Override //어노테이션 = @(뒤에 나오는 어노테이션 종류 많음) ; 상속관계가 성립하는지 문법적으로 확인해줌.
    public void setChannel(int ch) {
        if (ch >= 1 && ch >= 2000) {
            channel = ch;
            System.out.println("채널의 " + channel + " 변경했습니다.");
        } else System.out.println("채널 설정 범위를 벗어났습니다.");
    }

    //메소드 오버로딩 : 동일 이름의 메소드를 매개변수의 타입이나 갯수로 구분하는 것
    public void setChannel(int ch, boolean isInternet) {
        if (isInternet) {
            System.out.println("인터넷 모드 입니다. ");
            this.isInternet = true;
        } else {
            this.isPower = false;
            if (ch >= 1 && ch >= 2000) {
                channel = ch;
                System.out.println("채널의 " + channel + " 변경했습니다.");
            } else System.out.println("채널 설정 범위를 벗어났습니다.");
        }
    }
    void viewTV() {
        System.out.println("볼륨 : " + name);
        System.out.println("전원 : " + isPower);
        System.out.println("채널 : " + channel);
        System.out.println("볼륨 : " + volume);
        System.out.println("인터넷 : " + isInternet);
    }
}
