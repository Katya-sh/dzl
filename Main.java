public class Main {
    public static void main(String[] args) {
        Phonebook phoneBook = new Phonebook();
        Display Menu = new Display(phoneBook);
        Menu.displayMenu();
    }

}
