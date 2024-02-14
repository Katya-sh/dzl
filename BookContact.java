import java.util.ArrayList;
import java.util.List;

    public class BookContact {
        private String name; // Имя контакта
        private List<String> phoneNumbers; // Список телефонных номеров, связанных с контактом


        public BookContact(String name, String phoneNumber) {
            this.name = name;
            this.phoneNumbers = new ArrayList<>();
            this.phoneNumbers.add(phoneNumber);
        }


        public String getName() {
            return name;
        }

        public List<String> getPhoneNumbers() {
            return phoneNumbers;
        }

        public void addPhoneNumber(String phoneNumber) {
            phoneNumbers.add(phoneNumber);
        }


        public void delPhoneNumber(String phoneNumber) {
            phoneNumbers.remove(phoneNumber);
        }
    }


