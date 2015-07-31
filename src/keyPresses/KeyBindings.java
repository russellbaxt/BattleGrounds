package keyPresses;

import javax.swing.JComponent;
import javax.swing.KeyStroke;

public class KeyBindings extends JComponent
{
	
	protected MoveLeft moveLeft;
	protected MoveRight moveRight;
	
	public KeyBindings()
	{
	
		moveLeft = new MoveLeft();
		moveRight = new MoveRight();
		
		this.getInputMap().put(KeyStroke.getKeyStroke("A"), "MoveLeft");
		this.getInputMap().put(KeyStroke.getKeyStroke("D"), "MoveRight");
		
		this.getActionMap().put("MoveLeft", moveLeft);
		this.getActionMap().put("MoveRight", moveRight);
	}
	
}
