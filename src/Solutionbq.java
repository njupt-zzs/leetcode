import java.util.Arrays;

public class Solutionbq {
    public int lastStoneWeight(int[] stones) {
        int weight = 0;
        for(int i=0;i<stones.length-1;i++){
            Arrays.sort(stones);
            weight = stones[stones.length-1] - stones[stones.length-2];
            stones[stones.length-2] = 0;          //每次都跑到最前面去
            stones[stones.length-1] = weight;
        }
        return stones[stones.length-1];
    }
}
