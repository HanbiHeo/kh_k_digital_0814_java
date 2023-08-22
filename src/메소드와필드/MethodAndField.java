package 메소드와필드;
//230822_2
//메소드란, 클래스내에서 동작에 대한 기능을 구현하는 것. 함수와 같다
//필드란 , 클래스 내에서 값을 저장하는 변수를 의미. 상태를 저장함
public class MethodAndField {
    public static void main(String[] args) {
//        MethodAndField methodAndField = new MethodAndField();
//        int result = methodAndField.sum(100, 200);
//        System.out.println(result);
//    }
//    static int sum(int a, int b) {
//        return a + b; //값을 더해서 리턴

//        int result = sum(100, 200, 300, 400);
        int result = recFunc(10);
        System.out.println(result);
    }
    //메소드 앞에 static 을 선언하는 경우 객체소속이 아니고 클래스 소속
    static int sum(int a, int b) {
        return a + b; //값을 더해서 리턴
    }
    //sum 메소드의 매개변수 개수를 다르게 만들었으므로 오버로딩 관계가 성립
    static int sum(int a, int b, int c) {
        return a + b + c;
    }
    static int sum(int ... val) {
        int sum = 0;
        for(int e : val) sum += e;
        return sum;
    } // 매개변수 목록에 대한 개수를 알 수 없는 경우 때 전개연산자 씀.

    // 재귀호출 : 매소드 자신이 스스로를 호출하는 것, 미로찾기, 탐색관련 알고리즘때 많이 씀.
    static int recFunc(int n) {
        if(n == 1) return 1;
        return n + recFunc(n - 1);
    }
    static int whileSum(int n) {
        int sum = 0;
        while( n > 0){
            sum += n;
            n--;
        }
        return sum;
    }
}
