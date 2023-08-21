package 문자열다루기;
//08.21_7
//자바는 문자열을 나타내는 자료형은 String이며, 참조타입 자료형 입니다.
//equals : 두개의 문자열이 동일한지 비교하여 결과값을 리턴함(true | false), == : 문자열의 주소가 같은지를 물어봄.
public class StringMethod {
    public static void main(String[] args) {
        String a = "hello java";
        String  b = " java";
        String c = "Hello Java";
        String d = new String("hello");

        System.out.println(a.equals(d));
        System.out.println(a.equals(c));
        System.out.println(a.equalsIgnoreCase(c)); //문자열을 비교하는데 대소문자 구분 안함
        
        //indexOf : 문자열에서 특정 문자가 시작되는 인덱스를 반환
        System.out.println(a.indexOf("lt")); //문자가 시작되는 인덱스 반환. 없다라는 값은 -1 이 기본값임

        //contains : 문자열에서 특정 문자열이 포함되어 있는지 여부 확인
        System.out.println(a.contains("java"));

        //charAt : 문자열에서 특정 위치의 문자를 반환
        System.out.println(a.charAt(4));

        //replaceAll : 문자열 중에서 교체를 특정 문자열을 다른 문자열로 변경(정규식)
        String e = "Hello Java";
        System.out.println(e.replaceAll("Java", "Python...")); //replace는 단순히 문자만 교체, replaceAll 교체할 문자열 + 정규식을 넣을 수 있음
        //대체할 문자에 아무것도 안넣으면("") 삭제됨

        //substring : 문자열 중 특정 부분을 뽑아낼 때 사용
        System.out.println(e.substring(4, 7/*4에서 7미만 4, 5, 6*/));
        // 1. 시작 인덱스만 주는 경우 2. 시작과 끝을 주는 경우
        
        //toUpperCase / toLowerCase : 문자열 전부를 대문자 / 소문자로 변경하는 메소드
        System.out.println(e.toUpperCase()); // 대문자
        System.out.println(e.toLowerCase()); // 소문자
        
        //trim : 문자열 앞 뒤의 공백을 잘라냄
        String oldStr = "        자바 프로그래밍               ";
        System.out.println(oldStr.trim()); //예)로그인 페이지에서 실수로 공백 넣을 때 쓸 수 있음.

        //Split : 문자열을 특정 구분자로 분리하는 메소드
        String time = "10:23:45";
        String[] modifyTime = time.split(":");
        for(String eee : modifyTime) System.out.println(eee + "   ");

        //문자열 포멧팅을 출력을 위해서 사용
        System.out.printf("I eat %d apples.\n", 3);
        System.out.println(String.format("I eat %d apples.", 3));

        String test = String.format("I eat %d apples.", 3);
        System.out.println(test);

        //toCharArray() : 문자열을 문자 배열로 변환
        String testName = "James";
        char[] chName = testName.toCharArray();
        for(char eCh : chName) System.out.print(eCh + "  ");
    }
}
