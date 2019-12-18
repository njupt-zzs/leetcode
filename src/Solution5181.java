/**
 * Created by zzs on 2019/9/8 10:32
 */
public class Solution5181 {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int len = distance.length - 1;
        int sum1 = 0;
        int sum2 = 0;
        if (start == destination)return 0;
        else if (start < destination){
            for (int i = start; i < destination; i++) {
                sum1 += distance[i];
            }

            for (int i = len; i >= destination; i--) {
                sum2 += distance[i];
            }

            for (int i = 0; i < start; i++) {
                sum2 += distance[i];
            }
            return sum1 <= sum2 ? sum1 : sum2;
        }

        else {
            for (int i = destination; i < start; i++) {
                sum1 += distance[i];
            }

            for (int i = len; i >= start; i--) {
                sum2 += distance[i];
            }

            for (int i = 0; i < destination; i++) {
                sum2 += distance[i];
            }
            return sum1 <= sum2 ? sum1 : sum2;
        }
    }
}
