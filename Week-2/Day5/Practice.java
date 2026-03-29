class Student{
    int id;
    String name;

    Student(int id, String name){
        this.id = id;
        this.name = name;
    }

    public void show(){
        System.out.println(id);
        System.out.println(name);
    }
}

class Practice{
    public static void main(String args[]){
        Student stu = new Student(123,"Anika");
        stu.show();
    }
}