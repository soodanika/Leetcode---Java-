class Human{
    private int age;
    private String name;

    public void setAge(int a){
        age = a;
    }

    public void setName(String n){
        name = n;
    }
    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }
}

class Encap{
    public static void main(String args[]){
        Human obj = new Human();
//        obj.age = 26;
//        obj.name = "Anika";
        obj.setAge(26);
        obj.setName("Anika");

        System.out.println(obj.getName()+" : "+obj.getAge());
    }
}