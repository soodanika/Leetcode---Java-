class Animal{
    public void walk(){
        System.out.println("Walking");
    }
}

class Dog extends Animal{
    public void bark(){
        System.out.println("Barking");
    }
}

class Inherit{
    public static void main(String args[]){
        Dog dg = new Dog();
        dg.walk();
        dg.bark();
    }
}