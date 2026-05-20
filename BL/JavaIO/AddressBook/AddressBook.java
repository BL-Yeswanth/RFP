import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AddressBook {

    ArrayList<Contact> contactList =
            new ArrayList<>();

    // Add Contact
    public void addContact(
            Contact contact) {

        contactList.add(contact);
    }

    // Search By City
    public List<Contact> searchByCity(
            String city) {

        return contactList.stream()
                .filter(
                        person ->
                                person.city.equalsIgnoreCase(city)
                )
                .collect(Collectors.toList());
    }

    // Search By State
    public List<Contact> searchByState(
            String state) {

        return contactList.stream()
                .filter(
                        person ->
                                person.state.equalsIgnoreCase(state)
                )
                .collect(Collectors.toList());
    }
}