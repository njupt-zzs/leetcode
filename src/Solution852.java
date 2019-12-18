/**
 * Created by zzs on 2019/9/7 9:00
 */
public class Solution852 {
    public int peakIndexInMountainArray(int[] A) {
        int left = 0, right = A.length - 1;
        int mid = left + (right - left) / 2;
        while (left < right){
            if (A[mid] > A[mid+1])
                right = mid;
            else
                left = mid + 1;
        }
        return left;
    }

    public int findPeakElement(int[] A) {
        int l = 0, r = A.length - 1;
        int m;
        while (l < r) {
            m = l + (r - l) / 2;
            if (A[m] > A[m+1])
                r = m;
            else
                l = m + 1;
        }
        return l;
    }

}
