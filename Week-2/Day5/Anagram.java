import java.util.HashMap;

class Anagram{
    public static void main(String args[]){
        String s = "anagram";
        String t = "gramana";

        HashMap<Character, Integer> map = new HashMap<>();

        if(s.length()!=t.length()){
            System.out.println("False");
            return;
        }

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            } else {
                map.put(ch,1);
            }
        }

        for(int i=0;i<t.length();i++){
            char ch = t.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)-1);
            } else {
                System.out.println("False");
                return;
            }
        }

        for(int val : map.values()){
            if(val!=0) System.out.println("False");
        }
        System.out.println("True");
    }
}