package 중복없는로또번호;
//08.21_9_test2
//1~45 사이의 수 6개를 생성해야 함.
//입력은 받지 않음. 랜덤함수 Math.random() =>01 ~ 0.999
//int val = (int) ((Math.random() * 45 + 1);
//단 중복제거 !=
//생성된 val값을 배열에 감을 때 배열 내에 해당하는 값이 있는지 확인 필요.
//배열은 6개 만들면 됨.
//반복횟수는 정할 수 없음 (무한의 반복) (while(ture) =>탈출조건이 있어야함. ; 중복되지 않는 번호 6개가 저장되면 탈출. break;)

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class RandomLotto {
    public static void main(String[] args) {
        // ===========배열을 쓰는 방법===============
//        int[] lotto = new int[6];
//        int tmp, index = 0; //임시 로또 번호
//        boolean isExist = false;
//
//        while (true) /*몇번만에 로또번호를 생설할지 모르니까*/ {
//            tmp = (int) ((Math.random() * 45) + 1);
//            for (int i = 0; i < lotto.length; i++) {
//                if(lotto[i] == tmp) isExist = true;
//            }
//            if(!isExist) lotto[index++] = tmp; // =  if(isExist == false) lotto[index++] = tmp;
//            if(index == 6) break;
//            isExist = false;
//        }
//        for(int e : lotto) System.out.print(e + " ");
//        for(int )


        //===============ArrayList써서 로또번호===================
//        List<Integer> list = new ArrayList<>();
//        int tmp;
//        while (true) {
//            tmp = (int) ((Math.random()*45)+1);
//            if(!list.contains/*포함여부를 확인할 때 넣음*/(tmp)) { //존재하지 않으면
//                list.add(tmp);
//            }
//            if(list.size() == 6) break;
//        }
//        System.out.print(list);

        //=================Set을 이용한 방법 ===============
        //java에서 사용하는 집합개념 : 이미 중복값을 허용 안함. 집합에는 중복 없음.
        HashSet<Integer> set = new HashSet<>();
        while (true) {
           int tmp = (int) ((Math.random()*45)+1);
           set.add(tmp);
           if(set.size() == 6) break;
        }
        System.out.print(set);
    }
}
