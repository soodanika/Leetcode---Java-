import java.util.HashMap;

class Majority{
    public static void main(String args[]){
        int nums[] = {2,2,1,1,1,2,2};
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);

            if(map.get(nums[i])>nums.length/2){
                System.out.println(nums[i]);
                return;
            }
        }

    }
}