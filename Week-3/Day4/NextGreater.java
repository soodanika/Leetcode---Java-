import java.util.Stack;

class NextGreater{
    public static void main(String args[]){
        int nums[] = {1,2,3,4};
        int result[] = new int[nums.length];
        Stack<Integer> st = new Stack<>();

        for(int i= nums.length-1;i>=0;i--){

            while(!st.isEmpty() && st.peek()<nums[i]){
                st.pop();
            }

            if(!st.isEmpty()){
                result[i] = st.peek();
            } else {
                result[i] = -1;
            }
            st.push(nums[i]);
        }

        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+", ");
        }

    }
}