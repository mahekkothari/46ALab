/**
 * A Java class that provides methods for finding vowels.
 * 
 * @author  Qi Yang
 * @version 2022-04-22
 */
public class VowelFinder
{
    String word;
    
    /**
     * Constructs a VowelFinder object.
     * 
     * @param newWord the word to be analyzed 
     */
    public VowelFinder(String newWord)
    {
        word = newWord;
    }

    /**
     * Cumulates all vowels of a word together into a string.
     * 
     * @return string with all the vowels of a word
     */
    public String findVowels()
    {
        String vowels = "aeiouyAEIOUY";
        String result = "";
        int i = 0;
        String letter = word.substring(i, i + 1);
        while (i < word.length())
        {
            if (vowels.contains(letter))
            {
                result = result + letter;
            }
            i++;
        }
        return result;
    }
}