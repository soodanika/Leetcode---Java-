import java.util.HashMap;

class TwoSum{
    public static void main(String args[]){
        int nums[] = {1,2,3,4};
        int target = 6;

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
            int check = target - nums[i];

            if(map.containsKey(check) && i!=map.get(check)){
                System.out.println(i);
                System.out.println(map.get(check));
                return;
            }
        }
    }
}