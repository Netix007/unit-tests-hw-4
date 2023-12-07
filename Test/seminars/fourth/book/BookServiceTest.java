package seminars.fourth.book;


import org.junit.jupiter.api.Test;

import java.util.*;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class BookServiceTest {
    @Test
    void findBookByIdTest() {
        Book book = new Book("1", "Book1", "Author1");

        BookRepository bookRepository = mock(BookRepository.class);
        BookService bookService = new BookService(bookRepository);
        when(bookRepository.findById("1")).thenReturn(book);

        Book result = bookService.findBookById("1");

        assertThat(result).isEqualTo(book);
    }

    @Test
    void findAllBooksTest() {
        Map<String, Book> books = new HashMap<>();
        books.put("1", new Book("1", "Book1", "Author1"));
        books.put("2", new Book("2", "Book2", "Author2"));

        BookRepository bookRepository = mock(BookRepository.class);
        BookService bookService = new BookService(bookRepository);
        when(bookRepository.findAll()).thenReturn(new ArrayList<>(books.values()));

        List<Book> result = bookService.findAllBooks();

        assertThat(result).isEqualTo(new ArrayList<>(books.values()));

    }
}