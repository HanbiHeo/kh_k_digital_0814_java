package System클래스시간측정;

import static java.lang.Thread.sleep;

//0830
public class SystemClass {
    public static void main(String[] args) throws InterruptedException {
//        long time = System.currentTimeMillis(); // 타임 읽어오기
//        long nanoTime = System.nanoTime();
//        System.out.println(time);
//        System.out.println(nanoTime);
        int[] data = new int[1000];
        int cnt = 0, i;
        int randVal = (int)(Math.random() * 1000) + 1; // 1부터 1000까지 임의의 수 만듦
        for(i = 0; i < data.length; i++) {
            data[i] = i+1;
        }
        long startTime = System.currentTimeMillis(); // 시작시간을 만듦. 구간 진입하기 전 스타트 타임 찍고
        for(i = 0; i < data.length; i++) {
            cnt++; //몇번만에 찾았는지 횟수를 구함
            sleep(1); // 너무 빨리 돌아갈 것 같아 슬립 걸어줌. 1000분의 1초동안 잠깐 잠재우기.
            if(randVal == data[i]) {
                System.out.println("위치 : " + (i+1));
                break;
            }
        }
        long endTime = System.currentTimeMillis(); // 바로위의 구간이 도는데 시간이 얼마나 걸렸는지 구함. 구간이 끝나기까지의 시간을 구함.
        System.out.println("총 검색 횟수 : " + cnt);
        System.out.println("검색에 소요된 시간 : " + (endTime-startTime) + "밀리초 입니다.");

        System.out.println(System.getProperty("os.name"));
        System.out.println(System.getProperty("user.name"));
        System.out.println(System.getProperty("os.home"));
    }
}
