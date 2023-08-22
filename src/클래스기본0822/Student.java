package 클래스기본0822;

public class Student {
    //    private int id;  private -> 숨길 수 있음. 외부에서 해당 필드에 대한 접근 막음
    private int id;                               //학번, 필드라고 부름
    private String name;                  //이름
    private int grade;                        //학년
    private String addr;                    //주소

    //메소드(함수)
    public void showInfo() {
        System.out.println(name + ", " + addr);
    }
    //Setter 메소드
    public  /*boolean*/String setName(String name) {
        this.name = name;
        return /*true*/ "참입니다";
    }
    public void setAddr(String addr) {
        this.addr = addr;
    }
}
