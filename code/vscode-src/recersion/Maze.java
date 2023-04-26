package recersion;

/**
 * 老鼠过迷宫
 * 0 未走过的格子
 * 1 障碍物
 * 2 可以走通
 * 3 走过但是走不通
 * 
 * 老鼠寻路策略：下 右 上 左
 */
public class Maze {
    public static void main(String[] args) {
        //initiate the map
        int[][] map = genMap(8, 7);
        for (int j = 0; j<map[0].length; j++) {
            map[0][j] = 1;
            map[map.length-1][j] = 1;
        }
        for (int i = 1; i < map.length-1; i++) {
            map[i][0] = 1;
            map[i][map[i].length-1] = 1;
        }
        map[3][1] = 1;
        map[3][2] = 1;

        System.out.println(findWay(map, 1, 1, 6, 5)?"Succeed!":"Failed.");
        printMap(map);
    }

    static int[][] genMap(int row, int col){
        return new int[row][col];
    }
    
    public static void printMap(int[][] map){
        for (int i=0; i<map.length; i++){
            if (i==0) {
                System.out.print("   ");
                for (int j=0; j<map[i].length; j++){
                    System.out.print(j + " ");
                }
                System.out.println();
                System.out.print("   ");
                for (int j=0; j<map[i].length; j++){
                    System.out.print("--");
                }
                System.out.println();
            }

            for (int j=0; j<map[i].length; j++){
                if (j==0){
                    System.out.print(i+" |");
                }
                System.out.print(map[i][j]+" ");
            }
            System.out.print("\n");
        }
    }

    public static boolean findWay(int[][] map, int row, int col, int desRow, int desCol){
        if (row == desRow && col == desCol){
            map[row][col] = 2;
            return true;
        }
        if (map[row][col] == 0) {
            //assume that the untaken grid is a success grid
            map[row][col] = 2;
            if (findWay(map, row+1, col, desRow, desCol)){
                return true;
            } else if (findWay(map, row, col+1, desRow, desCol)){
                return true;
            } else if (findWay(map, row-1, col, desRow, desCol)){
                return true;
            } else if (findWay(map, row, col-1, desRow, desCol)){
                return true;
            } else {
                map[row][col] = 3;
                return false;
            }
        } else {
            return false;
        }
    }
}
