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
	int lenght = 40;
	int correction = 4 * lenght;
	
	public ChessPanel()
	{
		setPreferredSize(new Dimension(800,800));
		setBackground(Color.white);
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
			}
			
			Shape rectangle = new Rectangle(x * lenght - correction, y - correction, lenght, lenght);
			g2.draw(rectangle);
		}
	}
}