package 배열을이용한정렬;
//08.21_4
//1차원 배열을 이용한 기본정렬(버블정렬 또는 삽입정렬)
//사용 예시의 버블 정렬은 일반적인 방법과 약간 차이가 있음
//기본적인 버블 정렬이나 삽입정렬은 시간의 복잡도를 나타내는 빅오표기법으로 표시하면 0(n2)만큼 걸림. 효율이 나쁨
public class ArraySort {
    public static void main(String[] args) {
        int[] arr = {9, 4, 3, 10, 5, 8, 7, 6, 2, 1};
        int tmp = 0; //위 열개를 정렬하기 위한 임시공간 생성
        for(int i = 0; i < arr.length; i++){
            for(int j = i; j < arr.length; j++) {
                if(arr[i] < arr[j]) { //i는 고정 j가 수행
                    tmp = arr[j]; // 값을 복사할 때 기존값을 대피시켜 기존 값 덮지 못하게 빼야 함.
                    arr[j] = arr[i]; // i값을 j에 넣음
                    arr[i] = tmp; 
                }
            }
        }
        for(int e : arr) System.out.print(e + " ");
    }
}
