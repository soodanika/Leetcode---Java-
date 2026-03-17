class Palindrome{
    public static void main(String args[]){
        String str = "A man, a plan, a canal: Panama";
        str = str.toLowerCase().replace(",","").replace(":","").replace(" ","");
        int j = str.length()-1;
        for(int i=0;i<=str.length()/2;i++){
                if(str.charAt(i)!=str.charAt(j)){
                    System.out.println("Not Palindrome");
                    return;
                }
            j--;
        }
        System.out.println("Palindrome");
    }
}