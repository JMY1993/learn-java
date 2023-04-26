package recersion;
//汉诺塔
public class Hanoi {
    public static void main(String[] args) {
        Hanoi game = new Hanoi(8);
        game.move(game.dishes, 0, 1, 2);
        game.print();
    }

    private int[][] columns = new int[3][];
    private int steps = 0;
    public int dishes = 0;

    public Hanoi(int n){
        dishes = n;
        for (int i = 0; i < 3; i++) {
            columns[i] = new int[n];
            if (i==0) {
                for (int j = 0; j < n; j++){
                    columns[i][j] = j+1;
                }
            }
        }
    }

    public void print(){
        System.out.printf("==%s steps in total==============\n", steps);
        for (int i = 0; i < columns[0].length; i++) {
            for (int j = 0; j < columns.length; j++){
                System.out.print(columns[j][i]+" ");
            }
            System.out.println();
        }
    }

    public void move(int n, int a, int b, int c) {
    
        if (n == 1) {
            takeTo(a, c);
            return;
        } else {
            move(n-1, a, c, b);
            move(1, a, b, c);
            move(n-1, b, a, c);
        }
    }

    public void takeTo(int from, int to) {
        int fromIndex = 0;
        int toIndex = 0;
        for (int i = 0; i < columns[from].length; i++){
            if (columns[from][i] != 0) {
                fromIndex = i;
                break;
            }
        }

        if (columns[to][dishes-1] == 0) {
            toIndex = dishes-1;
        } else {
            for (int i = 0; i < columns[to].length; i++){
                if (columns[to][i] != 0) {
                    toIndex = i-1;
                    break;
                }
            }
        }

        int dish = columns[from][fromIndex];
        columns[from][fromIndex] = 0;
        columns[to][toIndex] = dish;

        steps++;
    }

}
