import java.util.*;

public class Phonebook {
    private Map<String, BookContact> contacts;

    public Phonebook() {
        contacts = new HashMap<>();
    }
    /**
     * Выводит список контактов и их номеров телефонов на экран
     */
    public void displayContacts() {
        List<BookContact> sortedContacts = new ArrayList<>(contacts.values());
        sortedContacts.sort(Comparator.comparingInt(contact -> -contact.getPhoneNumbers().size()));
        for (BookContact contact : sortedContacts) {
            System.out.println(contact.getName() + ": " + contact.getPhoneNumbers());
        }
    }
    /**
     * Добавляет новый контакт или обновляет существующий
     *
     * @param name имя контакта
     * @param phoneNumber номер телефона
     */
    public void addContact(String name, String phoneNumber) {
        if (contacts.containsKey(name)) {
            contacts.get(name).addPhoneNumber(phoneNumber);
        } else {
            BookContact contact = new BookContact(name, phoneNumber);
            contacts.put(name, contact);
        }
    }

    /**
     * Удаляет контакт с указанным именем
     *
     * @param name имя контакта
     */
    public void delContact(String name) {
        contacts.remove(name);
    }

    /**
     * Удаляет указанный номер телефона из контакта
     *
     * @param name имя контакта
     * @param phoneNumber номер телефона
     */
    public void delPhoneNumber(String name, String phoneNumber) {
        if (contacts.containsKey(name)) {
            contacts.get(name).delPhoneNumber(phoneNumber);
        }
    }
}

