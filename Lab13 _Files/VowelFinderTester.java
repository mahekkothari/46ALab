/**
 * A Java tester program for class VowelFinder.
 * 
 * @author  Qi Yang
 * @version 2022-04-22
 */
public class VowelFinderTester
{
    public static void main(String[] args)
    {
        test("karen", "ae"); // Expected: ae
        test("alice", "aie"); // Expected: aie
        test("britain", "iai"); // Expected: iai
        test("papaya", "aaya"); // Expected: aaya
        test("","");            //Expected the empty string
    }

    /**
     * A static method to test VowelFinder.
     * 
     * @param s the string used to create a VowelFinder object
     * @param expected the expected output string from method findVowels
     */
    public static void test(String s, String expected)
    {
        VowelFinder vf = new VowelFinder(s);
        String result = vf.findVowels();
        System.out.println("Result: " + result + "\nExpected: " + expected + "\n");
    }
}
