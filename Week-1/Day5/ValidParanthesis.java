import java.util.Stack;

class ValidParanthesis{
    public static void main(String args[]){
        String str = "()[";
        Stack<Character> st = new Stack<>();

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch=='(' || ch=='[' || ch=='{'){
                st.push(ch);
            } else {
                if(st.isEmpty()) System.out.println("False");
                if(ch=='(' && st.peek()!=')') System.out.println("False");
                if(ch=='[' && st.peek()!=']') System.out.println("False");
                if(ch=='{' && st.peek()!='}') System.out.println("False");
                st.pop();
            }
        }
        if(st.isEmpty()){
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }
}