package battlegrounds;

import graphics.Draw;
import keyPresses.KeyBindings;

import javax.swing.JFrame;

public class Main
{
	protected JFrame frame;
	protected Draw draw;
	protected KeyBindings keyBindings;

	public static void main(String[] args)
	{
		new Main().start();
		
	}

	protected void start()
	{
		
		System.out.println("he");
		
		keyBindings = new KeyBindings();
		

		frame = new JFrame();
		frame.setTitle(Tools.TITLE);
		frame.add(keyBindings);
		frame.setSize(Tools.WIDTH, Tools.HEIGHT);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setVisible(true);
		
		System.out.println("Ha");
	}
}
