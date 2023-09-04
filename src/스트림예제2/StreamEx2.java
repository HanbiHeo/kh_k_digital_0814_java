package 스트림예제2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

//0904
//반복자 스트림 forEach() : 내부 반복자, 스트림 요소에 대한 순차 접근을 제공하며,  최종 연산에 해당함
public class StreamEx2 {
    public static void main(String[] args) {
//        ArrayList<String> list = new ArrayList<>(Arrays.asList("고유림", "나희도", "백이진"));
//        for(String e : list) System.out.print(e + " ");
//
//        list.forEach(e->System.out.print(e + " "));

        List<Student> list = Arrays.asList(
                new Student("고유림", 75),
                new Student("나희도", 68),
                new Student("우영우", 100),
                new Student("최수연", 90),
                new Student("권민우", 92)
        );
        double average = list.stream()// 스트림 생성
                .mapToInt(Student::getScore) //메소드 참조, 중간연산
                .average() //중간 연산
//                .getAsDouble(); //최종연산
                .orElse(0.0); //만약 연산이 비어있으면 0.0으로 반환
        System.out.println("평균 : " + average);

        IntStream stream = IntStream.rangeClosed(1, 100);
        System.out.println("합계 : " + stream.sum());

//        list.forEach(s->{
//            String name = s.getName();
//            int score = s.getScore();
//            System.out.println(name + "  :  " + score);
//        });
//        list.parallelStream().forEach(s -> { // 내부 반복자를 이용한 병렬처리.
//            String name = s.getName();
//            int score = s.getScore();
//            System.out.println(name + "  :  " + score);
//        });

//        //향상된for문
//        for(Student s : list) {
//            String name = s.getName();
//            int score = s.getScore();
//            System.out.println(name + "  :  " + score);
//        }
    }

    private static void orElse(double v) {
    }
}

class Student {
    private String name ;
    public int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
}
