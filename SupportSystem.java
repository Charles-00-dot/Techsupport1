import java.util.HashSet;

/**
 * This class implements a technical support system. It is the top level class 
 * in this project. The support system communicates via text input/output 
 * in the text terminal.
 * 
 * This class uses an object of class InputReader to read input from the user,
 * and an object of class Responder to generate responses. It contains a loop
 * that repeatedly reads input and generates output until the users wants to 
 * leave.
 * 
 * @author     Michael Kölling and David J. Barnes
 * @version    0.1 (2016.02.29)
 */
public class SupportSystem
{
    /*
     * 2. 
     * 3.The other one has an int offset parameter and the other doesn't.
     *4.endsWith(String suffix) 
     *5.length()
     *6.Because they are aligned in the String class documentation
     *7.Return a string, with all leading and training space removed.
     *8.
     *9.
     *10.boolean
     *11.startsWith change to equals
     *12.It is in the java.util package;
     *13.The random numbers will return from 0-99
     *
     *15.
     * 23. yes because when we used .size in the method, it will go through 
     * every single index even when the ArrayList is updated.
     * 24. provides constant-time performance for the basic operations (get and put)
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     */
    
    
    private InputReader reader;
    private Responder responder;
    
    /**
     * Creates a technical support system.
     */
    public SupportSystem()
    {
        reader = new InputReader();
        responder = new Responder();
    }

    /**
     * Start the technical support system. This will print a welcome
     * message and enter into a dialog with the user, until the user
     * ends the dialog.
     */
    public void start()
    {
        boolean finished = false;

        printWelcome();

        while(!finished) {
            HashSet<String> input = reader.getInput(); // ksgduaybye
            input = new HashSet<>(input);// #8 b y e 
            input = cleanInput(input); // #9 BYE

            if(input.equals("bye")) {
                finished = true;
            }
            else {
                String response = responder.generateResponse(input);
                System.out.println(response);
            }
        }

        printGoodbye();
    }
    
    public static HashSet<String> cleanInput(HashSet<String> input) {
        HashSet<String> cleanedInput = new HashSet<>();
        for (String word : input) {
            cleanedInput.add(word.trim().toLowerCase());
        }
        return cleanedInput;
    }

    /**
     * Print a welcome message to the screen.
     */
    private void printWelcome()
    {
        System.out.println("Welcome to the DodgySoft Technical Support System.");
        System.out.println();
        System.out.println("Please tell us about your problem.");
        System.out.println("We will assist you with any problem you might have.");
        System.out.println("Please type 'bye' to exit our system.");
    }

    /**
     * Print a good-bye message to the screen.
     */
    private void printGoodbye()
    {
        System.out.println("Nice talking to you. Bye...");
    }
}
