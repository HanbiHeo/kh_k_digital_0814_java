package 스트링다루기;
//0829
//StringBuffer(동기화 지원, 잠금기능), StringBuilder(지원하지 않음) 둘 다 문자열을 추가하거나 변경할 때 사용
//String 자료형과 어떤 차이가 있는지만 이해하면 됨.
public class StringBufferEx {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("안녕~");
        sb.append(" ");
        sb.append("안녕~~");
        System.out.println(sb);


        String st =""; // 문자의 초기값.  값이 없다는 기본값을 넣음, 오토캐스팅.
//        String st =null; // 주소가 없다고 판단.
//        문자의 초기값. null과 "" 둘 다 초기화 가능.
        st += "안녕";
        st += ", ";
        st += "안녕~";
        System.out.println(st);

        StringBuilder sb2 = new StringBuilder();
        sb2.append("자바이동");
        sb2.insert(1, "아아아ㅏ안녕"); // 인서트 : 해당 offset에 문자열을 추가
        System.out.println(sb2);
        sb2.delete(0, 3); //문자열 범위지정해서 지울 수 있음.
        System.out.println(sb2.substring(0,2));
    }
}
