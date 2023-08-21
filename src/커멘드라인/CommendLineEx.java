package 커멘드라인;
//08.21_3
//main 메소드는 자바 프로그램의 시작지점
//CLI (Commend LIne Interface) : 입력
public class CommendLineEx {
    public static void main(String[] args/*문자열에 대한 배열*/) {
        if(args.length != 2) {
            System.out.println("프로그램 사용법");
            System.out.println("Java Main String Argument num1 num2");
            System.exit(0); // 프로그램 강제종료
        }
        String strNum1 = args[0];
        String strNum2 = args[1];

        int num1 = Integer.parseInt(strNum1);
        int num2 = Integer.parseInt(strNum2);
        int result = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + result);
    }
}
