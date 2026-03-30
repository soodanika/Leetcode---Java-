class ProductArray{
    public static void main(String args[]){
        int nums[] ={1,2,3,4};
        int arr[] = new int[nums.length];

        int LP = 1;
        int RP = 1;

        for(int i=0;i<nums.length;i++){
            arr[i] = LP;
            LP = LP*nums[i];
        }

        for(int i = nums.length-1;i>=0;i--){
            arr[i] = arr[i]*RP;
            RP = RP * nums[i];
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}