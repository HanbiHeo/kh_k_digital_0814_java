package 회원정보;

import java.util.Scanner;

//입력받을 것 : 이름(문자열),
// 나이(정수), 1~199 를 정상으로 간주하고 이외의 값이 오면 재 입력 요구 while
// 성별(문자 M, F 입력 받고 출력은 남성, 여성),
// 직업(정수로 입력; 1. 학생 2. 회사원 3. 주부 4. 무직) 1 ~ 4 이외의 값은 재입력 요구
// 결과는 한번에 출력
public class MemberInfo {
    String name; // 인스턴스(=객체, 비슷한 개념) 필드. 지역 변수가 아니라 객체 범위의 변수
    int age;
    char gender;
    int jobs;
    Scanner sc = new Scanner(System.in);

    public void setName() { // 값을 쓰는건 set
        System.out.print("이름을 입력 하세요 : ");
        name = sc.nextLine();
    }
    public void setAge() {
        while (true) {
            System.out.print("나이를 입력 하세요 : ");
            age = sc.nextInt();
//            if(age > 0 && age < 200) break; //정상적인 입력이면
            if(age > 0 && age < 200) return; // 반복문을 빠져나가는 조건은 아님.
            System.out.println("나이를 잘못 입력하셨습니다."); //else 는 전에 참이면 브레이크 걸리니 안넣어도 됨.
        }
    }
    public void setGender() {
        while (true) {
            System.out.print("성별을 입력 하세요 : ");
            gender = sc.next().charAt(0); //문자열의 맨 앞문자 추출
            switch (gender) {
                case 'M':
                case 'n':
                case 'F':
                case 'f':
                    return;
                default:
                    System.out.println("성별을 잘 못 입력하셨습니다.");
//                    continue; // 수행해야 할 곳으로 이동
            }
        }
        // 수행해야 할 게 있음
    }
    public void setJobs() {
        while (true) {
            System.out.print("직업을 입력 하세요 : ");
            jobs = sc.nextInt();
            if(jobs > 0 && jobs < 5) break;
            System.out.println("직업을 잘 못 입력하셨습니다.");
        }

    }
    public int getGenderType() {
        if(gender == 'M' || gender == 'm') return 1;
        else  return 2;
    }
    public void getInfo() {
        String[] genderStr = {"", "남성", "여성"}; // 0 1 2
        String[] jobsStr = {"", "학생", "회사원", "주부", "무직"}; //0 1 2 3 4 앞의 ""를 안넣으면 jobs - 1
        System.out.println("=".repeat(5) + "회원정보 : " + "=" .repeat(5));
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("성별 : " + genderStr[getGenderType()]);
        System.out.println("직업 : " + jobsStr[jobs]);
    }


}
