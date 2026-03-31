class Animal{
    private int age=5;

    public int getAge(){
        return age;
    }
}

class Dog extends Animal{
    public void printAge(){
        System.out.println(getAge());
    }
}

class Inherit2{
    public static void main(String args[]){
        Dog dg = new Dog();
        dg.printAge();
    }
}