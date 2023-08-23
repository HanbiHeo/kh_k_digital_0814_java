package 오버라이딩금지0823;

public class Car {
    int speed;
    String color;
    String name;
    final void accelerator() {
        System.out.println("차의 속도를 증가 시킵니다.");
    }
    final void breakPanel() {
        System.out.println("차의 속도를 감소 시킵니다.");
    }
}
class SportsCar extends Car {
    boolean isTurbo;
    SportsCar(String name) {
        isTurbo = false;
        speed = 280;
        this.name = name;
        this.color = "Red";
    }
//    @Override/*아래의 코드가 오버라이딩 되는게 맞는지 확인할 때 쓸 수 있음. 관례상 붙여주는게 좋음*/
//    void accelerator() {
//        super.accelerator();
//        System.out.println("차의 속도를 200% 증가시킵니다.");
//    }
//    void breakPanel() {
//        super.breakPanel(); /*super ; 부모를 부른다는 뜻*/
//        System.out.println("차의 속도를 200% 감소시킵니다.");
//    }
    int getSpeed() {
        if(isTurbo) return  speed *=1.2;
        return speed;
    }
    public boolean isTurbo() {
        return isTurbo;
    }
    public void setTurbo(boolean turbo) {
        isTurbo = turbo;
    }
    void infoCar() {
        System.out.println("name : " + name);
        System.out.println("speed : " + getSpeed());
        System.out.println("color : " + color);
        System.out.println("turbo mode : " + isTurbo);
    }

}
