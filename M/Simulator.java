package M;

public class Simulator implements S_ItemPrice{
	public int getPrice(int RF){
		int rfNum;
		rfNum = (int)(Math.random()*1000 + 1);
		if(rfNum <= percentS[RF]) return 0;
		else if(rfNum <= percentS[RF] + percentD[RF]) return 1;
		else return 2;
	}
	
	public int getPriceT(int RF) {
		int rfNum;
		rfNum = (int)(Math.random()*1000 + 1);
		if(rfNum <= percentTS[RF]) return 0;
		else if(rfNum <= percentTS[RF] + percentTD[RF]) return 1;
		else return 2;
	}
	
	public double[] reset(int RF) {
		double[] per = {0.0,0.0,0.0,0.0};
		per[0] = (double)(percentS[RF])/10;
		if(RF>=5 && RF%5!=0) {
			per[1] = (double)(percentD[RF])/10;
		}
		else per[2] = (double)(percentD[RF])/10;
		per[3] = (double)(1000-percentS[RF]-percentD[RF])/10;
		return per;
	}
	
	public double[] resetT(int RF) {
		double[] per = {0.0,0.0,0.0,0.0};
		per[0] = (double)(percentTS[RF])/10;
		if(RF>=5 && RF%5!=0) {
			per[1] = (double)(percentTD[RF])/10;
		}
		else per[2] = (double)(percentTD[RF])/10;
		per[3] = (double)(1000-percentTS[RF]-percentTD[RF])/10;
		return per;
	}
}
