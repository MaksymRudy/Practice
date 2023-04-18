package library;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        Map<Author, Set<Book>> authorToBooks = new HashMap<>();
        Author joshuaBloch = new Author("Joshua Bloch");//створив екземпляр класа автор
        out.println(joshuaBloch.getName());

        Book effectiveJava = new Book("Effective java");// створив інстанс/екземпляр класа книги
        Set<Book> books = new HashSet<>();
        books.add(effectiveJava);
        books.add(new Book("Java Puzzlers: Traps, Pitfalls, and Corner Cases"));
        authorToBooks.put(joshuaBloch, books);

        Set<Book> bookSet = authorToBooks.get(joshuaBloch);
        out.println(bookSet);
    }
}
