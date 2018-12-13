package M;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SimulInter2 extends JPanel{
	private Image image;
	public Integer RF = 0; 
	public Integer RFnum = 0;
	public Double total = 0.0;
	public String getTotal = "0";
	public double per[] = {0.0,0.0,0.0,0.0};
	int getImage = 0;
	JButton RFb = new JButton("강화!!");
	JButton RFb5 = new JButton("5성부터");
	JButton RFb10 = new JButton("10성부터");
	JButton RFb15 = new JButton("15성부터");
	Simulator simulator = new Simulator();
	
	public void getImage(int i) {
		image = S_ItemPrice.iGroup[i];
		getImage = i;
		if(i==1) per = simulator.resetT(0);
		else per = simulator.reset(0);
	}
	
	public void paintComponent(Graphics g) {
		setLayout(null);
		super.paintComponent(g);
		g.drawImage(image, 300, 200, 400, 300, this);
		g.setFont(new Font("고딕체", Font.BOLD, 60));
		g.drawString("+ " + RF.toString(), 725, 175);
		g.setFont(new Font("고딕체", Font.BOLD, 40));
		g.drawString(getTotal + "메소", 40, 40);
		g.drawString(RFnum + "회", 40, 80);
		g.setFont(new Font("고딕체", Font.BOLD, 15));
		g.drawString("<타일런트 아이템에 사용불가>", 735, 640);
		
		g.setFont(new Font("고딕체", Font.BOLD, 30));
		g.drawString("성공확률: " + ((Double)per[0]).toString(), 30, 300);
		g.drawString("유지확률: " + ((Double)per[1]).toString(), 30, 330);
		g.drawString("실패확률: " + ((Double)per[2]).toString(), 30, 360);
		g.drawString("파괴확률: " + ((Double)per[3]).toString(), 30, 390);
	}
	
	public SimulInter2() {
		setLayout(null);
		RFb.setLocation(425, 575);
		RFb.setSize(150,70);
		add(RFb);
		RFb5.setLocation(760, 260);
		RFb5.setSize(150,70);
		add(RFb5);
		RFb10.setLocation(760, 400);
		RFb10.setSize(150,70);
		add(RFb10);
		RFb15.setLocation(760, 540);
		RFb15.setSize(150,70);
		add(RFb15);
	
		RFb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RFnum++;
				if(getImage==1) {
					if(RF==15) return;
					
					total += S_ItemPrice.Tyrant;
					getTotal = String.format("%.0f", total);
					int checkSuccess = simulator.getPriceT(RF);
					
					if(checkSuccess==0) {
						RF++;
					}
					else if(checkSuccess==1) {
						if(RF>0) RF--;
					}
					else{
					 JOptionPane.showMessageDialog(null, "장비가 파괴되었습니다.", "Destroyed", JOptionPane.ERROR_MESSAGE);
					 total = 0.0; RF = 0; RFnum = 0;
					 getTotal = String.format("%.0f", total);
					}
					per = simulator.resetT((int)RF); repaint();
					if(RF==12) {
						int cTnue = JOptionPane.showConfirmDialog(null, "12성을 달성하셨습니다! 계속 하시겠습니까\n 주의: 다음 강화 성공 확률은 3%입니다.", 
								"Congratulation!!", JOptionPane.YES_NO_OPTION); 
						if(cTnue == JOptionPane.NO_OPTION) {
							JOptionPane.showMessageDialog(null, "사용한 금액: " + getTotal + "메소", "Success", JOptionPane.INFORMATION_MESSAGE);
							total = 0.0; RF = 0; RFnum = 0;
							getTotal = String.format("%.0f", total);
							per = simulator.reset((int)RF);
						}					
					}
				}
				else {
					if(RF==25) return;//여기 수정
	
					total += S_ItemPrice.Price.get(RF);
					getTotal = String.format("%.0f", total);
					int checkSuccess = simulator.getPrice(RF);
					
					if(checkSuccess==0) {
						RF++;
					}
					else if(checkSuccess==1) {
						if(RF>=5 && RF%5!=0) RF--;
					}
					else{
					 JOptionPane.showMessageDialog(null, "장비가 파괴되었습니다.", "Destroyed", JOptionPane.ERROR_MESSAGE);
					 total = 0.0; RF = 0; RFnum = 0;
					 getTotal = String.format("%.0f", total);
					 repaint();
					}
					per = simulator.reset((int)RF); repaint();
					if(RF==22) {
						int cTnue = JOptionPane.showConfirmDialog(null, "22성을 달성하셨습니다! 계속 하시겠습니까\n 주의: 다음 강화 성공 확률은 3%입니다.", 
								"Congratulation!!", JOptionPane.YES_NO_OPTION);
						if(cTnue == JOptionPane.NO_OPTION) {
							JOptionPane.showMessageDialog(null, "사용한 금액: " + getTotal + "메소", "Success", JOptionPane.INFORMATION_MESSAGE);
							total = 0.0; RF = 0; RFnum = 0;
							getTotal = String.format("%.0f", total);
							per = simulator.reset((int)RF);
						}
					}
				}	
				repaint();
			}
		});
		
		RFb5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				total = 0.0; RF = 5; RFnum = 0;
				getTotal = String.format("%.0f", total);
				
				if(getImage == 1) per = simulator.resetT((int)RF);
				else per = simulator.reset((int)RF);
				repaint();
			}
		});
		
		RFb10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				total = 0.0; RF = 10; RFnum = 0;
				getTotal = String.format("%.0f", total);
				
				if(getImage == 1) per = simulator.resetT((int)RF);
				else per = simulator.reset((int)RF);
				repaint();
			}
		});
		
		RFb15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(getImage==1) {
					JOptionPane.showMessageDialog(null, "타일런트 아이템엔 사용할 수 없습니다.", "Destroyed", JOptionPane.ERROR_MESSAGE);
					return;
				}
				total = 0.0; RF = 15; RFnum = 0;
				getTotal = String.format("%.0f", total);
				per = simulator.reset((int)RF);
				repaint();
			}
		});
	}
}	