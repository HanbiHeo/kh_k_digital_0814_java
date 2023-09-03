package 쓰레드예제5;

import static java.lang.Thread.sleep;

//0901
//데몬쓰레드 : 다른 쓰레드의 작읍을 돕는 보조 쓰레드. 데몬쓰레드 이외의 쓰레드가 모두 종료되면 자동종료되는 특징을 가짐.
//자동저장 하는 내용의 쓰레드 만들기. 백그라운드 버전.
public class ThreadMainEx5 {
    public static void main(String[] args) throws InterruptedException {
        AutoSaveTh autoSaveTh = new AutoSaveTh();
        autoSaveTh.setDaemon(true); // 데몬스레드를 만드는 방법 : 다른 쓰레드가 종료되면 같이 종료
        autoSaveTh.start();
        sleep(30000);
    }
}

class AutoSaveTh extends Thread {
    public void save(){
        System.out.println("작업내용을 저장합니다.");
    }
    @Override
    public void run() {
        while (true) {
            try {
                sleep(3000);
            } catch (InterruptedException e) {}
            save();
        }
    }
}
