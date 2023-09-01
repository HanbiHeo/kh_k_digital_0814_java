package 쓰레드예제4;

import static java.lang.Thread.sleep;

//0901
//쓰레드를 안전하게 종료하는 방법
public class ThreadMainEx4 {
    public static void main(String[] args) throws InterruptedException {
        RunThread runThread = new RunThread();
        runThread.start();
        try {
            sleep(3000);
        } catch (InterruptedException e) {
        }
        runThread.interrupt();
    }
}

    //코딩으로 구현하는 방법!! sleep을 안넣어도 됨.
    class RunThread extends Thread {
//        private boolean stop = false; // stop플래그 설정
//
//        public void setStop(boolean stop) {
//            this.stop = stop;
//        }

        @Override
        public void run() {
            try {
                while (true) { // stop이 들어오지 않으면 계속 돈다.
                    System.out.println("Thread 실행중 ............");
                    sleep(1);
                }
            } catch (InterruptedException e) {
                System.out.println("!!인터럽트 발생!!");
            }
            System.out.println("자원 정리중........................");
            System.out.println("!!실행종료!!");
        }
    }

