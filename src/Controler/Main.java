package Controler;

import Common.Show;
import Common.StaticScanner;
import Modle.repository.BookDAO;
import Modle.repository.InterfaceDAO;
import Modle.repository.PersonDAO;

public class Main {

    public static void main(String[] args) {
        InterfaceDAO interfaceDAO;
        byte selectBookORPerson;

        for (;;) {
            selectBookORPerson = Show.menu();
            switch (selectBookORPerson) {
                case 1 -> {
                    interfaceDAO = new BookDAO();
                    interfaceDAO.save();
                }

                case 2 -> {
                    interfaceDAO = new PersonDAO();
                    interfaceDAO.save();
                }

                case 3 ->
                {
                    return;
                }
                default -> System.out.println("wrong number try again!!!");
            }
        }
    }
}