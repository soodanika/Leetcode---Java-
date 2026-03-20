import java.util.HashSet;

class Duplicate2{
    public static void main(String args[]){
        int nums[] = {1,2,3,1,2,3};
        int k = 2;
        HashSet<Integer> set = new HashSet<>();

        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                System.out.println("True");
                return;
            } else{
                set.add(nums[i]);
            }
            if(set.size()>k){
                set.remove(nums[i-k]);
            }
        }
        System.out.println("False");
    }
}