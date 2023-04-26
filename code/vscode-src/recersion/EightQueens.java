package recersion;
/**
 * 八皇后
 * queens数组的下标代表row，存储的数据代表col
 */
public class EightQueens {
    private int max = 0;
    private int[] queens;
    public int count = 0;
    public static void main(String[] args) {
        EightQueens checkboard = new EightQueens();
        checkboard.check(0, 0);
        System.out.println("There are "+checkboard.count+" methods found!");
        checkboard.printCheckboard();
    }
    public EightQueens(int max){
        this.max = max;
        queens = new int[max];
    }
    public EightQueens(){
        this(8);
    }

    public void printCheckboard(){
        for (int i = 0; i < 8; i++){
            if (i==0) {
                System.out.print("\n");
                System.out.print("       ");
                for (int j=0; j<8; j++){
                    System.out.print(j+1 + " ");
                }
                System.out.println();
                System.out.print("       ");
                for (int j=0; j<8; j++){
                    System.out.print("--");
                }
                System.out.println();
            }
            for (int j = 0; j < 8; j++){
                if (j==0){
                    System.out.print(queens[i]+1 + " > ");
                    System.out.print(i+1 +" |");
                }
                if (queens[i] == j){
                    System.out.print("*" + " ");
                } else {
                    System.out.print("0" + " ");
                }
            }
            System.out.println();
        }
    }

    public void printQueens(){
        for (int i = 0; i < queens.length; i++){
            System.out.print(queens[i]+ " ");
        }
        System.out.println();
        count++;
    }

    public void check(int n, int col){
        if (n == max){
            printQueens();
            return;
        }
        queens[n] = col;

        if (judge(n)){
            check( n + 1, 0 );
        }
        if ( col != max-1 ) {
            check( n, col+1 );
        }
    }

    public boolean judge(int n) {
        for (int i = 0; i < n; i++) {
            if (queens[i] == queens[n] ||
                Math.abs(queens[i]-queens[n]) == Math.abs(i - n)){
                    return false;
                }
        }
        return true;

    }
}
