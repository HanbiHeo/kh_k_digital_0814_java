package 컴페어러블;

public class CarComp implements Comparable<CarComp> {
    public String modelName;
    public int modelYear;
    public String color;

    public CarComp(String modelName, int modelYear, String color) {
        this.modelName = modelName;
        this.modelYear = modelYear;
        this.color = color;
    }

    @Override
    //반환값이 1이면 정렬해야될 조건
    //반환값이 -1이면 현재가 맞는것. 정렬 안해도 되는 조건
    //반환값이 0이면 두개가 같은 경우. 정렬조건은 아니지만 set을 사용하는 경우 중복제거 조건임. treeSet은 같으면 지워버림.
    public int compareTo(CarComp o) {
        if(this.modelYear > o.modelYear) return 1; // 연식별 오름차순 정렬
        else {
            if(this.modelYear == o.modelYear) {
                return this.modelName.compareTo(o.modelName); // 이름의 길이가 같으면 사전순 정렬
            }
        }
        return -1; // 0은 같다 -> 중복제거. -1은 제거 안함.
    }
}
