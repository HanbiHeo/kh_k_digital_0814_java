package 실습텍스트파일읽기2;

public class Student implements Comparable<Student>{
     private String name;
     private int total;

     public Student(String name, int total) {
          this.name = name;
          this.total = total;
     }

     public String getName() {
          return name;
     }

     public int getTotal() {
          return total;
     }

     @Override
     public int compareTo(Student o) {
          if(this.getTotal() == o.getTotal()) return this.name.compareTo(o.name); //같은경우 이름순정렬
          return o.getTotal() - this.getTotal(); //내림차순 정렬
     }
}
