package 오버라이딩금지0823;
//23.08.23_7
//final 키워드를 사용해 메소드 오버라이딩을 금지 시킴
public class OverLimit {
    public static void main(String[] args) {
        class ElectricCar extends Car {
            boolean isAutoDrv;
            ElectricCar(String name) {
                isAutoDrv = false;
                speed = 200;
                this.name = name;
                color = "White";
            }
            public boolean isAutoDrv() {
                return isAutoDrv;
            }
            public void setAutoDrv(boolean autoDrv) {
                isAutoDrv = autoDrv;
            }
            void infoCar() {
                System.out.println("이름 : " + name);
                System.out.println("속도 : " + speed);
                System.out.println("색상 : " + color);
                System.out.println("자율주행 : " + isAutoDrv);

            }

        }
    }
}
