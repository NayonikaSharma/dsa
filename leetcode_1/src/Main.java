public class Main {
    public static void main(String[] args){
        int[] gain = {-5,1,5,0,-7};
        int[] output={0,-5,-4,1,1,-6};
        int add = 0;
        int[] gain2 = new int[gain.length+1];
        gain2[0]=0;
        for(int i=1;i<gain2.length;i++){
            for(int j:gain){
                add=add+i;
                gain2[i-1]=add;
            }


        }
        int max=gain[0];
        for(int i:gain2){
            if(i>max){
                max=i;
            }
        }
        System.out.println(max);




    }

}