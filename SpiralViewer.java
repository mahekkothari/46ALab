/**
 * Viewer for a spiral drawing.
 * 
 * @author Mahek Kothari
 * @version 2024-03-22
 */
public class SpiralViewer
{
    public static void main(String[] args)
    {
        final int GRID_SIZE = 10;
        final int START_X = 100;
        final int START_Y = 100;
        final int NUM_ITERATIONS = 10;
        final int NUM_SEGMENTS = 40;
        
        int endX = START_X;
        int endY = START_Y;
        int startX;
        int startY;
        int distance = 0;
        
        for (int i = 1; i <= NUM_ITERATIONS; i++) 
        {
            int j = 2*i-1;
            startX = endX;
            startY = endY;
            endY = startY-(j*GRID_SIZE);
            Line line1 = new Line(startX,startY, endX, endY);
            line1.draw();
            startX = endX;
            startY = endY;
            endY = startY;
            endX = startX-(j*GRID_SIZE);
            Line line2 = new Line(startX,startY, endX, endY);
            line2.draw();
            int k = 2*i;
            startX = endX;
            startY = endY;
            endX = startX;
            endY = startY+(k*GRID_SIZE);
            Line line3 = new Line(startX,startY, endX, endY);
            line3.draw();
            startX = endX;
            startY = endY;
            endX = startX +(k*GRID_SIZE);
            endY = startY;
            Line line4 = new Line(startX,startY, endX, endY);
            line4.draw();
        }
    }
}