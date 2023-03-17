public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {99, 87, 65, 59, 44, 30, 23, 12, -4, -17, -87};
        int key = 12;
        System.out.println(orderAgnosticBS(arr, key));

    }

    static int orderAgnosticBS(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;

        //find whether arr is ascending or descending
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (key == arr[mid]) {
                return mid;
            }

            if (isAsc) {
                if (key < arr[mid]) {
                    end = mid - 1;
                } else if (key > arr[mid]) {
                    start = mid + 1;
                }

            } else {
                if (key > arr[mid]) {
                    end = mid - 1;
                } else if (key < arr[mid]) {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}

