package 제네릭기본;
import java.util.ArrayList;
import java.util.List;

//0830
public class GenericBasic {
    public static void main(String[] args) {
        List list = new ArrayList(); // 강력한 타입 체크가 안되어있는 옛날버전.
        list.add("hello"); //넣을때 아무거나 넣고
        String str = (String) list.get(0); // 형변환해서 뺀다
        System.out.println(str);

        //요즘의 제네릭 타입으로 변환
        List<String> list2 = new ArrayList<>(); // 집어넣을 때 스트링으로 입력한다고 명시해줌. 타입캐스팅 필요없음.
        list2.add("java"); // 스트링타입이 아닌 다른 타입을 입력하면 에러.
        String str2 = list2.get(0);
        System.out.println(str2);
    }
}
