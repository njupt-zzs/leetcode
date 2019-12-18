public class Solutiong {   //二分查找 ，我自己方法就只能查找，并不能进行比较
    public int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while(left <= right) {
            int mid = (left + right) / 2;  // 取整
            if(nums[mid] == target) {
                return mid;
            } else if(nums[mid] < target) {  //nums[mid] 已经比较过了
                left = mid + 1;   //这里进行加1了
            } else {
                right = mid - 1;
            }
        }
        return left;   //靠左法
    }
}


