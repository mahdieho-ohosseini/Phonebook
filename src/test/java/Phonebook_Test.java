import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class Phonebook_Test {
    Person person1 = new Person("mahdieh","09115859055");
    Person person2= new Person("zahra","09037800582");
    Phonebook phonebook = new Phonebook();
    @Test
    public void getPhoneNumber_Test(){
        phonebook.addContact(person1);
        phonebook.addContact(person2);
        assertEquals("09115859055", phonebook.getPhoneNumber("mahdieh"));
        assertEquals("09037800582",phonebook.getPhoneNumber("zahra"));
        assertEquals("Contact Not Found", phonebook.getPhoneNumber(" "));
    }
    @Test
    public  void getContact(){
       phonebook.addContact(person1);
       phonebook.addContact(person2);
       assertEquals(1,phonebook.getContact("mahdieh"));
       assertEquals(1,phonebook.getContact("zahra"));
       assertEquals(0,phonebook.getContact(" "));


    }
}
