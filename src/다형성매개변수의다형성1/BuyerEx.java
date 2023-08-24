package 다형성매개변수의다형성1;
//0824_3
import java.util.Scanner;

////0824_3
public class BuyerEx {
    public static void main(String[] args) {
        Buyer2 buyer2 = new Buyer2();
        TV tv = new TV();
        Computer computer =new Computer();
        Audio audio = new Audio();

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("[1]TV [2]Computer [3]Audio [4]quit : ");
            int sel = sc.nextInt();
            switch (sel) {
                case 1 :
                    buyer2.buy(tv);
                    buyer2.viewInfo();
                    break;
                case 2 :
                    buyer2.buy(computer);
                    buyer2.viewInfo();
                    break;
                case 3 :
                    buyer2.buy(audio);
                    buyer2.viewInfo();
                    break;
                case 4 : return;
                default: System.out.println("해당 제품이 없습니다.");
            }
        }
    }
}
