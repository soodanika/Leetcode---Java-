import java.util.HashSet;

class LongestCon{
    public static void main(String args[]){
        int nums[] = {0,3,7,2,5,8,4,6,0,1};
        HashSet<Integer> set = new HashSet<>();
        int current = 0;
        int count = 0;
        int max = 0;

        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }

        for(int num : nums){
            if(!set.contains(num-1)){
                current = num;
                count =1;

                while(set.contains(current+1)){
                    current++;
                    count++;
                }
                max = Math.max(max,count);
            }
        }

        System.out.println(max);

    }
}