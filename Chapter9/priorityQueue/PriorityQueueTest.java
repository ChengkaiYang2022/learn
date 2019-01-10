package Chapter9.priorityQueue;

import java.util.*;
import java.time.*;

/**
 *  This programme demonstrate the use of a priority queue.
 * @author yangchengkai
 *
 */
public class PriorityQueueTest
{
    public static void main(String[] args)
    {
        PriorityQueue<LocalDate> pq = new PriorityQueue<>();
        pq.add(LocalDate.of(1906,12,9));
        pq.add(LocalDate.of(1815,12,10));
        pq.add(LocalDate.of(1903,12,3));
        pq.add(LocalDate.of(1910,6,22));

        System.out.println("Iterating over elements");
        for (LocalDate date:pq){
            System.out.println(date);
        }
        System.out.println("Remove Queue...");
        while(!pq.isEmpty()){
            System.out.println(pq.remove());
        }
    }
}