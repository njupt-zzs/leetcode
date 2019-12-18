public class Solution744 {
    public char nextGreatestLetter(char[] letters, char target) {
        if (letters[0] > target || letters[letters.length - 1] <= target)
            return letters[0];
        int left = 1, right = letters.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (letters[mid] <= target)
                left = mid + 1;
            else {
                if (letters[mid - 1] <= target)
                    return letters[mid];
                else right = mid - 1;
            }
        }
        return ' ';  //返回一个空字符

    }
}
