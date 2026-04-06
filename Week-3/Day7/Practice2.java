class Rectangle{
    private int length;
    private int breadth;
    private int area;
    private int perimeter;

    Rectangle(int length,int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public void calcArea(){
        this.area = this.length*this.breadth;
    }

    public void calcPeri(){
        this.perimeter = 2*(this.length+this.breadth);
    }

    public String toString(){
        return String.format("length - %d, breadth - %d, area - %d, perimeter - %d",length,breadth,area,perimeter);
    }
}

class Practice2{
    public static void main(String args[]){
        Rectangle rec = new Rectangle(5,4);
        rec.calcArea();
        rec.calcPeri();
        System.out.println(rec);
    }
}