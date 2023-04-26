//冒泡排序
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {20, -1, 89, 2, 890, 7, 30};
        
        for (int i = 0; i < arr.length-1; i++){
            boolean swap_flag = false;
            for (int j = 0; j < arr.length-1-i; j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap_flag = true;
                }
            }
            if (!swap_flag) break;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
    }
}
