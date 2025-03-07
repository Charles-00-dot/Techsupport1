import java.util.HashMap;

/**
 * 24.
 * 25.
 * 26.
 * 28.overwites the old key.
 * 29.overwites the old key.
 * 30.
 * 31. it returns null.
 * 32.keySet();
 * 33.
 * 34.
 * 35.
 * 36.
 * 37.
 * 38.
 * 
 * 
 * 
 * 
 * 
 * 
 */
public class MapTester
{
    // instance variables - replace the example below with your own
    private HashMap<String, String> contacts;

    /**
     * Constructor for objects of class MapTester
     */
    public MapTester()
    {
        contacts = new HashMap<>();
        fillContacts();
    }
    // #27 
    public void enterNumber (String name, String number){
        contacts. put(name, number);
    }

    public String lookupNumber(String name){
        return contacts.get(name);

    }
    
    private void fillContacts(){
        contacts.put("john", "123");
        contacts.put("jhan", "213");
        contacts.put("jann", "312");
    }
}
