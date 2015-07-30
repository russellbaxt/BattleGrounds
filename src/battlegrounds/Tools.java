package battlegrounds;

import java.awt.Dimension;
import java.awt.Toolkit;

public class Tools
{
	public static final String TITLE = "Battle Grounds";
	protected static int[] screenSize = evaluateScreenSize();
	public static final int WIDTH = screenSize[0];
	public static final int HEIGHT = screenSize[1];

	public static int[] evaluateScreenSize()
	{
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		double width = screenSize.getWidth();
		double height = (width * 2) / 3;
		if (height > screenSize.getHeight())
		{
			height = screenSize.getHeight() * .9;
			width = (height * 3) / 2;
		}

		return new int[]
		{ (int) width, (int) height };
	}
}
