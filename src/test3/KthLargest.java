package test3;

import java.util.Arrays;
import java.util.PriorityQueue;

public class KthLargest {

    public int kthLargest(int[] array, int large){
        Arrays.sort(array);
        return array[array.length-large];
    }
    
    public int heapKth(int num[], int large){
        PriorityQueue<Integer>  pr = new PriorityQueue<>(large);
        for (int i : num){
            pr.offer(i);
            if(pr.size()>large){
                pr.poll();
            }
        }
        return pr.peek();
        
    }
}
