import java.util.Arrays;
public class SearchIn2D {
    public static void main(String[] args) {
        int[][] arr = {
                {23, 1, 54},
                {17, 90, -32},
                {59, -65, 2, 0},
                {17, 8}
        };
        int key = 65;
        int[] ans = search(arr, key);
        System.out.println(Arrays.toString(ans));
        System.out.println(max(arr));
        System.out.println(min(arr));
    }
    static int[] search(int[][] arr, int key){
        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                if(arr[row][col] == key){
                    return new int[]{row, col}; // V IMP LINE!!!!
                }
            }
        }

        return new int[]{-1, -1}; //since this array has not been declared anywhere, you will have to add the 'new int[]' bit.
        //will have to thus create an object using a new keyword.
    }
    static int max(int[][] arr){
        int max = Integer.MIN_VALUE;
        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                if(arr[row][col] > max){
                    max = arr[row][col];
                }
            }
        }

        return max;
    }
    static int min(int[][] arr){
        int min = Integer.MAX_VALUE;
        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                if(arr[row][col] < min){
                    min = arr[row][col];
                }
            }
        }

        return min;
    }
}
