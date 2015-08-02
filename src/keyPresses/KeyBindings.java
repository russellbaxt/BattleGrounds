package keyPresses;

import javax.swing.JComponent;
import javax.swing.KeyStroke;

public class KeyBindings extends JComponent
{
	
	protected MoveLeft moveLeft;
	protected MoveRight moveRight;
	protected MoveDown moveDown;
	protected MoveUp moveUp;
	
	public KeyBindings()
	{
	
		moveLeft = new MoveLeft();
		moveRight = new MoveRight();
		moveDown = new MoveDown();
		moveUp = new MoveUp();
		
		getInputMap().put(KeyStroke.getKeyStroke("A"), "MoveLeft");
		getInputMap().put(KeyStroke.getKeyStroke("D"), "MoveRight");
		getInputMap().put(KeyStroke.getKeyStroke("S"), "MoveDown");
		getInputMap().put(KeyStroke.getKeyStroke("W"), "MoveUp");
		
		getActionMap().put("MoveLeft", moveLeft);
		getActionMap().put("MoveRight", moveRight);
		getActionMap().put("MoveDown", moveDown);
		getActionMap().put("MoveUp", moveUp);
	}
	
}
