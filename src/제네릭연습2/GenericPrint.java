package 제네릭연습2;

public class GenericPrint <T> {
    private T material; // T 자료형으로 변수 선언. 제네릭타입으로 받아서 데이터타입 결정 안된상태.
    public void setMaterial(T material) {
        this.material = material;
    }
    public T getMaterial() {//반환타입이 T
        return material;
    }
    public String toString() {
        return material.toString();
    }
}

class Powder {
    public void doPrinting() {
        System.out.println("Powder 재료로 출력합니다.");
    }
    public String toString() {
        return "재료는 파우더 입니다.";
    }
}
class Plastic {
    public void doPrinting() {
        System.out.println("Plastic 재료로 출력합니다.");
    }
    public String toString() {
        return "재료는 플라스틱 입니다.";
    }
}
