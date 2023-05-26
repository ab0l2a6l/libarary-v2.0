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
    byte isSave = 1;
    Book book = new Book();

    @Override
    public void save() {
        getBookNameFromUser();
        getBookIdFromUser();
        getBookAuthorFromUser();
        getBookGenreFromUser();
        saveInformation();
        showResult();
    }

    private void showResult() {
        if (isSave == 1)
            System.out.println("information is saved");
    }

    private void saveInformation() {
        if (isSave == 1)
            bookList.add(book);
    }

    private void getBookGenreFromUser() {
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
            isSave = 0;
            System.out.println(e.getMessage());
        }
    }

    private void getBookAuthorFromUser() {
        System.out.print("insert author: ");
        book.setAuthor(StaticScanner.getDada().nextLine());
    }

    private void getBookNameFromUser() {
        System.out.print("insert book name: ");
        book.setName(StaticScanner.getDada().nextLine());
    }

    private void getBookIdFromUser() {
        System.out.print("insert book id: ");
        book.setId(StaticScanner.getDada().nextLong());
    }
}