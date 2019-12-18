import java.util.*;

public class Solution347 {
    public List<Integer> topKFrequent(int[] nums, int k) {
        // 使用字典，统计每个元素出现的次数，元素为键，元素出现的次数为值
        HashMap<Integer,Integer> map = new HashMap();  //利用HashMap统计词频
        for(int num : nums){
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        // 遍历map，用最小堆保存频率最大的k个元素
        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {  //自定义比较器
            @Override
            public int compare(Integer a, Integer b) {
                return map.get(a) - map.get(b);        //这里建的还是最小堆，要看清楚本质
            }
        });
        for (Integer key : map.keySet()) {
            if (pq.size() < k) {
                pq.add(key);     //小顶堆里放的是值，不是词频    if (comparator.compare(x, (E) e) >= 0)  break;  在这里x是新增的值，而e为父节点的值   大于不用交换，小于就是需要交换
            } else if (map.get(key) > map.get(pq.peek())) {    //根节点是最小值
                pq.poll();
                pq.add(key);
            }
        }
        // 取出最小堆中的元素
        List<Integer> res = new ArrayList<>();
        while (pq.peek() != null) {
            res.add(pq.poll());
        }
        return res;
    }
}
