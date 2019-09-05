import java.util.PriorityQueue;

public class Page309PriorityQueueTest {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();

        pq.offer(6);
        pq.offer(-3);
        pq.offer(20);
        pq.offer(18);

        System.out.println(pq);



        System.out.println(pq.poll());

        System.out.println("=========");
        System.out.println(pq);

    }
}
