package 정적멤버와메소드;

public class Bank {
    private static int count = 0; //정적 필드, 객체로 생성되지 않는다!!!
    private int account ; //계좌
    private String bank; //은행이름
    Bank(String name, int account) {
        count++; // 계좌가 몇개 만들어지는지 확인하기 위해
        this.bank = name;
        this.account = account;
        System.out.println(bank + "은행에 계좌를 개설 합니다. 잔액은 " + this.account + "입니다.");
    }
    public static int getCount() { //정적 메소드, 객체로 만들어지지 않음!!!
        return count;
    }
    public void setDeposit(final int dep) { //final 붙인 이유 : 예금된 금액이 바뀌면 안됨.
        this.account += dep;
        System.out.println(dep + "을 예금 했습니다.");
    }
    public void setWithDraw(final int with) {
        if(with > account) {
            System.out.println("잔액이 부족합니다. ");
        } else {
            account -= with;
        }
    }
    public void viewAccount() {
        System.out.println("현재 잔액은 : " + account + " 입니다.");
    }
}
