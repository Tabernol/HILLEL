package MyLibrary.Library;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Books extends Library {
    private AuthorBook authorBook;
    private NameBook nameBook;
    private int idBook = 0;

    public AuthorBook getAuthorBook() {
        return authorBook;
    }

    public void setAuthorBook(AuthorBook authorBook) {
        this.authorBook = authorBook;
    }

    public NameBook getNameBook() {
        return nameBook;
    }

    public void setNameBook(NameBook nameBook) {
        this.nameBook = nameBook;
    }

    public Books createBook(String author, String nameBook) {
        Books b = new Books();
        AuthorBook au = new AuthorBook(author);
        b.setAuthorBook(au);
        b.setNameBook(new NameBook(nameBook));
        return b;
    }

//    public void putInLibrary(Books books) {
//        if (idBook >= bookArray.length) {
//            Books[] b = new Books[bookArray.length + 10];
//            for (int i = 0; i < bookArray.length; i++) {
//                b[i] = bookArray[i];
//            }
//            bookArray = b;
//        }
//        bookArray[idBook] = books;
//        idBook++;
//    }
//
  
  




}