import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class Phonebook_Test {
    Person person1 = new Person("mahdieh","09115859055");
    Phonebook phonebook = new Phonebook();
    @Test
    public void getPhoneNumber_Test(){
        phonebook.addContact(person1);
        assertEquals("09115859055", phonebook.getPhoneNumber("mahdieh"));
        assertEquals("Contact Not Found", phonebook.getPhoneNumber(" "));
    }
}
