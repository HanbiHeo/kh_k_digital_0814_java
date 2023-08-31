package 컴페어러블;

import java.util.TreeSet;

//0831
//Comparable과 Comparator는 클래스에 대한 정렬을 구현 할 수 있도록 해주는 인터페이스이다.
public class ComparableEx {
    public static void main(String[] args) {
        TreeSet<CarComp> list = new TreeSet<>();
        list.add(new CarComp("Santafe", 2016, "white"));
        list.add(new CarComp("Sorento", 2021, "black"));
        list.add(new CarComp("Granduar", 2018, "silver"));
        list.add(new CarComp("Kona", 2021, "Ivory"));
        list.add(new CarComp("Seltos", 2021, "PearWhite"));

        for(CarComp e : list) {
            System.out.println("자동차 명 : " + e.modelName);
            System.out.println("연식 : " + e.modelYear);
            System.out.println("색상 : " + e.color);
            System.out.println("-".repeat(30));
        }
    }
}
