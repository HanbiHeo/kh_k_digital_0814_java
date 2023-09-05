package 스트림바이트스트림0905;
import java.io.*;

//OutputStream : 바이트 기반. 출력 스트림의 최상위 추상 클래스 입니다.
public class ByteStreamEx {
    public static void main(String[] args) throws IOException {
        //1
//        OutputStream os = new FileOutputStream("test.bin");
//        byte a = 10;
//        byte b = 20;
//        byte c = 30;
//        os. write(a);
//        os. write(b);
//        os. write(c);
        //2
//        OutputStream os = new FileOutputStream("test2.bin");
//        byte[] array = {10, 20, 30};
//        os.write(array);
        //3
//        OutputStream os = new FileOutputStream("test3.bin");
//        byte[] array = {10, 20, 30, 40, 50};
//        os.write(array, 1, 3); //배열의 1번 인덱스부터 3개만큼 출력
//
//        os.flush(); // 파일을 쓰고 나면 반드시 플러쉬 해주어야함(버퍼비우기)
//        os.close(); // 자원 반납 후 스트림 닫기 (안닫으면 자원 날라감)

        InputStream is = new FileInputStream("test3.bin");
        //1
//        while (true) {
//            int data = is.read(); // 파일에 쓴걸 1바이트씩 읽기
//            if(data == -1) break; // 더 이상 읽을 내용이 없으면 -1, 즉 파일의 끝
//            System.out.println(data);
        //2
        byte[] buffer = new byte[100]; // 100개짜리 버퍼 잡기
        while (true) {
            int readNum = is.read(buffer); // 배열의 길이만큼 읽기
            if(readNum == -1) break;
            for(int i = 0; i < readNum; i++) {
                System.out.println((buffer[i]));
            }
        }
        is.close();
    }
}
