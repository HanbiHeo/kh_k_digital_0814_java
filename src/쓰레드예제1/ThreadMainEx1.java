package 쓰레드예제1;
//0901
//하나의 프로그램 내에서 여러가지 일을 동시에 수행하는 것.
public class ThreadMainEx1 {
    public static void main(String[] args) {
        //Thread 클래스를 상속받아서 Thread생성
        Thread testTh = new CoustomThread();
        testTh.start(); //스타트 됨. run()을 직접 부르면 안됨. start() 해달라고 요청하는것.
//        System.out.println("Main에서 찍어봅니다.");

        //Runnable인터페이스를 상속받아서 쓰레드를 만드는 방법
        Runnable runTh = new InterThread(); //실제 작업 내용을 가지고 있으나 인터페이스 상속을 받았기 때문에 실제 쓰레드 객체는 아님. 때문에 실제 쓰레드 생성해주어야함.
        Thread runTh1 = new Thread(runTh); // 쓰레드 만드는 과정을 한번 더하고 인터페이스 넣어주고
        Thread runTh2 = new Thread(runTh);
        runTh1.start();//스타트 해주어야함.
        runTh2.start();

        //익명의 객체로 쓰레드를 만드는 방법. 쓰레드는 익명의 객체로 자주 사용됨.
//        Runnable task = new Runnable() {
//            //러너블 인터페이스를 상속받아 실제 구현부를 만들어 주어야 함. 인터페이스는 추상화가 걸려있기때문에. 함수처럼 호출을 해주어야함.
//            @Override
//            public void run() {
//                int sum = 0;
//                for (int i = 0; i <= 10; i++) {
//                    sum += i;
//                    System.out.println("인터페이스의 " + sum);
//                }
//                System.out.println(Thread.currentThread() + "합 : " + sum);
//            }
//        };
//        Thread anonyTh1 = new Thread(task);
//        anonyTh1.start();


        //람다식으로 만들기
        Runnable task2 = () -> {
            int sum = 0;
            for (int i = 0; i <= 10; i++) {
                sum += i;
                System.out.println("인터페이스의 " + sum);
            }
            System.out.println(Thread.currentThread() + "합 : " + sum);
        };
        Thread anonyTh1 = new Thread(task2);
        anonyTh1.start();
    }
}
//상속받아서 쓰레드를 만드는 방법
class CoustomThread extends Thread {
    @Override
    public void run() {
        int sum = 0;
        for(int i = 0; i <= 10; i++) {
            sum += i;
            System.out.println("상속받은 쓰레드  " + sum);
        }
        System.out.println(Thread.currentThread() + "합 : " +sum);
    }
}

//러너블 상속받아 인터페이스 만듦
class  InterThread implements Runnable {

    @Override
    public void run() {
        int sum = 0;
        for (int i = 0; i <= 10; i++) {
            sum += i;
            System.out.println("인터페이스의 " + sum);
        }
        System.out.println(Thread.currentThread() + "합 : " + sum);
        //누가 먼저 돌아갈지는 보장 안됨.
    }
}
