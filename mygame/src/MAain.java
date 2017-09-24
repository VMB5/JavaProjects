import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class MAain extends JFrame {
	public MAain() {
		setTitle("Zmeika");
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setSize(320,345);
		setLocation(400,400);
		setVisible(true); 
		add(new GAMEFIELD());
	}
	public static void main (String[] args){
		MAain w = new MAain();
		
		
	}

}
