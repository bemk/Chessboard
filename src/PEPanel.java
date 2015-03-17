import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;


public class PEPanel extends JPanel
{
	private static final long serialVersionUID = 1L;
	private int max = 300;
	private int x1 = 0;
	private int y1 = 0;
	private int x2 = 0;
	private int y2 = 0;
	
	public PEPanel()
	{
		setPreferredSize(new Dimension(800,800));
		setBackground(Color.white);
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D)g;
		
		g2.translate(getWidth()/2,getHeight()/2);
		g2.scale(1,-1);
		
		for(int i = 0; i <= max; i++)
		{
			double t = i * 8 * Math.PI/max;
			x2 = (int)(20 * t * Math.cos(t));
			y2 = (int)(20 * t * Math.sin(t));

			g2.drawLine(x1, y1, x2, y2);
			
			x1 = x2;
			y1 = y2;
		}	
	}
}
