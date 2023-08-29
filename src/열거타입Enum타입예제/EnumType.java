package 열거타입Enum타입예제;

import java.util.Calendar;

//0829
//열거타입 : 서로 연관된 상수끼리 모아놓은 것
//실제 값 뿐 아니라 타입체크까지 가능
// 예전에는 class 내의 final static String ... 식으로 정의해서 사용하던 방식을 대신하여 사용할 수 있음.
public class EnumType {
    public static void main(String[] args) {
        Week today = null;
        Calendar cal = Calendar.getInstance();
        int week = cal.get(Calendar.DAY_OF_WEEK); // 주에서 몇번째 요일인지 가져윰
        switch (week) {
            case 1 :
                today = Week.SUNDAY; break; //today는 week라는 열거타입. 열거타입 중 하나만 올 수 있음.
            case 2 :
                today = Week.MONDAY; break;
            case 3 :
                today = Week.TUESDAY; break;
            case 4 :
                today = Week.WEDNESDAY; break;
            case 5 :
                today = Week.THURSDAY; break;
            case 6 :
                today = Week.FRIDAY; break;
            case 7 :
                today = Week.SATURDAY; break;
        }
        System.out.println("오늘은 : " + today + " 입니다.");
    }
}
enum Week {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}
