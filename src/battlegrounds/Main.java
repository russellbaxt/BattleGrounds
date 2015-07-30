package battlegrounds;

import graphics.Draw;

import javax.swing.JFrame;

public class Main
{
	protected JFrame frame;
	protected Draw draw;

	public static void main(String[] args)
	{
		new Main().start();
	}

	protected void start()
	{
		frame = new JFrame(Tools.TITLE);
		frame.setSize(Tools.WIDTH, Tools.HEIGHT);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setVisible(true);
	}
}
