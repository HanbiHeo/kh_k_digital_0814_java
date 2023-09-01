package 스택기본;

import java.util.Stack;

//0901
//Stack은 제일 나중에 들어 온 값이 가장 먼저 빠져나가는 구조
public class StackBasic {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.peek()); // 맨 위의 값을 확인하는 코드 (3)
        System.out.println(stack.pop()); // 맨 나중에 들어온 값을 꺼내오는 코드(3)
        System.out.println(stack.empty()); // 현재 스택이 비어있는지 확인
        System.out.println(stack.size()); // 스택 내에서 몇개의 데이터가 있는지 확인
        System.out.println(stack.contains(1)); //해당(매개변수)값이 스택내에 존재하는지 확인.
    }
}
