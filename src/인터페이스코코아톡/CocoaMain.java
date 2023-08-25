package 인터페이스코코아톡;
//230825
import java.util.Scanner;

public class CocoaMain {
    public static void main(String[] args) {
        CocoaTalk cocoaTalk = new CocoaTalk("영희");
        cocoaTalk.writeMsg("오늘 캠핑가기 좋은날씨");
        NetAdapter adapter;
        Scanner sc = new Scanner(System.in);
        System.out.println("네트워크 [1]WIFI [2]FiveG : ");
        int sel = sc.nextInt();
        if(sel == 1) adapter = new WIFI();
        else adapter = new FIveG();
        cocoaTalk.send(adapter);
    }
}
