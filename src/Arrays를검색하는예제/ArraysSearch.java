package Arrays를검색하는예제;

import java.util.Arrays;
import java.util.Scanner;

//0829
//검색을 위해서는 사전에 정렬이 되어 있어야 함
public class ArraysSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("배열의 갯수 : ");
        int num = sc.nextInt();
        int[] arr = new int[num]; //배열의 갯수 정하기

        System.out.print("찾을 숫자를 입력 : ");
        int key = sc.nextInt();
        for(int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * num) + 1; //num의 갯수만큼의 랜덤값을 배열에 채움. 배열의 크기만큼 수 채움.
            //검색하기 전에 정렬이 되어있어야 빠르게 검색이 가능.
        }
        Arrays.sort(arr); // 검색하기 전 정렬을 함.
        for(int val : arr) System.out.print(val + " ");
        System.out.println();
        int result = Arrays.binarySearch(arr, key); //정렬된 배열을 이분 검색(binary search)을 함
        if(result >= 0) {
            System.out.println(result); // 인덱스가 넘어옴.
        } else {
            System.out.println("찾으시는 값이 없습니다.");
        }
    }
}
