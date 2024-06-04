public class CensorshipTester 
{
    public static void main(String[] args) 
    {
        Censorship censorship = new Censorship();

        System.out.println("Adding bad words:");
        System.out.println(" The word is'bad' and the result: " + censorship.addBadWord("bad")); 
        System.out.println("The word is 'rude'and the result: " + censorship.addBadWord("rude")); 
        
        System.out.println("\nUpdated list of bad words:");
        censorship.listBadWords();
        
        System.out.println("\nTesting isBadWord:");
        System.out.println("'bad' is a bad word? " + censorship.isBadWord("bad")); 

        System.out.println("'I love cats.' contains a bad word? " + censorship.containsBadWord("I love cats.")); 

        System.out.println("\nTesting censorBadWords:");
        System.out.println(censorship.censorBadWords("There are bad words in this."));

        System.out.println("\nTesting removeBadWord:");
        System.out.println("Removed 'nonexistent' result: " + censorship.removeBadWord("nonexistent")); 
    }
}

