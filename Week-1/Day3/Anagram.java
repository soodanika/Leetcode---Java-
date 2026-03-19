class Anagram{
    public static void main(String args[]){
        String str = "anagram";
        String str2 = "gramana";

        if(str.length()!=str2.length()){
            System.out.println("Not anagram!");
            return;
        }

        int freq[] = new int[26];

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            freq[ch-'a']++;
        }
        for(int i=0;i<str2.length();i++){
            char ch = str.charAt(i);
            freq[ch-'a']--;
        }

        for(int i=0;i< freq.length;i++){
            if(freq[i]!=0){
                System.out.println("Not anagram!");
                return;
            }
        }
        System.out.println("Anagram!");
    }
}