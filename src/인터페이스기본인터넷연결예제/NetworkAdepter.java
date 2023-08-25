package 인터페이스기본인터넷연결예제;

public interface NetworkAdepter {
    void connect(); // 자동으로 앞에 public abstract 가 포함됨 (자동으로 완전 추상화가 걸림)
}
//유선 인터넷
class LAN implements NetworkAdepter{
    String company;
    LAN(String company) {
        this.company = company;
    }
    @Override
    public void connect() {//추상화가 아닌 실체가 있어야 하는 단계이기 때문에 abstract 붙으면 안됨.
        System.out.println(company + "의 LAN에 연결 되었습니다. ");
    }
}
class WIFI implements NetworkAdepter{
    String company;
    WIFI(String company) {
        this.company = company;
    }

    @Override
    public void connect() {
        System.out.println(company + "의 WIFI에 연결 되었습니다.");
    }
}

class FiveG implements NetworkAdepter{
    String company;
    FiveG(String company) {
        this.company = company;
    }

    @Override
    public void connect() {
        System.out.println(company + "의 5G에 연결 되었습니다.");
    }
}
