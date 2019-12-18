public class Solutionby {

    public String reverseStr(String s, int k) {
        char [] c = s.toCharArray();  //这里是操作地址
        int len = c.length;
        for(int i = 0;i < len; i = i + 2 * k){
            if(i + 2 * k <= len || i + k <= len){
                swap(c,i,i+k-1);
            }else{
                swap(c,i,len-1);
            }

        }
        return new String(c);


    }

    private static void swap(char [] a,int begin,int end){
        while(begin < end){    //这也太秀了！！！
            a[begin] ^= a[end];//这就是不用第三个变量来交换两个变量的方法吗
            a[end] ^= a[begin];
            a[begin] ^= a[end];
            begin++;
            end--;
        }
    }
}
