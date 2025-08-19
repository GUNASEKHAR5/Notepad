package notepad;

import javax.swing.*;
import java.awt.*;

public class Notepad extends JFrame{
	private static final long serialVersionUID = 1L;
	
	Notepad(){
		setTitle("Notepad");
		ImageIcon note=new ImageIcon(ClassLoader.getSystemResource("notepad/icons/notepad.png"));
//		ImageIcon notepadIcon = new ImageIcon(ClassLoader.getSystemResource("notepad/icons/notepad.png"));
		Image icon=note.getImage();
		setIconImage(icon);
		
		setExtendedState(JFrame.MAXIMIZED_BOTH);
			
		setVisible(true);
	}

	public static void main(String[] args) {
		new Notepad();
	}

}