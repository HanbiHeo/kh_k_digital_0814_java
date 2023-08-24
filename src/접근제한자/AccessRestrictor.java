package 접근제한자;
//0824_7
public class AccessRestrictor {
    public static void main(String[] args) {
        Child child = new Child("학생");
        System.out.println(child.getName());
        System.out.println(child.getMoney());
        System.out.println(child.getAddr());
    }
}
class Child extends Parent {
    String jobs;
    public Child(String jobs) {
        this.jobs = jobs;
    }
    public String getMoney() {
        return money;
    }
    public String getName() {
        return name;
    }
    public String getAddr() {
        return addr;
    }
}

