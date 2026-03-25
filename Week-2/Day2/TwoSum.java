import java.util.HashMap;

class TwoSum{
    public static void main(String args[]){
        int arr[] = {2,4,7,8,9};
        int target = 15;

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            map.put(arr[i],i);
        }

        for(int i=0;i<arr.length;i++){
            int check = target - arr[i];
            if(map.containsKey(check) && map.get(check)!=i){
                System.out.println(i);
                System.out.println(map.get(check));
                return;
            }
        }
    }
}