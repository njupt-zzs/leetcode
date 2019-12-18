public class Solutionbp {
    public int minDeletionSize(String[] A) {
        int count = 0;
        for (int j = 0; j < A[0].length(); j++) {   //j是用来控制字符串的序号的
            char lst = A[0].charAt(j);  //初始化操作
            for (int i = 0; i < A.length; i++) {     //i是用来控制数组序号的，这里编程的具体思想就是保持一个不动，另一个动。
                if (lst > A[i].charAt(j)) {
                    count++;
                    break;
                }
                lst = A[i].charAt(j);
            }
        }
        return count;
    }
}
