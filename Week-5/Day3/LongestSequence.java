import java.util.HashSet;

class LongestSequence{
    public static void main(String args[]){
        String s= "pwwkew";
        HashSet<Character> set = new HashSet<>();
        int j=0;
        int max = 0;
        
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(set.contains(ch)){
                while(set.contains(ch)){
                    set.remove(s.charAt(j));
                    j++;
                }
            }
            set.add(ch);
            max = Math.max(max,set.size());
        }
        System.out.println(max);
    }
}