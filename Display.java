import java.util.Scanner;

public class Display {
    private  Phonebook phonebook;
    private Scanner scanner;

    public Display(Phonebook phoneBook) {
        this.phonebook = phoneBook;
        this.scanner = new Scanner(System.in);
    }
    public void displayMenu() {
        while (true) {
            System.out.println("Показать контакты - 1");
            System.out.println("Добавить контакт - 2");
            System.out.println("Добавить номер к контакту - 3");
            System.out.println("Удалить номер у контакта - 4");
            System.out.println("Удалить контакт - 5");
            System.out.println("Выход - 6");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    phonebook.displayContacts();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    addPhoneNumber();;
                    break;
                case 4:
                    delPhoneNumber();
                    break;
                case 5:
                    delContact();
                    break;
                case 6:
                    System.out.println("Выход.");
                    System.exit(0);
                default:
                    System.out.println("Не корректно задана опция, повторите");
            }
        }
    }

    private void addContact() {
        System.out.print("Введите имя контакта: ");
        String name = scanner.nextLine();
        System.out.print("Введите телефон: ");
        String phoneNumber = scanner.nextLine();
        phonebook.addContact(name, phoneNumber);
    }

    private void addPhoneNumber() {
        System.out.print("Введите имя контакта: ");
        String name = scanner.nextLine();
        System.out.print("Введите телефон: ");
        String phoneNumber = scanner.nextLine();
        phonebook.addContact(name, phoneNumber);
    }

    private void delPhoneNumber() {
        System.out.print("Введите имя контакта: ");
        String name = scanner.nextLine();
        System.out.print("Введите телефон: ");
        String phoneNumber = scanner.nextLine();
        phonebook.delPhoneNumber(name, phoneNumber);
    }

    private void delContact() {
        System.out.print("Введите имя контакта: ");
        String name = scanner.nextLine();
        phonebook.delContact(name);
    }

}
