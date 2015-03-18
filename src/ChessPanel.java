import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Shape;

import javax.swing.JPanel;


public class ChessPanel extends JPanel
{
	private static final long serialVersionUID = 1L;
	private int y = 0;
	private int x = 0;
	int lenght = 60;
	int correction = 4 * lenght;
	boolean color = false;
	
	public ChessPanel()
	{
		setPreferredSize(new Dimension(600,600));
		setBackground(Color.cyan);
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D)g;
		
		g2.translate(this.getWidth()/2, this.getHeight()/2);
		g2.scale(1,-1);			
		
		y = 0;

		for (int i = 0; i <= 63; i++)
		{
			x = (i % 8);
			
			if(i % 8 == 0)
			{
				y += lenght;
				x = 0;
				color = !color;
			}
			
			g2.setPaint((color = !color) ? Color.BLACK : Color.WHITE);
			
			Shape rectangle = new Rectangle(x * lenght - correction, y - correction - lenght, lenght, lenght);
			g2.fill(rectangle);
			g2.draw(rectangle);			
		}
		g2.setPaint(Color.black);
		Shape rectangle = new Rectangle(0 - correction, 0 - correction, correction * 2, correction * 2);
		g2.draw(rectangle);
	}
}