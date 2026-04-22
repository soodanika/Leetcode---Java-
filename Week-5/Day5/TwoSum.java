import java.util.HashMap;

class TwoSum{
    public static void main(String args[]){
        int nums[] = {2,7,11,15};
        int target = 9;
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int check = target - nums[i];
            if(map.containsKey(check)){
                System.out.println(map.get(check) + " " + i);
                return;
            } else {
                map.put(nums[i],i);
            }
        }
    }
}