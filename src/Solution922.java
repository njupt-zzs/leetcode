public class Solution922 {
    public int[] sortArrayByParityII(int[] A) {
        int j = 1;
        for (int i = 0; i < A.length; i += 2)
            if (A[i] % 2 == 1) {      //奇数
                while (A[j] % 2 == 1)  //在奇数位找偶数
                    j += 2;

                //Swap A[i] and A[j]
                //int tmp = A[i];
                //A[i] = A[j];
                //A[j] = tmp;


                A[i] ^= A[j];
                A[j] ^= A[i];
                A[i] ^= A[j];
            }

        return A;
    }
}
