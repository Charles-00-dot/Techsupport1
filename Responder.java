import java.util.ArrayList;
import java.util.Random;

/**
 * The responder class represents a response generator object.
 * It is used to generate an automatic response to an input string.
 * 
 * @author     Michael Kölling and David J. Barnes
 * @version    0.1 (2016.02.29)
 */
public class Responder
{
    private ArrayList<String> responses;
    private Random rand_gen;
    
    
    
    
    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        rand_gen = new Random();
        responses = new ArrayList<>();
        fillResponses();
        
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse()
    {
        int choice = rand_gen.nextInt(responses.size());
         return responses.get(choice);
    }
    
    private void fillResponses(){
        responses.add("yes, you are right");
        responses.add("no, you've made a mistake");
        responses.add("no idea, there is somoething missing");
        responses.add("maybe something went wrong or right");
        responses.add("who knows, you might have a chance");
        
    }
}
