/**
 * 猴子吃桃问题：
 * 有一堆桃子，猴子第一天吃了其中一半，并且再多吃了一个
 * 以后每天都保持这样的节奏，到达第十天的时候，想在吃的时候（还没有吃）发现只有一个桃子了。
 * 问最初一共有几个桃子？
 * 
 * 思路：
 * 写函数算出每天没吃桃之前的桃子数量
 */

package recersion;

import java.util.Scanner;

public class GreedyMonkey {
    public static void main(String[] args) {
        while(true) {
            System.out.print("Enter days:");
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            in.close();

            System.out.println(vomitTail(n));
        }
        
    }

    public static int vomit(int n) {
        if (n == 1) {
            return 1;
        }
        return ( vomit(n-1) + 1 ) * 2;
    }

    public static int vomitTail(int n) {
        return vomitIter(1, n);
    }
    public static int vomitIter(int nPeach, int n) {
        if ( n == 1) {
            return nPeach;
        } else {
            return vomitIter((nPeach + 1) * 2, n-1);
        }
    }
}
