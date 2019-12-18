
public class Solutionba {
    public boolean judgeCircle(String moves) {
        // 如果走的步数为奇数,肯定回不到原点
        int left = 0;
        int down = 0;
        char[] array = moves.toCharArray();
        for (char move : array) {
            switch (move) {
                case 'U':
                    down--;
                    break;
                case 'D':
                    down++;
                    break;
                case 'L':
                    left--;
                    break;
                case 'R':
                    left++;
                    break;
            }
        }
        return (left == 0 && down == 0);

    }
}
