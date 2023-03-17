import java.util.Arrays;

public class BinarySearch2D {
    public static void main(String[] args) {
        //matrix is sorted col wise and row wise
        int[][] arr = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {23, 29, 37, 49},
                {31, 33, 39, 50},
        };
        int target = 0;
        System.out.println(Arrays.toString(search(arr, target)));

    }
    static int[] search(int[][] matrix, int target){
        int row = 0;
        int col = matrix.length - 1;

        while (row < matrix.length && col >= 0){
            if (matrix[row][col] == target){
                return new int[] {row, col};
            }
            if (matrix[row][col] < target){
                row ++;
            }
            else{
                col --;
            }
        }
        return new int[] {-1, -1};
    }
}