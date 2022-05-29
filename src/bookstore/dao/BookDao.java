package bookstore.dao;

import bookstore.dao.entity.Book;

import java.sql.SQLException;
import java.util.List;

public interface BookDao {// CRUD репозиторий

    List<Book> getAllBooks() throws SQLException;
    Book getBookById(Long id) throws SQLException;

    Book createBook(Book book) throws Exception; // передаем книгу в базу данных и создаем строку с ее данными

    Book updateBook(Book book) throws SQLException;// замена инфы передаваемой книги и возврат измененных значений

    boolean deleteBook(Long id) throws SQLException;// передача в бд книги ее поиск и дальнейшая пометка удалена

    Book getBookByIsbn(String isbn) throws SQLException;

    List<Book> getBookByAuthor(String author) throws SQLException;

    int countAllBooks() throws SQLException;
}
