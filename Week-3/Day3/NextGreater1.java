import java.util.Stack;
import java.util.HashMap;

class NextGreater1{
    public static void main(String args[]){
        int nums1[] = {4,1,2};
        int nums2[] = {1,3,4,2};
        Stack<Integer> st = new Stack<>();
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=nums2.length-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()<nums2[i]){
                st.pop();
                map.put(nums2[i],-1);
            }

            if(st.isEmpty()){
                map.put(nums2[i],-1);
            } else {
                map.put(nums2[i],st.peek());
            }
            st.push(nums2[i]);
        }

        for(int i=0;i<nums1.length;i++){
            System.out.print(map.get(nums1[i])+" ");
        }


    }
}