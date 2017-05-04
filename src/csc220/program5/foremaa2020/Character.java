/*  Anthony Foreman
 *  CSC 220 Program 5
 *  4-29-17
 *  Description: This class is where the character is drawn 

*/
package csc220.program5.foremaa2020;
    
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

    
/**
 *
 * @author foremaa2020
 */
public class Character extends csc220.program5.GameCharacter {
    
    private int horizontalStepSize;
    private Color charColor;
    
    
    public Character (int x, int y, int diameter, int moveInterval) {
        super(x, y, diameter, diameter, 1000, new csc220.program5.foremaa2020.List<Point>());
        animationPath.add(new Point(x, y));
        animationPath.add(new Point(x + 100, y));
        animationPath.add(new Point(x, y + 100));
        animationPath.add(new Point(x + 100, y + 100));
     } 
     
    
    public void draw(Graphics g) {
        int over = getOver();
        int down = getDown();
        int width = getWidth();
        
        
       g.setColor(Color.GRAY);
        g.fillRect(over,down,100,100);
        g.setColor(Color.RED);
        g.fillRect(getOver()+15, getDown()+20, 20, 20);
        g.fillRect(getOver()+65, getDown()+20, 20, 20);
        g.fillRect(getOver()+15, getDown()+65, 70, 20);

      


        
        

    }
    
    
    
    

    
    
}
