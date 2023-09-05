package 실습텍스트파일읽기;
// 1. 파일 불러옴 2. 정보별 배열로 나누기 3. 각 학생의 총 합을 구함 4. 순위 매김
//점수순으로 이름과 함께 출력

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeSet;

public class ReadTxt {
    public static void main(String[] args) throws FileNotFoundException {
        TreeSet<Students> st = new TreeSet<>();
        FileInputStream fis = null;
        try{
            fis = new FileInputStream("src/실습텍스트파일읽기/Score.txt");
        } catch (IOException e) {
            System.out.println("읽을 파일을 찾지 못하였습니다.");
        }
        Scanner sc = new Scanner(fis);
        while (sc.hasNext()) {
            String line = sc.nextLine();
            String[] lineSplit = line.split(" ");
        }
    }
}


class Students{
    private String name;
    public int score1;
    public int score2;
    public int score3;

    public Students(String name, int score1, int score2, int score3) {
        this.name = name;
        this.score1 = score1;
        this.score2 = score2;
        this.score3 = score3;
    }

    public String getName() {
        return name;
    }
    public int getTotalScore() {
        return score1 + score2 + score3;
    }
    //순위매기기
    public int compareTo(Students o){
        if(this.getTotalScore() == o.getTotalScore()) return this.name.compareTo(o.name);
        return o.getTotalScore() - getTotalScore();
    }
}
