package 배열기본;
//08.21_2
//자바의 배열은 동일한 데이터 요소들을 연속적으로 저장하는 자료 구조
//인덱스를 사용해서 각 요소를 접근할 수 있음 (인덱스는 0부터 시작한다)
//배열은 크기를 먼저 지정해야 한다
//타입[ ] 배열이름 = new 타입[배열길이];
public class ArrayBasic {
    public static void main(String[] args) {
        //=====배열이 크기를 할당하고 이후에 초기화 하는 방법 =====
        int[] grade1 = new int[3]; //heap 영역에서 정수 3개를 저장할 메모리 공간을 확보
        grade1[0] = 85;
        grade1[1] = 99;
        grade1[2] = 77;
////        grade1[3] = 33;
//
////        for(int i = 0; i < grade1.length; i++) {
////            System.out.println(grade1[i] + " ");
////        }
//
//        //향상된 for문 : 주어진 배열 등의 크기를 자동 순회를 함
//        for (int e : grade1){
//            System.out.println(e+ " ");
//        }
//        int[] odd = {1,3,5,7,9}; //(이미 정해준 값을 배열에 대입하는 경우는 크기와 new를 사용하지 않아도 됨)고정된 값이 들어가기 때문에 길이 할당해줄 필요 없음. new 써도되고 안써도 됨.
//        String[] weeks = {"월요일", "화", "수", "목", "금","토","일"}; //char{'월'} 로 넣어도 됨.
        int[] grade2 = {88, 99, 56}; //이미 값을 알고 있는 경우
        int[] grade3 = new int[] {99, 88 ,77};

        int[] grade4; //객체타입의 참조변수; 실제 객체의 주소를 받아야함
        grade4 = new int[4];
        grade4[0] = 100;
        grade4[1] = 88;
        grade4[2] = 77;
        grade4[3] = 55;
        int sum = 0; //총점을 구하기 위한 변수

        //기본for문
//        for(int i = 0; i < grade4.length; i++) {
//            grade4[i] += 10;
//            sum += grade4[i];
//        }

        //향상된 for문, 향상된 for문은 요소(값)를 바꿀 수 없음. 제약선언이 많아야 오류를 범할 확률이 낮아짐.
//        for(int val/*아무거나 들어가도 됨. 선언 해주어야함.*/ : grade4) sum += val; //총점구하기
        for(int val : grade4) {
            val += 10;
            sum += val; // 총점구하기
        }
        System.out.println("총점 : " + sum);
        System.out.printf("평균 :  %.2f\n", (double)sum / grade4.length);

        
        sum = 0;
        for(int i = 0; i < grade4.length; i++) { // length는 배열 길이를 확인 뒤에 ()있으면 메소드 없으면 변수
            sum += grade4[i];
        }
        System.out.println("총점 : " + sum);
        System.out.printf("평균 :  %.2f\n", (double)sum / grade4.length);

//        for (int e : grade4) {
//            System.out.print(e + " ");
//        }

    }
}
