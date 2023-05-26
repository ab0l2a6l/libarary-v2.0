package Controler;

import Common.Show;
import Common.StaticScanner;
import Modle.entity.Book;
import Modle.entity.Genre;
import Modle.entity.Person;
import Modle.entity.Sexuality;
import Modle.exception.Exceptions;
import Modle.repository.BookDAO;
import Modle.repository.InterfaceDAO;
import Modle.repository.PersonDAO;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String []args) {
        InterfaceDAO interfaceDAO;
        byte selectBookORPerson;

        for (; ; ) {
            selectBookORPerson = Show.menu();
            StaticScanner.getDada().nextLine();

            switch (selectBookORPerson) {
                case 1 -> {
                     interfaceDAO = new BookDAO();
                     interfaceDAO.save();
                }

                case 2 -> {
                    interfaceDAO = new PersonDAO();
                    interfaceDAO.save();
                }
                default -> System.out.println("wrong number try again!!!");
            }
        }
    }
}