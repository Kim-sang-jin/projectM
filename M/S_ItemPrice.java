package M;

import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;

interface S_ItemPrice {
	public ArrayList<Integer> Price = new ArrayList<Integer>();

	ImageIcon I1 = new ImageIcon("images/파프니르.png"); 
	Image i1 = I1.getImage();
	ImageIcon I2 = new ImageIcon("images/타일런트.png");
	Image i2 = I2.getImage();
	ImageIcon I3 = new ImageIcon("images/앱솔랩스.png");
	Image i3 = I3.getImage();
	ImageIcon I4 = new ImageIcon("images/아케인셰이드.png");
	Image i4 = I4.getImage();
	public Image[] iGroup = {i1, i2, i3, i4};
	
	public static int Fafnir[] = {136000,271000,406000,
			541000,676000,811000,946000,1081000,
			1216000,1351000,5470800,6919400,
			8588400,10490600,12638500,30087200,
			35437900,41351400,47850600,54958200,
			62696400,71087200,80152000,89912300,
			100389000};
	
	public static final int Tyrant = 55833200;
	
	public static int AbsoLab[] = {164800,328700,492500,
			656400,820200,984000,1147900,1311700,
			1475600,1639400,6639400,8397300,
			10422900,12731500,15338200,36514500,
			43008300,50185100,58072700,66698700,
			76090000,86273300,97274600,109120000,
			121834900};
	
	public static int Arcane[] = {321000,641000,961000,
			1281000,1601000,1921000,2241000,
			2561000,2881000,3201000,12966500,
			16400100,20356300,24865300,29956500,
			71316500,83999600,98016700,113422300,
			130270000,148612400,168501500,
			189988600,213124000,237957700};
	
	public static int percentS[] = {950, 900, 850, 850, 800, 
			750, 700, 650, 600, 550, 450, 350, 300, 300, 300,
			300, 300, 300, 300, 300, 300, 300, 30, 20, 10};
	
	public static int percentD[] = {50,100,150,150,200,250,300,350,400,450,
			550,650,693,686,686,700,679,679,672,672,700,630,776,686,594};
	
	public static int percentTS[] = {500, 500, 450, 400, 400,
			400, 400, 400, 400, 370, 350, 350, 30, 20, 10};
	
	public static int percentTD[] = {500, 500, 550, 600, 600,
			582, 570, 558, 540, 535, 520, 487, 485, 490, 495};
}
