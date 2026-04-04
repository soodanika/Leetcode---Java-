import java.util.*;
class Practice{
    public static void main(String args[]){
        String str = "Anika";
        str = String.join(" ",str,"Sood");
        String str1[] = str.split("");
        for(int i=0;i<str1.length;i++){
            System.out.print(str1[i]+" ");
        }
        char a = '1';
        System.out.println(str);
        System.out.println(((int)a)-'0');
        System.out.println(Character.getNumericValue(a));
    }
}