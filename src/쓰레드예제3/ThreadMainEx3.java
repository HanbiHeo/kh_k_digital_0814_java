package 쓰레드예제3;
// 0901
// 쓰레드간의 협업 : wait(), notify(), notifyAll()
// notify() : 일시정지 상태에 있는 스레드를 실행 대기상태로 변경
// wait() : 자신을 일시정지 상태로 만드는 것
public class ThreadMainEx3 {
    public static void main(String[] args) {
        WorkObject sharedObject = new WorkObject(); //객체생성
        Thread threadA = new ThreadA(sharedObject);
        Thread threadB = new ThreadB(sharedObject);
        threadA.start();
        threadB.start();
    }
}

class  WorkObject {
    //synchronized : 멀티 쓰레드 환경에서 임계영역으로의 접근을 방지하는 역할(Lock / Unlock) .  해당 스레드 작업중일 때 잠간 멈추는 역할. synchronized 빼면 죽어버림.
    public synchronized void methodA() {
        System.out.println("Thread의 methodA() 작업 실행");
        notify(); // 일시정지 상태(잠들어있는 상태)에 있는  ThreadB를 실행대기 상태로 만듦
        try {
            wait(); // 실행대기 상태로 변경
        } catch(InterruptedException e){}
    }
    public synchronized void methodB() {
        System.out.println("Thread의 methodB() 작업 실행");
        notify(); // 일시정지 상태(잠들어있는 상태)에 있는 ThreadA를 실행대기 상태로 만듦
        try {
            wait(); // 실행대기 상태로 변경
        } catch(InterruptedException e){}
    }
}

class ThreadA extends Thread {
    private final WorkObject workObject;
    public ThreadA(WorkObject workObject) {
        this.workObject = workObject;
    }
    @Override
    public void run() {
        for(int i = 0; i < 10; i++) {
            workObject.methodA();
        }
    }
}

class ThreadB extends Thread {
    private final WorkObject workObject;
    public ThreadB(WorkObject workObject) {
        this.workObject = workObject;
    }
    @Override
    public void run() {
        for(int i = 0; i < 10; i++) {
            workObject.methodB();
        }
    }
}