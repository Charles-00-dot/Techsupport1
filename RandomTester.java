import java.util.Random;

/**
 * Write a description of class RandomTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RandomTester
{
    private Random rand_gen;
    

    /**
     * Constructor for objects of class RandomTester
     */
    public RandomTester()
    {
        rand_gen = new Random();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    //14A
    public void printRandom(){
        System.out.println("New interger: " + rand_gen.nextInt());
    }
    // 14b 
    public void printMultiRandom(int howMany){
        int count = 0;
        while (count < howMany){
            count++;
            System.out.println("New interger: " + rand_gen.nextInt()); 
        }
    }
    
    
    
    
}
