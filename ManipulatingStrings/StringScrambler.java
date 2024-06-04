/**
 * class StringScrambler
 *
 * @author Mahek Kothari
 * @version 2024-3-1
 */

public class StringScrambler
{
    private String word;
    /**
     * Constructor for objects of class StringScramble
     * 
     * @param wordVal the word to be manipulated.
     */
    public StringScrambler(String wordVal)
    {
        word = wordVal;
    }
    
    /**
     * Swaps the first and last characters of the word.
     * 
     * 
     * @return the modified string or the out of null.
     */
    public String scrambleFirstLast()
    {
        if(word.length()>=2)
        {
            char firstLetter = word.charAt(0);
            char lastLetter = word.charAt(word.length() - 1);
            return lastLetter + word.substring(1, word.length() - 1) + firstLetter;
        }
        else
        {
            return "null";
        }
    }

    /**
     * Swaps the second and third characters of the word.
     *
     *   
     * @return the modified string or the out of null.
     */
    public String scrambleSecondThird()
    {
        if(word.length()>=3)
        {
            char secondCharacter = word.charAt(1);
            char thirdCharacter = word.charAt(2);
            char firstCharacter = word.charAt(0);
            
            return "" + firstCharacter + thirdCharacter + secondCharacter + word.substring(3);
        }
        else 
        {
            return "null";
        }
    }
    
    /**
     * 
     *
     * @param  index the the index of the scrambleAdjacentTwo
     * @return the modified string or output of null
     */
    public String scrambleAdjacentTwo(int index)
    {
        if (word.length() >= 3 && index > 0 && index < word.length() - 2) 
        {
            char firstCharacter = word.charAt(index);
            char lastCharacter = word.charAt(index + 1);
            
            return word.substring(0, index) + lastCharacter + firstCharacter + word.substring(index + 2);
        }
        else
        {
            return "null";
        }
    }
    
    /**
     * 
     *
     * @param index the Index of the scrambleNotAdjacentTwo
     * @return the modified string or output of null
     */
    public String scrambleNotAdjacentTwo(int index)
    {
        if (word.length() > 4 && index > 0 && index < word.length() - 3)
        {
            char firstCharacter = word.charAt(index);
            char lastCharacter = word.charAt(index + 2);
            
            return word.substring(0, index) + lastCharacter + word.charAt(index + 1) + firstCharacter + word.substring(index + 3);
        }
        else
        {
            return "null";
        }
    }
}
