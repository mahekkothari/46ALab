import java.util.Scanner;
import java.util.Random;
/**
 * Write a description of class RandomRectangles here.
 *
 * @author Mahek Kothari
 * @version 2024-03-24
 */
public class RandomRectangles
{
   public static final int MAX_X = 100;
   public static final int MAX_Y = 500;
   public static final int MIN_WIDTH = 30;
   public static final int MAX_WIDTH = 100;
   public static final int MIN_HEIGHT = 20;
   public static final int MAX_HEIGHT = 80;
   public static final int GENERATOR_SEED = 202210;
   
   
   public static void main(String[] args)
   {
       String inputString;
       
       Scanner in = new Scanner(System.in);
       Random rand1 = new Random(GENERATOR_SEED);
       Random rand2 = new Random(GENERATOR_SEED);
       
       
       System.out.print("Enter a positive integer for the number of rectangles: ");
       while( !in.hasNextInt())
       {
           inputString = in.nextLine();
           System.out.print("Not an integer: \"" + inputString + "\".");
           System.out.print("Enter a positive integer for the number of rectangles: ");
       }
       int input = in.nextInt();
       while( input <= 0)
       {
           input = in.nextInt();
           System.out.print("Not an integer: \"" + input + "\".");
           System.out.print("Enter a positive integer for the number of rectangles: ");
       }
       
       System.out.printf("The number of rectangles: %d.\n", input);
       
       Random rand = new Random(GENERATOR_SEED);
       int smallestArea = Integer.MAX_VALUE;
       int smallestX = 0;
       int smallestY = 0;
       int smallestWidth = 0;
       int smallestHeight = 0;
       
       
       for(int i = 0; i < input; i++)
       {
           int x = rand.nextInt(MAX_X);
           int y = rand.nextInt(MAX_Y);
           int width = rand.nextInt(MAX_WIDTH - MIN_WIDTH) + MIN_WIDTH;
           int height = rand.nextInt(MAX_HEIGHT - MIN_HEIGHT) + MIN_HEIGHT;
           int area = width * height;
           
           if (area < smallestArea)
           {
               smallestArea = area;
               smallestX = x;
               smallestY = y;
               smallestWidth = width;
               smallestHeight = height;
           }
       }
       
       Rectangle smallestRect = new Rectangle(smallestX,smallestY,smallestWidth, smallestHeight);
       smallestRect.setColor(Color.YELLOW);
       smallestRect.draw();
       smallestRect.fill();
       
       Random rand2 = new Random(GENERATOR_SEED);
       for(int i = 0; i < input; i++)
       {
           int x = rand2.nextInt(MAX_X);
           int y = rand2.nextInt(MAX_Y);
           int width = rand2.nextInt(MAX_WIDTH - MIN_WIDTH) + MIN_WIDTH;
           int height = rand2.nextInt(MAX_HEIGHT - MIN_HEIGHT) + MIN_HEIGHT;
           int area = width * height;
           
           if(area != smallestArea)
           {
              Rectangle rect = new Rectangle(x, y, width, height);
              rect.setColor(Color.RED);
              rect.draw();      
            }
       }
       
    
       System.out.println("The min area: " + smallestArea + ".");
   }
}
