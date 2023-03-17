public class MaxWealth {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 2, 1},
                {5, 9, 3}
        };
        System.out.println(MaxWealth(arr));
    }
    static int MaxWealth(int[][] accounts){
        //row = person
        //col = bank
        int ans = Integer.MIN_VALUE;
        for(int person = 0; person < accounts.length; person ++ ){
            //when you start a new col, take a new sum for that row
            int sum = 0;
            for(int bank = 0; bank < accounts[person].length; bank++){
                sum = sum + accounts[person][bank];
            }
            //now we have sum of accounts of that person
            //check with overall ans
            if(sum > ans){
                ans = sum;
            }
        }
        return ans;
    }
}
