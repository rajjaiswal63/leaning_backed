package javaBasics.learningJava.streams.intermidiate;

public class Book {
    String category;
    double price;
    int publicationYear;
    String tittle;

    public Book(String category, double price, int publicationYear, String tittle) {
        this.category = category;
        this.price = price;
        this.publicationYear = publicationYear;
        this.tittle = tittle;
    }

    @Override
    public String toString() {
        return "Book{" +
                "category='" + category + '\'' +
                ", price=" + price +
                ", publicationYear=" + publicationYear +
                ", tittle='" + tittle + '\'' +
                '}';
    }
}
