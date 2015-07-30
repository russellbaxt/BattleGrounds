package keyPresses;

import javax.swing.JComponent;
import javax.swing.KeyStroke;

public class KeyBindings extends JComponent
{
	MoveLeft moveLeft;

	public KeyBindings()
	{
		moveLeft = new MoveLeft();
		
		getInputMap().put(KeyStroke.getKeyStroke("A"), "MoveLeft");
		
		getActionMap().put("MoveLeft", moveLeft);
	}
	
	

}
