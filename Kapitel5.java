import javax.swing.*;

public class Kapitel5{
	public static void main(String[] args) {
		char a1 = '\u00E5'; //å
		char a2 = '\u00E4'; //ä
		char o1 = '\u00F6'; //ö

		/*String ns = JOptionPane.showInputDialog(null, "Vilket heltal vill du anv" + a2 + "nda?");
		int n = Integer.parseInt(ns);
		int sum = 0;
		while(n>0){
			sum = sum + n * n; 
			n = n - 1;
		} 
		JOptionPane.showMessageDialog(null, "Summan blir " + sum);*/
		/*String ns = JOptionPane.showInputDialog(null, "Vilket heltal?");
		double n = Double.parseDouble(ns);
		double sum = 0;
		while (n>0){
			sum = sum + 1 / n;
			n = n - 1;
		}
		JOptionPane.showMessageDialog(null, "Summan blir " + sum);*/
		String hs = JOptionPane.showInputDialog(null, "H" + o1 + "jd?\nMeter");
		double h = Double.parseDouble(hs);
		int bounce = 0;
		while(h > 0.01){
			bounce = bounce + 1;
			h = h * 0.7;
		}
		JOptionPane.showMessageDialog(null, "Bollen stutsade " + bounce + " ggr.");
	}
}