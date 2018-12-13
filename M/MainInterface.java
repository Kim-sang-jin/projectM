package M;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MainInterface extends JFrame implements S_ItemPrice{
	public MainPanel mainPanel;
	public SimulInter simulInter;
	public SimulInter2 simulInter2;
	public int getImage = 0;
	
	public MainInterface() {
		mainPanel = new MainPanel();
		simulInter = new SimulInter();
		simulInter2 = new SimulInter2();
		
		this.setTitle("M_Simulator");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setContentPane(mainPanel);
		setLayout(null);
		setSize(1000, 800);
		setVisible(true);
		
		mainPanel.start.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				Container c = getContentPane();
				c.setVisible(false);
				
				setContentPane(simulInter);
				setTitle("강화 시뮬레이터");
				setVisible(true);
			}
		});
		
		simulInter.Sb1.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent e) {
				for(int i = 0; i < 25; i++) {
					Price.add(Fafnir[i]);
				}
				Container c = getContentPane();
				c.setVisible(false);
				
				simulInter2.getImage(getImage);
				setContentPane(simulInter2);
				setVisible(true);
			}
		});
		
		simulInter.Sb2.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				Container c = getContentPane();
				c.setVisible(false);

				getImage = 1;
				simulInter2.getImage(getImage);
				setContentPane(simulInter2);
				setVisible(true);
			}
		});
		
		simulInter.Sb3.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				for(int i = 0; i < 25; i++) {
					Price.add(AbsoLab[i]);
				}
				Container c = getContentPane();
				c.setVisible(false);

				getImage = 2;
				simulInter2.getImage(getImage);
				setContentPane(simulInter2);
				setVisible(true);
			}
		});
		
		simulInter.Sb4.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				for(int i = 0; i < 25; i++) {
					Price.add(Arcane[i]);
				}
				Container c = getContentPane();
				c.setVisible(false);

				getImage = 3;
				simulInter2.getImage(getImage);
				setContentPane(simulInter2);
				setVisible(true);
			}
		});
	}
	
	public static void main(String[] args) {
		new MainInterface();
	}
}