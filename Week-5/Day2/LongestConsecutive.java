import java.util.HashSet;

class LongestConsecutive{
    public static void main(String args[]){
        int nums[] = {100,4,200,1,3,2};
        HashSet<Integer> set = new HashSet<>();
        int count =0;
        int max = 0;
        int start = 0;
        
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        
        for(int num : set){
            if(!set.contains(num-1)){
                start = num;
                count = 1;
            }
            
            while(set.contains(start+1)){
                count++;
                start++;
            }
            
            max = Math.max(max,count);
        }
        System.out.println(max);
    }
}