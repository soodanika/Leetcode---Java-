class Test {
    static int x = 10;
    int y = 20;

    static void show(Test t1) {
       System.out.println(x);
//       Test t1 = new Test();
       System.out.println(t1.y);
    }
}

class Practice{
    public static void main(String args[]){
        Test t = new Test();
//        t.show();
        Test.show(t);
    }
}