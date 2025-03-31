package list1;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx01 {
    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<String>();
        queue.add("홍길동");
        queue.add("임꺽정");
        queue.add("장길산");

        System.out.println(queue);
        System.out.println(queue.size());

        System.out.println(queue.poll());

        System.out.println(queue.size());
    }
}
