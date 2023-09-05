package 실습텍스트파일읽기2;
//임의의 위치에 텍스트 파일을 만들고, 10명의 정보를 공백 기준으로 미리 입력해둠.
//해당 파일을 읽어 총점을 구하고 총점이 높은 사람 순으로 이름과 총점 보여주기
//comparator, comparable 써도 됨.
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeSet;

public class TextFileRead {
    public static void main(String[] args) throws FileNotFoundException {
        TreeSet<Student> treeSet = new TreeSet<>();
        FileInputStream fis = new FileInputStream("src/실습텍스트파일읽기2/Score.txt");
        Scanner sc = new Scanner(fis);
        while (sc.hasNextLine()) {
            String[] lineSplit = sc.nextLine().split(" ");
            treeSet.add(new Student(lineSplit[0],
                    Integer.parseInt(lineSplit[1])
                            +Integer.parseInt(lineSplit[2])
                            +Integer.parseInt(lineSplit[3])));
        }
        for(Student e : treeSet) {
            System.out.println(e.getName() + " : " + e.getTotal());
        }
    }
}
