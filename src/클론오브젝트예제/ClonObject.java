package 클론오브젝트예제;
//0829
public class ClonObject implements Cloneable{
    public static void main(String[] args) {
        Member mem1 = new Member("철수", "미애", "12345", 20, true);
        Member mem2 = mem1.getMember(); //얕은복사가 일어나는 조건
        mem1.viewInfo();
        System.out.println();
        mem2.name = "영희";
        mem2.password = "23123";
        mem2.viewInfo();
        System.out.println();
        mem1.viewInfo();
    }
}
