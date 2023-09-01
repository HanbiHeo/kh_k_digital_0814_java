package 쓰레드예제2;
//0901
import java.awt.*;
import static java.lang.Thread.sleep;
public class ThreadMainEx2 {
    public static void main(String[] args) throws InterruptedException {
        SumThread sumThread = new SumThread();
        sumThread.start(); //출력이 0으로 나옴.|
        try {
            sumThread.join(10); //sumThread가 작업을 완료할 때 까지 기다린다는 코드.
            //sum thread가 대가 걸리는게 아니라 main thread가 대기상태에 걸리는거임
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
//        sleep(2); // 스타트와 런 사이의 시간이 필요함.
        System.out.println("합 : " + sumThread.getSum());
    }
}
//        Toolkit toolkit = Toolkit.getDefaultToolkit();
//        for(int i = 0; i < 10; i++) {
//            toolkit.beep();
//            try {
//                sleep(3000); //3초마다 beep음 넣어줌.
//            } catch (InterruptedException ignored) {
//            }
//        }

        //다른 쓰레드의 종료를 기다림(join())
        class SumThread extends Thread {
            private long sum;

            public long getSum() {
                return sum;
            }

            public void setSum(long sum) {
                this.sum = sum;
            }

            @Override
            public void run() {
                for (int i = 0; i <= 230000000; i++) {
                    sum += 1;
                }
            }
        }
