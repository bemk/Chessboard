import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Chess extends JApplet
{
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) 
	{
		JFrame frame = new JFrame();
		frame.setTitle("Chess");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JApplet applet = new Chess();
		applet.init();
		
		frame.getContentPane().add(applet);
		frame.pack();
		frame.setVisible(true);
	}
	
	public void init() 
	{
		JPanel panel = new ChessPanel();
		getContentPane().add(panel);
	}
}
