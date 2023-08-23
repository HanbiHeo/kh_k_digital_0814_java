package 샘플프로그램; //패키지 명 : 클래스의 묶음. 패키지 안에는 여러개 들어갈 수 있음.
//2023.08.14

// public 이거나 없거나. 둘 중 하나. : 접근 제한자 이며, 모두 허용. 
public class SampleClass {
    //Class는 대문자. 이유는 동작요소가 아닌 제품의 틀; 틀은 대문자. 객체와 구분하기 위해서.

    // 메소드에 대한 접근제한자는 public, protected, private, 아무것도 없는 디폴트
    public static void main(String[] args) {
        //main이 처음이자 끝; 프로그램의 시작지점. void는 그렇기 때문에 넘겨줄게 없다는 뜻. main 안에서 모든게 이루어짐.

        System.out.println("샘플 프로그램 출력됩니다.");
        //print'ln'은 줄바꿈이 있다는 뜻. print 혹은 println

        /*
        주석을 주는 방법
        Data : 2023. 08.14
        Author :  Hershey
        Purpose : 샘플 프로그램 출력됩니다.
        주석은 읽지 않는 부분, 해석하는 부분이 아니라는걸 컴파일러에게 알려줌.
         */

        /*범위주석*/
        //한줄주석
        // ctrl + / -> 주석으로 잡힘
        System.out.println("출력 no2");
    }
}
