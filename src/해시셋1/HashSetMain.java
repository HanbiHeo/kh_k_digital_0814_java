package 해시셋1;

import java.util.HashSet;

//0831
//중복허용하지 않음. 순서 보장하지 않음. 수학의 집합과 유사한 개념
public class HashSetMain {
    public static void main(String[] args) {
//        HashSet<String> set = new HashSet<>(Arrays.asList("H", "e", "l", "l", "o"));
//        System.out.println(set); //출력결과 :[e, H, l, o] = 중복허용하지 않음 + 순서보장을 하지 않음.
        HashSet<String> set = new HashSet<>();
        set.add("Java");
        set.add("C");
        set.add("C++");
        set.add("Python");
        set.add("Java"); // add 안됨.
        for(String e : set) System.out.println(e + " ");
    }
}
