package 명령어이력조회큐연습Queue;

import java.util.*;

//0901
public class CommandHistory {
    Queue<String > queue = new LinkedList<>();
    final static int Max_SIZE = 10;
    public static void main(String[] args) {
        CommandHistory history = new CommandHistory();
        System.out.println("help를 입력하면 도움말을 볼 수 있습니다.");
        while (true){
            System.out.print("$ ");
            Scanner sc = new Scanner(System.in);
            String cmd = sc.nextLine().trim(); //trim() 은 공백체크. 입력된 문자열 앞/뒤 공백이 있는지 체크.
            if(cmd.equalsIgnoreCase("q")) { //swich케이스도 가능
                System.out.println("프로그램을 종료합니다.");
                System.exit(0); // 프로그램 강제종료 = q를 누르면 강제종료
            }else if (cmd.equalsIgnoreCase("help")) {
                System.out.println("help - 도움말을 보여 줍니다.");
                System.out.println("q/Q - 프로그램 종료.");
                System.out.println("history - 최근 입력한 명령어를 " + Max_SIZE + "개 보여 줍니다.");
            } else if (cmd.equalsIgnoreCase("history")){
                history.save(cmd);
                int cnt = 0;
                for(String e : history.queue) {
                    cnt++;
                    System.out.println(cnt + " " + e); //숫자 + 공백 + 히스토리
                }
            } else {
                history.save(cmd);
                System.out.println(cmd);
            }
        }
    }
    void save (String cmd) {
        queue.offer(cmd);
        if(queue.size() > Max_SIZE) queue.remove(); //큐의 사이즈가 정해진 맥스 사이즈보다 크면 제일 처음 들어온 요소부터 제거
    }
}
