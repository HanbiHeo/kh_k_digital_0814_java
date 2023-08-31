package 컴페어레이터;

import java.util.TreeSet;

//0831
//두개의 메소드 비교하는것. 별도의 비교 클래스 새로 만들어줌.
public class ComparatorEx {
    public static void main(String[] args) {
        TreeSet<Fruit> set = new TreeSet<>(new DescendingComparator().reversed()); //descending 큰데서 작은순으로 정렬 뒤에 .reversed() 붇으면 반대정렬
        set.add(new Fruit("포도", 3000));
        set.add(new Fruit("수박", 10000));
        set.add(new Fruit("딸기", 6000));
        for(Fruit e : set) {
            System.out.println("과일 : " + e.name + ", 가격 : " + e.price);
        }
    }
}
