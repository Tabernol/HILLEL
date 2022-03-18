package MyLibrary.Library;

public class AuthorBook extends Books{
    private String author;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public AuthorBook(String author) {
        this.author = author;
    }
}
