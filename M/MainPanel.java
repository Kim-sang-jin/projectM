package M;

import java.awt.*;
import javax.swing.*;

public class MainPanel extends JPanel{
	public JButton start = new JButton("Start!!");
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		start.setFont(new Font("∞ÌµÒ√º", Font.BOLD, 30));
		start.setSize(300, 150);
		start.setLocation(350, 450);
		add(start); 
		
		ImageIcon MI = new ImageIcon("images/BG.png");
		Image Mi = MI.getImage();
		g.drawImage(Mi, 150, 50, 700, 250, this);
		
		g.setFont(new Font("Stencil", Font.ITALIC, 50));
		g.drawString("Simulator", 600, 350);
	}
}