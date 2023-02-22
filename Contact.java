import java.io.*;
import java.util.*;

public class Contact {
    private String contactID;
    private String firstName;
    private String lastName;
    private String phone;
    private String address;

    public void contact(String contactId, String first, String last, String phoneNo, String add){
        boolean abc = contactIDlen(contactId);
        if(abc){
            this.contactID = contactId;
        }
        boolean fn = firstnamelen(first);
        if(fn){
            this.firstName = first;
        }
        boolean ln = lastnamelen(last);
        if(ln){
            this.lastName = last;
        }
        boolean ph = phone(phoneNo);
        if(ph){
            this.phone = phoneNo;
        }
        boolean ad = address(add);
        if(ad){
            this.address = add;
        }
    }

    public boolean contactIDlen(String contactId){
        boolean len;
        if(contactId.length()>=10 || contactId == null){
            len = false;
        }
        else{
            len = true;
        }
        return len;
    }

    public boolean firstnamelen(String firstname){
        boolean len = true;
        if(firstname.length()>=10){
            len = false;
        }
        return len;
    }

    public boolean lastnamelen(String lastname){
        boolean len = true;
        if(lastname.length()>=10){
            len = false;
        }
        return len;
    }

    public boolean phone(String phone){
        boolean len = false;
        if(phone.length()==10){
            len = true;
        }
        return len;
    }

    public boolean address(String add){
        boolean len = false;
        if(add.length() <=30){
            len = true;
        }
        return len;
    }

    public String getContactId(){
        return contactID;
    }

    public void setFirstName(String firstName){
        boolean fn = firstnamelen(firstName);
        if(fn){
            this.firstName = firstName;
        }
    }
    public String getFirstName(){
        return firstName;
    }

    public void setLastName(String input){
        boolean ln = lastnamelen(input);
        if(ln){
            this.lastName = input;
        }
    }
    public String getLastName(){
        return lastName;
    }

    public void setAddress(String input){
        boolean ad = address(input);
        if(ad){
            this.address = input;
        }
    }
    public String getAddress(){
        return address;
    }

    public void setPhone(String input){
        boolean ph = phone(input);
        if(ph){
            this.phone = input;
        }
    }
    public String getPhone(){
        return phone;
    }
}