package List인터페이스;

import java.util.*;

//0830
// 리스트 인터페이스는 ArrayList, LinkedList, Vector 의 부모로 인터페이스로 구현되어 있음.
// 리스트 구조는 배열과 유사하고 차이점은 동적으로 크기가 변한다
// ArrayList, Linked List, Vector 는 거의 동ㅇ일한 메소드를 가지고 있어 코드 변환이 자유로움
// ArrayList : 리스트 타입의 대표적인 자료 구조(특별한 경우가 아니면 ArrayList 사용. 대부분의 경우 성능이 제일 좋음)
// - 검색이 빈번한 경우 효율적이며, 맨 뒤에 입력이 일어나느 경우에는 효과적임
public class ListEx1 {
    public static void main(String[] args) {
        String[] arr = {"150", "250", "350", "10", "9999", "456"}; // 이미 만들어진 문자열
        //Array.asList(arr) : 이미 만들어진 배열을 ArrayList에 추가
        List<String> list = new ArrayList<>(Arrays.asList(arr)); // 리스트에 문자열을 넣어줌
        list.add("100"); // List에 값을 추가 (add())
        list.add("200");
        list.add("300");
        System.out.println(list);
        System.out.println(list.get(0));
        //특정 위치에 값을 가져올 때 : get(index)를 붙이면 됨.
        System.out.println(list.get(2));
        // List 의 크기를 가져올 때 : size()
        System.out.println(list.size());
        //List 내 해당하는 항목이 있는지 판별
        System.out.println("포함여부 확인 : " + list.contains("142")); // 포함여부가 있으면 true 없으면 false
        //remove(객체) : List 내 객체에 해당하는 항목을 삭제하고 그 결과를 반환
        System.out.println("삭제 성공여부 확인 : " + list.remove("100"));
        //remove(인덱스) : 해당하는 값을 삭제하고 삭제된 값을 반환
        System.out.println("삭제 성공여부 확인 : " + list.remove(2));


        //정렬하기
        list.sort(Comparator.naturalOrder()); //자연스러운 순서 : 오름차순으로 정렬
//        list.sort(Comparator.reverseOrder()); //내림차순으로 정렬
        System.out.println(list);
    }
}
