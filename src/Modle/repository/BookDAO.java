package Modle.repository;

import Common.StaticScanner;
import Modle.entity.Book;
import Modle.entity.Genre;
import Modle.exception.Exceptions;

import java.util.ArrayList;
import java.util.List;

public class BookDAO implements InterfaceDAO {
    List<Book> bookList = new ArrayList<>();
    byte temp;
    Book book = new Book();

    @Override
    public void save() {
        getBookNameFromUser();
        getBookIdFromUser();
        getBookAuthorFromUser();
        getBookGenreFromUser();
        saveInformation();
        System.out.println("information is saved");
    }

    public void saveInformation() {
        bookList.add(book);
    }

    public void getBookGenreFromUser() {
        System.out.print("insert genre (1.dram 2.historical 3.scientific): ");
        temp = StaticScanner.getDada().nextByte();
        try {
            Exceptions.validateGenre(temp);

            if (temp == 1)
                book.setGenre(Genre.DRAM);
            else if (temp == 2)
                book.setGenre(Genre.HISTORICAL);
            else if (temp == 3)
                book.setGenre(Genre.SCIENTIFIC);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void getBookAuthorFromUser() {
        System.out.print("insert author: ");
        book.setAuthor(StaticScanner.getDada().nextLine());
    }

    public void getBookNameFromUser() {
        System.out.print("insert book name: ");
        book.setName(StaticScanner.getDada().nextLine());
    }

    public void getBookIdFromUser() {
        System.out.print("insert book id: ");
        book.setId(StaticScanner.getDada().nextLong());
    }

}
