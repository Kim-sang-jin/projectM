package M;

import java.awt.*;
import javax.swing.*;

public class SimulInter extends JPanel{
	ButtonGroup Sg = new ButtonGroup();
	JRadioButton Sb1 = new JRadioButton("파프니르");
	JRadioButton Sb2 = new JRadioButton("타일런트");
	JRadioButton Sb3 = new JRadioButton("앱솔랩스");
	JRadioButton Sb4 = new JRadioButton("아케인셰이드");
	
	public void paintComponent(Graphics g) {
		setLayout(null);
		Sg.add(Sb1); Sg.add(Sb2); Sg.add(Sb3); Sg.add(Sb4);
		Sb1.setLocation(200, 250);
		Sb1.setSize(200,50);
		Sb2.setLocation(700, 250);
		Sb2.setSize(200,50);
		Sb3.setLocation(200, 550);
		Sb3.setSize(200,50);
		Sb4.setLocation(700, 550);
		Sb4.setSize(200,50);
		add(Sb1); add(Sb2); add(Sb3); add(Sb4);
		
		g.drawImage(S_ItemPrice.iGroup[0], 100, 0, 300, 250, this);
		g.drawImage(S_ItemPrice.iGroup[1], 600, 0, 300, 250, this);
		g.drawImage(S_ItemPrice.iGroup[2], 100, 300, 300, 250, this);
		g.drawImage(S_ItemPrice.iGroup[3], 600, 300, 300, 250, this);
		
		g.setFont(new Font("고딕체", Font.BOLD, 30));
		g.drawString("<강화할 아이템을 선택하세요>", 275, 700);
	}
}
