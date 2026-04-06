import java.util.ArrayList;

class Book{
    private int id;
    private String name;
    private String author;
    public ArrayList<Reviews> reviews = new ArrayList<>();

    public Book(int id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    public void addReview(Reviews review){
        this.reviews.add(review);
    }

    public String toString(){
        return String.format("id- %d, name- %s, author- %s, review- [%s]",id, name,author, reviews);
    }
}

class Practice3{
    public static void main(String args[]){
    Book bk = new Book(1,"Biology","Anika Sood");
    bk.addReview(new Reviews(10,"This book gives good knowledge of biology concepts.",5));

    System.out.println(bk);
    }
}