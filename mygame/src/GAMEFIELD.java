import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.Timer;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class GAMEFIELD extends JPanel implements ActionListener{
	private final int SIZE = 320;
	private final  int RazmerYABLOK_SIZE = 16;
	private final int VSEYABLOKI_DOTS = 400;
	private Image dot;
	private Image apple;
	private int appleX;
	private int appleY;
	private int [] x = new int [VSEYABLOKI_DOTS];
	private int [] y = new int [VSEYABLOKI_DOTS];
	private int dots;
	private Timer timer;
	private boolean left = false;
	private boolean right = true;
	private boolean up = false;
	private boolean down = false;
	private boolean inGame = true;
	
	public GAMEFIELD() {
		setBackground(Color.blue);
		ZagruzkaKartinok();
		
	}
	public void IMINDAGAME() {
		dots = 3;
		for (int i =0; i < dots; i ++) {
			x[i] = 48 - i*RazmerYABLOK_SIZE;
			y[i] = 48;
			
		}
	    timer = new Timer(250.this);
		timer.start();
		createApple();
		
		
	}
	public void createApple() {
		appleX = new Random().nextInt(20)*RazmerYABLOK_SIZE;
		appleY = new Random().nextInt(20)*RazmerYABLOK_SIZE;// TODO Auto-generated method stub
		
	}
	public void ZagruzkaKartinok() {
		ImageIcon icn = new ImageIcon ("apple.png");
		apple = icn.getImage();
		ImageIcon icn1 = new ImageIcon ("dot.png");
		dot = icn1.getImage();
	}
	public void move() {
		for (int i = dots; i >0; i --) {
			x[i] = x [i -1]; // permeshaem ostal'nie chasti zveiki
			y[i] = y [i-1];
		}
	}
	public void actionPerfomed(ActionEvent e) {
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(inGame) {
			move();
		}
		// TODO Auto-generated method stub
		
	}

}
