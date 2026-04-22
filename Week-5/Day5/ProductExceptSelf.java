import java.util.Arrays;

class ProductExceptSelf{
    public static void main(String args[]){
        int nums[] = {1,2,3,4};

        int LP=1;
        int RP =1;
        int finalarr[] = new int[nums.length];

        for(int i=0;i<nums.length;i++){
            finalarr[i] = LP;
            LP = LP*nums[i];
        }

        for(int i=nums.length-1;i>=0;i--){
            finalarr[i] = finalarr[i]*RP;
            RP = nums[i]*RP;
        }
        System.out.println(Arrays.toString(finalarr));
    }
}