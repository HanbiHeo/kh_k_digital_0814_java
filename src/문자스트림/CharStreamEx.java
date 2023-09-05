package 문자스트림;
import java.io.*;

//0905
//Writer : 문자열 기반의 출력 스트림이 취상위 클래스로 추상클래스 입니다.
//Reader : 문자열 기반의 입력 스트림이 취상위 클래스로 추상클래스 입니다.
public class CharStreamEx {
    public static void main(String[] args) throws IOException {
        Writer writer = new FileWriter("test.txt");
        char[] data = "룰루랄라".toCharArray(); //문자열 자체를 문자 배열로 바꿈. 각각의 글자가 하나의 문자로 바뀜
//        for(int i = 0; i < data.length; i++) {
//            writer.write(data[i]);
//        }
//        writer.write(data);
//        writer.flush(); // 버퍼비우기
//        writer.close();

        Reader reader = new FileReader("test.txt");
        while (true) {
            int readData = reader.read();
            if(readData == -1) break;
            System.out.print((char) readData);
        }
        reader.close();
    }
}
