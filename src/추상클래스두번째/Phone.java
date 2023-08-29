package 추상클래스두번째;
//phone은 객체화 될 수 없음. (=인스턴스 화 될 수 없음.)
public abstract class Phone { // 추상클래스는 객체가 될 수 없다
    public String name;
    public boolean isPower;
    public Phone(String name) {
        this.name = name;
    }
    public void setPower(boolean isPower) {
        this.isPower = isPower;
        if(isPower) System.out.println("Phone Power ON");
        else System.out.println("Phone Power OFF");
    }
    abstract void call();
}
