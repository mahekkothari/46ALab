import java.util.ArrayList;
import java.util.List;

public class Censorship 
{
    public List<String> badWords = new ArrayList<>();

    public Censorship() 
    {
        
    }

    public boolean isBadWord(String str) 
    {
        return badWords.contains(str.toLowerCase());
    }

     // Method to check if a string contains any bad words
    public boolean containsBadWord(String str) 
    {
        for (String badWord : badWords) 
        {
            if (str.toLowerCase().contains(badWord.toLowerCase())) 
            {
                return true;
            }
        }
        return false;
    }

     // Method to add a new bad word to the list
    public boolean addBadWord(String str) 
    {
        String lowerStr = str.toLowerCase();
        if (!badWords.contains(lowerStr)) 
        {
            badWords.add(lowerStr);
            return true;
        }
        return false; 
    }

   
    public void listBadWords() 
    {
        for (String badWord : badWords) 
        {
            System.out.println(badWord);
        }
    }

    public String censorBadWords(String str) 
    {
        String censoredString = str;
        for (String badWord : badWords) 
        {
            censoredString = censoredString.replaceAll("(?i)" + badWord, "****");
        }
        return censoredString;
    }

    public boolean removeBadWord(String str) 
    {
        return badWords.remove(str.toLowerCase());
    }
}