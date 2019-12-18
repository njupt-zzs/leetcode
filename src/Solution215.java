import java.util.PriorityQueue;
import java.util.Queue;

public class Solution215 {
    public int findKthLargest(int[] nums, int k) {
        Queue<Integer> heap = new PriorityQueue<>();
        for (int num : nums){
            if (heap.size() < k)
                heap.add(num);
            else if (num > heap.peek()){
                heap.poll();
                heap.add(num);
            }
        }
        return heap.peek();
    }
}
