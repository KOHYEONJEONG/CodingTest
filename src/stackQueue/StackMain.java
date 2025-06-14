package stackQueue;

import java.util.Stack;

public class StackMain {

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        // 삽입 5 - 삽입 2 - 삽입 3 - 삽입 7 - 삭제() - 삽입 1 - 삽입 4 - 삭제()

        s.push(5);
        s.push(2);
        s.push(3);
        s.push(7);
        s.pop();
        s.push(1);
        s.push(4);
        s.pop();

        //스탭의 최상단 원소부터 출력(최상단 출력 시 peek() 사용)
        while (!s.empty()){
            System.out.println(s.peek() + " ");
            s.pop();
        }

    }
}
