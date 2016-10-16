/**
 *
 * @author jrimland
 */
public class RandomWordModel {
    final private String[] WORDS = {"one", "two", "three", "four", "five"}; 
    
    RandomWordModel()
    {
        
    }
    public String getWord()
    {
        int wordIndex = (int) (java.lang.Math.random() * WORDS.length);                
        
        return WORDS[wordIndex];

    }
}
