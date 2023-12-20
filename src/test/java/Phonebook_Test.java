import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
public class Phonebook_Test {
    Person person1 = new Person("mahdieh","09115859055");
    Person person2= new Person("zahra","09037800582");
    Phonebook phonebook = new Phonebook();
    ArrayList<Person> contacts;
    @Test
    public void getPhoneNumber_Test(){
        phonebook.addContact(person1);
        phonebook.addContact(person2);
        assertEquals("09115859055", phonebook.getPhoneNumber("mahdieh"));
        assertEquals("09037800582",phonebook.getPhoneNumber("zahra"));
        assertEquals("Contact Not Found", phonebook.getPhoneNumber("edxtrd"));
        assertEquals("Contact Not Found", phonebook.getPhoneNumber(""));
        assertEquals("Contact Not Found", phonebook.getPhoneNumber(" "));
    }
    @Test
    public  void getContact_Test(){
       phonebook.addContact(person1);
       phonebook.addContact(person2);
       assertEquals(1,phonebook.getContact("mahdieh"));
       assertEquals(1,phonebook.getContact("zahra"));
       assertEquals(0,phonebook.getContact("esryf"));
       assertEquals(0,phonebook.getContact(""));
       assertEquals(0,phonebook.getContact(" "));


    }
    @Test
    public  void updateContactName_Test(){
        phonebook.addContact(person1);
        phonebook.addContact(person2);
        assertEquals(1,phonebook.updateContactName("mahdieh","maryam"));
        assertEquals(1,phonebook.updateContactName("zahra","melina"));
        assertEquals(0,phonebook.updateContactName("vgvgvk","ali"));
        assertEquals(0,phonebook.updateContactName("","ali"));
        assertEquals(0,phonebook.updateContactName(" ","ali"));

    }
    @Test
    public  void updateContactPhoneNumber_Test(){

        phonebook.addContact(person1);
        phonebook.addContact(person2);
        assertEquals(1,phonebook.updateContactPhoneNumber("mahdieh","09132149236"));
        assertEquals(1,phonebook.updateContactPhoneNumber("zahra","09904849843"));
        assertEquals(0,phonebook.updateContactPhoneNumber("njhjhn","09122159635"));
        assertEquals(0,phonebook.updateContactPhoneNumber("","09122159635"));
        assertEquals(0,phonebook.updateContactPhoneNumber(" ","09122159635"));

    }
 @Test
    public  void deleteContact_Test(){
     phonebook.addContact(person1);
     phonebook.addContact(person2);
     assertEquals(1,phonebook.deleteContact("mahdieh"));
     assertEquals(1,phonebook.deleteContact("zahra"));
     assertEquals(0,phonebook.deleteContact("fggfdh"));
     assertEquals(0,phonebook.deleteContact(""));
     assertEquals(0,phonebook.deleteContact(" "));

 }
 @Test
    public void getAllContacts_Test(){
     phonebook.addContact(person1);
     phonebook.addContact(person2);
       contacts= phonebook.getAllContacts();
       assertEquals(person1.getName(),contacts.get(0).getName());
       assertEquals(person2.getName(),contacts.get(1).getName());
    }



}
