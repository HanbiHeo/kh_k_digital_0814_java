package 학생성적정렬;

import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

//0831
//미리 입력 받아서 시작
// 5명의 학생에 대해 이름과 성적을 입력하고, 성적이 높은 순으로 정렬. 성적이 같으면 이름순.
public class StudentSortEx {
    public static void main(String[] args) {
        TreeSet<Student>info = new TreeSet<Student>();
        info.add(new Student("이찬혁", 95));
        info.add(new Student("이수현", 80));
        info.add(new Student("잔나비", 80));
        info.add(new Student("차정원", 82));
        for(Student e : info) {
            System.out.print(e.name + " ");
        }
//        HashSet<Student> scrCnt = new HashSet<>();
//        Student student1 = new Student("이찬혁", 95);
//        Student student2 = new Student("이수현", 80);
//        Student student3 = new Student("잔나비", 80);
//        Student student4 = new Student("차정원", 82);
//        scrCnt.add(student1);
//        scrCnt.add(student2);
//        scrCnt.add(student3);
//        scrCnt.add(student4);
//        for(Student e : scrCnt) e.viewStuScr();
    }
}
class Student implements Comparable<Student>{
    String name;
    int scr;

    public Student(String name, int scr) {
        this.name = name;
        this.scr = scr;
    }
    public void viewStuScr() {
        System.out.println("성 명 : " + name);
        System.out.println("성 적 : " + scr);
        System.out.println();
    }

    @Override
    public int compareTo(Student o) {
        if(this.scr < o.scr) return 1; //내림차순정렬
        else {
                return this.name.compareTo(o.name); //사전순 정렬
        }
    }
}
