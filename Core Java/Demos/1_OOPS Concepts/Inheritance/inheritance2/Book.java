package inheritance.product.dbapp;

public class Book extends Product {

    private String author;

    public Book() {
        super();
        author = "";
        count++;// count =count+1
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return super.toString() + " by " + author;
    }
}