package cl.projects.cbarros.funcional.v12_collect;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        new Main();
    }

    public Main() {

        List<Book> myBooks = Arrays.asList(
                new Book("345-89","Sufriendo a Pedro", 2018, Genre.TERROR),
                new Book("923-45","Los papeles por delante", 1998, Genre.THRILLER),
                new Book("978-25","La vida de Baldomero", 2017, Genre.COMEDY),
                new Book("923-45","Los papeles por delante", 1998, Genre.THRILLER),
                new Book("978-25","La vida de Baldomero", 2018, Genre.COMEDY)
        );
        Map<Genre, Long> results = myBooks.stream()
                .collect(Collectors.groupingBy(Book::getGenre,
                        Collectors.filtering(book -> book.getYearOfPublication() >= 2000, Collectors.counting())));
        System.out.println(results);
    }
}
