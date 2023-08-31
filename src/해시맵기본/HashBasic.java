package 해시맵기본;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashBasic {
    public static void main(String[] args) {
        // Key, value
        Map<String, Integer> map = new HashMap<>();

        //객체저장 (key, value)
        map.put("우영우", 99);
        map.put("동그라미", 55);
        map.put("최수연", 85);
        map.put("이준호", 75);
        map.put("동그라미", 65); // key가 같기 때문에 나중에 저장된 값으로 대체. 값은 중복허용함, key는 중복허용 안함. = key값은 set(집합// )
        System.out.println("총 Entry 수 : " + map.size()); // 중복이라 하나는 삭제.

        //객체찾기 get(key) : 지정된 key에 대한 값을 반환함.
        System.out.println(map.get("동그라미"));
        System.out.println();

        //향상된 for(자료형 배열)문으로 map 순회 (map의 key값으로 순회)
        for(String key : map.keySet()) { //keySet() 이라는 메소드는 key가 포함된 Set컬렉션으로 반환
            System.out.println(key + "\t" + map.get(key));
        }

        //interator(반복자)를 사용하는 방법도 있음. (책에 나옴. 옛날문법)
        Set<String> keySet = map.keySet();
        Iterator<String> iterator = keySet.iterator(); //키셋의 반복자를 찾아냄
        System.out.println();
        while (iterator.hasNext()) {
            String key = iterator.next();
            Integer value = map.get(key);
            System.out.println(key + "\t" + value);
        }

        //객체삭제 key값으로 해당 Entry를 삭제
        map.remove("최수연");
        System.out.println();
        for(String key : map.keySet()) {
            System.out.println(key + "\t" + map.get(key));
        }

        //
    }
}
