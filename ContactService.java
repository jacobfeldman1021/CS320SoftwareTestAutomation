import java.util.*;
import java.util.HashMap;

public class ContactService {
    private int contactCount;
    private HashMap<String,Contact> contactList=new HashMap<>();
    public void addNewContact(HashMap<String,Contact> contactlist,String firstname,String lastname,String phoneNum,String add)
    {
        contactCount = contactlist.size();
        contactCount++;
        String uniqueID = Integer.toString(contactCount);
        String firstName = inputValidation(firstname,10);
        String LastName = inputValidation(lastname,10);
        String phone = inputValidationforphone(phoneNum,10);
        String address = inputValidation(add,30);

        Contact newContact=new Contact();
        newContact.contact(uniqueID,firstName,LastName,phone,address);
        contactlist.put(uniqueID,newContact);
    }

    private String inputValidationforphone(String phoneNum, int limit) {
        if(phoneNum.length()!=10){
            System.out.println("Try again with a valid input");
        }
       return phoneNum;
    }

    public void removeContact(HashMap<String,Contact> contactlist,String ID) {
        if(contactlist.containsKey(ID))
        {
            contactlist.remove(ID);
        }
        else
        {
            System.out.println("Check your ID and try again");
        }
    }

    public void updateFirstName(HashMap<String,Contact> contactlist,String ID,String firstName) {
        if(contactlist.containsKey(ID))
        {
            Contact retrievedContact=contactlist.get(ID);
            retrievedContact.setFirstName(firstName);
            contactlist.put(ID,retrievedContact);
        }
        else
        {
            System.out.println("Check your ID and try again");
        }
    }

    public void updateLastName(HashMap<String,Contact> contactlist,String ID,String lastName) {
        if(contactlist.containsKey(ID))
        {
            Contact retrievedContact=contactlist.get(ID);
            retrievedContact.setLastName(lastName);
            contactlist.put(ID,retrievedContact);
        }
        else
        {
            System.out.println("Check your ID and try again");
        }
    }

    public void updateNumber(HashMap<String,Contact> contactlist,String ID,String number) {
        if(contactlist.containsKey(ID))
        {
            Contact retrievedContact=contactlist.get(ID);
            retrievedContact.setPhone(number);
            contactlist.put(ID,retrievedContact);
        }
        else
        {
            System.out.println("Check your ID and try again");
        }
    }

    public void address(HashMap<String,Contact> contactlist,String ID,String address) {
        if(contactlist.containsKey(ID))
        {
            Contact retrievedContact=contactlist.get(ID);
            retrievedContact.setAddress(address);
            contactlist.put(ID,retrievedContact);
        }
        else
        {
            System.out.println("Check your ID and try again");
        }
    }

    public String inputValidation(String input,int limit) {
        if(input == null || input.length()>limit)
        {
            System.out.println("Try again with a valid input");
        }
        return input;
    }
}
