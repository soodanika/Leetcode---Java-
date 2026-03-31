import java.util.HashMap;
import java.util.*;

class Groupanagram{
    public static void main(String args[]){
        String str[] = {"tea","eat","ate","tan","nat","bat"};
        HashMap<String,List<String>> map = new HashMap<>();

        for(int i=0;i<str.length;i++){
            String word = str[i];
            char arr[] = word.toCharArray();
            Arrays.sort(arr);
            String sorted = new String(arr);

            if(!map.containsKey(sorted)){
                List<String> list = new ArrayList<>();
                list.add(word);
                map.put(sorted,list);
            } else {
                map.get(sorted).add(word);
            }
        }
            System.out.println(map.values());
    }
}