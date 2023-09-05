package 스트림파일스트림읽기0905;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileStreamRead {
    public static void main(String[] args) {
        FileInputStream inputStream = null; //입력에 대한 객체를 아직 안만듦
        try{
            inputStream = new FileInputStream("src/스트림파일스트림읽기0905/멍멍.txt");
        } catch (FileNotFoundException e) {
            System.out.println("읽을 파일을 찾지 못하였습니다.");
        }
        Scanner sc = new Scanner(inputStream);
        while (sc.hasNext()) { //읽을 내용이 있으면 참이 됨.
            String line = sc.nextLine(); // 문자열을 줄바꿈 기준으로 읽음
            System.out.println(line);
        }
    }
}
