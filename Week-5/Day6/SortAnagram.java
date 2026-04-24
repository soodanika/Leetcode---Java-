import java.util.HashMap;

class SortAnagram{
    public static void main(String args[]){
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        HashMap<String,List<String>> map = new HahsMap<>();

        for(int i=0;i<strs.length;i++){
            String word = strs[i];

            char[] arr = word.toCharArray();
            Array.sort(arr);
            String sorted = new String(arr);

            if(!map.contains(sorted)){
                List<String> list = new ArrayList<>();
                list.add(word);
                map.put(sorted,list);
            } else {
                map.get(sorted).add(word);
            }
        }
    }
}