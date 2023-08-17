package 형변환;
//2023.08.16
//형변환이란 : 하나의 데이터 타입을 다른 타입으로 변환 하는것
//명시적 형변환 : 개발자가 의도를 가지고 형변환을 하는 것
//묵시적 형변환 : 컴파일러가 자동으로 해주는 것 ; 오토 형변환 (유리한 방향으로 변경)
public class TypeCasting {
    public static void main(String[] args) {
        int num1 = 1, num2 = 4;
//        double result1 = num1 / num2; // 형변환이 안일어남, 이미 계산 할 때 소수점을 날려버림; .25를 날려버림
//        double result2 = (double) num1 / num2; // 명시적(num1), 묵시적(num2) 형변환이 일어남; (1.0)으로 간주하라고 명시. 이후 유리한 계산을 위해 뒤도 실수로 계산.

        String kor = "90"; // String에서 90은 숫자가 아니라 문자로 인식.
//        int intKor = Integer.parseInt(kor); //parseInt(문자열)를 Integer(숫자)로 변환하는 메소드
//        int kor  = 90;
        int mat = 88;
        int eng = 55;
        int total = Integer.parseInt(kor) + mat + eng; //총점
        double avg = (double)total / 3; //평균.      3도 3.000으로 묵시적 형변환 일어남.

        System.out.println(avg);
//        System.out.println(result2);
    }
}
