package Modle.repository;
import Common.StaticScanner;
import Modle.entity.Person;
import Modle.entity.Sexuality;
import Modle.exception.Exceptions;
import java.util.ArrayList;
import java.util.List;

public class PersonDAO implements InterfaceDAO {
    List<Person> personList = new ArrayList<>();
    Person person = new Person();
    byte temp;

    @Override
    public void save() {
        getPersonNameFromUser();
        getPersonIdFromUser();
        getPersonAgeFromUser();
        getPersonSexualityFromUser();
        saveInformation();
        System.out.println("information is saved");
    }

    private void saveInformation() {
        personList.add(person);
    }

    private void getPersonSexualityFromUser() {
        System.out.print("insert sexuality (1.male 2.female): ");
        temp = StaticScanner.getDada().nextByte();

        try {
            Exceptions.validateSexuality(temp);

            if (temp == 1)
                person.setSexuality(Sexuality.MALE);
            else if (temp == 2)
                person.setSexuality(Sexuality.FEMALE);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("1.Librarian\n2.buyer");
        temp = StaticScanner.getDada().nextByte();
        try {
            Exceptions.validetLibrarianOrBuyer(temp);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private void getPersonAgeFromUser() {
        System.out.print("insert age: ");
        person.setAge(StaticScanner.getDada().nextByte());
    }

    private void getPersonIdFromUser() {
        System.out.print("insert person id: ");
        person.setId(StaticScanner.getDada().nextLong());
    }

    private void getPersonNameFromUser() {
        System.out.print("insert person name: ");
        person.setName(StaticScanner.getDada().nextLine());
    }
}
