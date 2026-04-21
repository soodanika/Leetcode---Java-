import java.util.HashMap;

class SubarrayK{
    public static void main(String args[]){
        int k = 3;
        int nums[] = {1,1,1};

        HashMap<Integer,Integer> map = new HashMap<>();
        int currentSum = 0;
        int count = 0;
        map.put(0,1);

        for(int num: nums){
            currentSum += num;
           int check = currentSum - k;

            if(map.containsKey(check)){
                count = count+map.get(check);
            }
            
            if(map.containsKey(currentSum)){
                map.put(currentSum, map.get(currentSum)+1);
            } else{
                map.put(currentSum,1);
            }
        }
        System.out.println(count);
    }
}