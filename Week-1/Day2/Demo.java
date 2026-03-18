import java.util.HashSet;

class Demo{
    public static void main(String args[]){
        HashSet<Integer> abcset = new HashSet<>();
        abcset.add(1);
        abcset.add(2);
        abcset.add(1);

        System.out.println(abcset);
        System.out.println(abcset.contains(3));
    }
}