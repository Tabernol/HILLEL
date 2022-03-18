package MyLibrary.Library;

import java.util.Arrays;

public class Run {
    public static void main(String[] args) {

       AuthorBook au = new AuthorBook("rid");
     Books b = new Books();
       b.setAuthorBook(au);
        System.out.println(au.getAuthor());




    }
}
