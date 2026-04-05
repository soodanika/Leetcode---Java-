import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Arrays;

class TopK{
    public static void main(String args[]){
        int nums[] = {1,1,1,2,2,3};
        int k = 2;

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        PriorityQueue<Integer> heap = new PriorityQueue<>(
                (a,b)-> map.get(a)-map.get(b)
        );

        for(int key :map.keySet()){
            heap.add(key);
            if(heap.size()>k){
                heap.poll();
            }
        }

        int result[] = new int[k];

        for(int i=k-1;i>=0;i--){
            result[i] = heap.poll();
        }

        System.out.println(Arrays.toString(result));

    }
}