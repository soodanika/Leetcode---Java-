import java.util.Stack;

class ValidParanthesis{
    public static void main(String args[]){
        String s = "()[]{}";

        Stack<Character> st = new Stack<>();

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='('||ch=='['||ch=='{'){
                st.push(ch);
            } else if(ch==')'||ch==']'||ch=='}'){
                if(st.isEmpty()){
                    System.out.println("False");
                    return;
                }
                if(ch==')' && st.peek()!='(') {
                    System.out.println("False");
                    return;
                }
                if(ch==']' && st.peek()!='['){
                    System.out.println("False");
                    return;
                }
                if(ch=='}' && st.peek()!='{'){
                    System.out.println("False");
                    return;
                }
                st.pop();
            }
        }
        if(st.isEmpty()){
            System.out.println("True");
            return;
        } else{
            System.out.println("False");
            return;
        }
    }
}