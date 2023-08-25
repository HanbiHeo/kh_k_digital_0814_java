package 인터페이스코코아톡;

public interface NetAdapter {
    void connect();
    void send(String msg);
}

class WIFI implements NetAdapter {
    @Override
    public void connect(){
        System.out.println("WIFI에 연결되었습니다.");
    }

    @Override
    public void send(String msg) {
        System.out.println("WIFI >> " + msg);
    }
}
class FIveG implements NetAdapter {
    @Override
    public void connect(){
        System.out.println("FIveG에 연결되었습니다.");
    }

    @Override
    public void send(String msg) {
        System.out.println("FIveG >> " + msg);
    }
}

