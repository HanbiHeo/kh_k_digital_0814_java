package 비트연산자;
// 비트 연산자는 비트단위의 연산을 수행합니다.
// 정보처리사 문제에서 자주 나옴.
// 연산자의 종류는 세가지
// AND : & ;  논리연산자의 and. 두개의 비트가 모두 1이어야 1이 됨. and 연산과 같음
// OR : | ; 비교하는 두개의 비트가 한쪽만 1이면 1이 됨
// XOR : ^ ; 비교하는 두 비트가 서로 다른경우 1이 됨
// NOT : ~ ; 현재의 비트 값을 반전시킴
// 왼쪽 쉬프트 : << ; 비트를 왼쪽으로 이동시킴
// 오른쪽 쉬프트 : >> ; 비트를 오른쪽으로 이동시킴
public class BitOperate {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 12;
        System.out.println(num1 & num2); //8
        System.out.println(num1| num2); //14
        System.out.println(num1 ^ num2); //6
        System.out.println(~num1); // -11 , 자바에서는 양수를 음수 표시할 때 1 차이가 남.
        System.out.println(num1 << 1); // 20, 1은 한 비트만 이동한다는 뜻. 한개의 비트를 움직이면 곱하기 2와 같음.
        System.out.println(num1 >>1); // 5, 한비트 이동시 나누기.



    }
}
