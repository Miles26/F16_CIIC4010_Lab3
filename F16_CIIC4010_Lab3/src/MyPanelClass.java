import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import javax.swing.JPanel;
 
public class MyPanelClass extends JPanel 
{
            /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

			public void paintComponent(Graphics g) 
            {
                        super.paintComponent(g);
 
                        //Compute interior coordinates
                        Insets myInsets = this.getInsets();
                        int x1 = myInsets.left;
                        int y1 = myInsets.top;
                        int x2 = getWidth() - myInsets.right - 1;
                        int y2 = getHeight() - myInsets.bottom - 1;
                        int width = x2 - x1;
                        int height = y2 - y1;
 
                        //Paint the background
                        g.setColor(Color.WHITE);
                        g.fillRect(x1, y1, width + 1, height + 1);
                        
                        //Draw a border
                        //g.setColor(Color.YELLOW);
                        //g.drawRect(x1, y1, width, height);
                        
                        //g.setColor(Color.GREEN);
                        //g.drawRect(x1 + 25, y1 + 25, width - 50, height - 50);
                        
                        //Draw a line 
                        //g.setColor(Color.ORANGE);
                        //g.drawLine(x1, y1, x2, y2);
                        
                        //g.setColor(Color.RED);
                        //g.drawLine(x2, y1, x1 , y2);
                        
                        
                        //Draw a oval
                        g.setColor(Color.DARK_GRAY);
                        g.fillOval(x1 + 70, y1 + 70, x2 - 140, y2 - 140);
                        
            }
}