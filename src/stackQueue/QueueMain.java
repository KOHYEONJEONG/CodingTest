package stackQueue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueMain {

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        // 삽입 5 - 삽입 2 - 삽입 3 - 삽입 7 - 삭제() - 삽입 1 - 삽입 4 - 삭제()
        q.offer(5);//왼쪽으로 들어와 오른쪽 방향으로 쌓임
        q.offer(2);
        q.offer(3);
        q.offer(7);
        q.poll();// 왼쪽부터 나감
        q.offer(1);
        q.offer(4);
        q.poll();// 왼쪽부터 나감

        // 먼저 들어온 원소부터 추출
        while (!q.isEmpty()){
            System.out.print(q.poll() + " ");// 3 7 1 4
        }

    }
}
