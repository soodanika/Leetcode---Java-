import java.util.HashSet;

class LongestSubString{
    public static void main(String args[]){
        String str = "pwwkew";
        int j = 0;
        int maxLength = 0;

        HashSet<Character> set = new HashSet<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(set.contains(ch)){
                set.remove(str.charAt(j));
                j++;
            }
            set.add(ch);
            maxLength = Math.max(maxLength,set.size());
        }
        System.out.println(maxLength);
    }
}