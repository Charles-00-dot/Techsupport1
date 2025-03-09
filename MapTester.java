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
 * 34.Both HashSet and ArrayList are part of the Java Collections Framework,
 * but they implement different interfaces: HashSet implements Set, and ArrayList implements List.
 * 35.The split() method in Java allows you to define exactly how a string 
 * should be split using regular expressions (regex). You can specify delimiters, patterns, or conditions that determine where the string should be split.
 * String str = "Hello World";
   String[] parts = str.split(" ");  // Split by space
   System.out.println(Arrays.toString(parts));  // Output: [Hello, World]

 * 
 * 36.You can use the regex \\s+ to split by any whitespace (space, tab, etc.).
 * 37.The words in a HashSet are not guaranteed to be in any specific order. 
 * The HashSet does not maintain the order in which elements are added.
 * The words in an ArrayList are returned in the order they were added. It maintains the insertion order.
 * 38.When using the split() method in Java, if there are multiple spaces 
 * (e.g., two or three spaces) between words, it depends on how you define the 
 * delimiter in the regular expression. If you don't account for multiple spaces, you could end up with empty strings in your result.
 * 39.
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
