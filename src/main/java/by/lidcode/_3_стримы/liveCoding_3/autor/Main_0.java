package by.lidcode._3_стримы.liveCoding_3.autor;

import java.util.List;
import java.util.stream.Stream;

public class Main_0 {
    public static void main(String[] args) {
            Book jamesBond = new Book("James Bond", 2001);
            Book jamesBond2 = new Book("James Bond2", 2003);
            Book jamesBond3 = new Book("James Bond3", 2008);
            Book jamesBond4 = new Book("James Bond4", 2011);
            Author author1 = new Author("Ian Fleming", List.of(jamesBond, jamesBond2, jamesBond3, jamesBond4));

            Book garryPotter = new Book("Garry Potter", 2001);
            Book garryPotter2 = new Book("Garry Potter2", 2003);
            Book garryPotter3 = new Book("Garry Potter3", 2008);
            Book garryPotter4 = new Book("Garry Potter4", 2011);
            Author author2 = new Author("Joanne Rowling", List.of(garryPotter, garryPotter2, garryPotter3, garryPotter4));

            Stream.of(author1, author2)
                    // вывести список названий книг авторов написанных после 2005
                    . flatMap(s->s.getBooks().stream())
                    .filter(s->s.getYear()>2005)
                    .map(Book::getName)
                    .forEach(System.out::println);
    }
}
