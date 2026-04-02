import java.util.Stack;
import java.util.HashMap;

class NextGreater{
    public static void main(String args[]){
        int nums[] = {2,1,2,4,3};
        int result[] = new int[nums.length];
        Stack<Integer> st = new Stack<>();


        for(int i=nums.length-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()<=nums[i]){
                st.pop();
            }

             if(st.isEmpty()){
                 result[i] = -1;
             } else {
                 result[i] = st.peek();
             }

            st.push(nums[i]);
        }

        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }
    }
}