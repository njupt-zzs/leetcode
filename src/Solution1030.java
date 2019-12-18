import java.util.Arrays;
import java.util.Comparator;

public class Solution1030 {
    public int[][] allCellsDistOrder(int R, int C, int r0, int c0) {
        int[][] res = new int[R*C][2];
        int index = 0;
        for(int i = 0 ; i < R ; i ++)
            for(int j = 0 ; j < C ; j ++) {
                int[] xy = {i,j};
                res[index++] = xy;
            }
        Arrays.sort(res, new Comparator<int []>() {   //匿名内部类
            @Override
            public int compare(int[] o1, int[] o2) {
                int dis1 = Math.abs(o1[0]-r0)+Math.abs(o1[1]-c0);
                int dis2 = Math.abs(o2[0]-r0)+Math.abs(o2[1]-c0);
                int dis3 = dist(o1);   //可以啊，卧槽！！！
                return dis1 - dis2;
            }
        });


        return res;
    }

    private int dist(int[] point) {
        return point[0] * point[0] + point[1] * point[1];
    }


}
