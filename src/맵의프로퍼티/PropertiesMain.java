package 맵의프로퍼티;

import java.io.FileReader;
import java.io.IOException;
import java.net.URLDecoder;
import java.util.Properties;
//0831
//Map의 하나의 형태 : key 와 값이 모두 String 타입으로 제한된 형태
public class PropertiesMain {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        //. -> 현재 .. -> 상위폴더로 올라감 /패키지폴더 이름/
        String path = PropertiesMain.class.getResource("../디폴트메소드중복/database.properties").getPath();
        path = URLDecoder.decode(path, "utf-8"); // utf-8은 한글에 대한 처리를 위해서
        properties.load(new FileReader(path));
        String driver = properties.getProperty("driver");
        String url = properties.getProperty("url");
        String username = properties.getProperty("username");
        String password = properties.getProperty("password");

        System.out.println("driver : " + driver);
        System.out.println("url : " + url);
        System.out.println("username : " + username);
        System.out.println("password : " + password);
    }
}
