package keyPresses;

import javax.swing.JComponent;
import javax.swing.KeyStroke;

public class KeyBindings extends JComponent
{
	MoveLeft moveLeft;
	MoveRight moveRight;

	public KeyBindings()
	{
		moveLeft = new MoveLeft();
		moveRight = new MoveRight();
		
		getInputMap().put(KeyStroke.getKeyStroke("A"), "MoveLeft");
		getInputMap().put(KeyStroke.getKeyStroke("D"), "MoveRight");
		
		getActionMap().put("MoveLeft", moveLeft);
		getActionMap().put("MoveRight", moveRight);
	}
	
	

}
