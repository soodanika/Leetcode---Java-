import java.util.HashSet;

class LargestSubstring{
    public static void main(String args[]){
        String str = "pwwkew";

        HashSet<Character> set = new HashSet<>();
        int left = 0;
        int maxLength=0;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(!set.contains(ch)){
                set.add(ch);
                maxLength = Math.max(maxLength,set.size());
            } else {
                while(set.contains(ch)){
                    set.remove(str.charAt(left));
                    left++;
                }
                set.add(ch);
            }
        }
        System.out.println(maxLength);
    }
}