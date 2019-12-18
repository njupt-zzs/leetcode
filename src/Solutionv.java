import java.util.ArrayList;
import java.util.List;

public class Solutionv {
    //杨辉三角
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<List<Integer>>();
        if (numRows == 0) {
            return triangle;
        }
        triangle.add(new ArrayList<>());
        triangle.get(0).add(1);
        for (int rowNum = 1; rowNum < numRows; rowNum++) {
            int val = rowNum + 1;
            List<Integer> row = new ArrayList<>(val);  //  这里并没有考虑扩容的问题。。。。
            List<Integer> prevRow = triangle.get(rowNum-1);
            row.add(1);
            for (int j = 1; j < rowNum; j++) {
                row.add(prevRow.get(j-1) + prevRow.get(j));
            }
            row.add(1);         //去了解一下ArrayList的源码
            triangle.add(row);
        }
        return triangle;

    }
}
