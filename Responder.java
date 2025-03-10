import java.util.ArrayList;
import java.util.Random;
import java.util.HashMap;
import java.util.HashSet;

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
    private HashMap<String,String> responsesMap;
    
    
    
    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        rand_gen = new Random();
        responses = new ArrayList<>();
        responsesMap = new HashMap<>();
        fillResponses();
        fillResponsesMap(); 
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
    
    private void fillResponsesMap(){
        responsesMap.put("lol", "get good");
        responsesMap.put("GG"," well played");
        responsesMap.put("Chicken"," Dinner");
}

public String generateResponse(HashSet<String> inputWords){
    for (String word : inputWords){
        String answer = responsesMap.get(word);
    if (answer==null){
        return answer;
    }
    
}
return pickDefaultResponse();
}


public String pickDefaultResponse(){
    return "default";
}

}



