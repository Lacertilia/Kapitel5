import javax.swing.*;

public class Kapitel5{
	public static void main(String[] args) {
		char a1 = '\u00E5'; //å
		char a2 = '\u00E4'; //ä
		char o1 = '\u00F6'; //ö

		/*String ns = JOptionPane.showInputDialog(null, "Vilket heltal vill du anv" + a2 + "nda?");
		int n = Integer.parseInt(ns);
		int sum = 0;
		for (n = n; n > 0; n = n - 1) {
			sum = sum + n * n; 
			
		}
			
		 
		JOptionPane.showMessageDialog(null, "Summan blir " + sum);*/
		/*
		double n = Double.parseDouble(ns);
		double sum = 0;
		while (n>0){
			sum = sum + 1 / n;
			n = n - 1;
		}
		JOptionPane.showMessageDialog(null, "Summan blir " + sum);
		*/
		/*String hs;
		double h;
		while(true){


			hs = JOptionPane.showInputDialog(null, "H" + o1 + "jd?\nMeter");
			if(hs == null){
				break;
			}else{
			h = Double.parseDouble(hs);
			int bounce = 0;
		

		
			while(h > 0.01){
				bounce = bounce + 1;
				h = h * 0.7;
			}
			JOptionPane.showMessageDialog(null, "Bollen stutsade " + bounce + " ggr");
			}
		}*/
		/*String s = JOptionPane.showInputDialog(null, "Skriv din text.");
		int i;
		for (i=0; i<s.length();i=i+1)
			if(s.charAt(i) == ' ' && s.lastIndexOf(" ") == i){
				break;
			}
			if(i<s.length()){
				i = i + 1;
				JOptionPane.showMessageDialog(null, "Sista vita tecknet finns p" + a1 + " plats: " + i);
			}else {
				JOptionPane.showMessageDialog(null, "Finns inga vita tecken.");
			}*/
		/*double x, y;
		String tabell = "";
		for(x=-1; x<=1; x=x+0.1){
			y = (2 * x * x) - (5 * x) + 1;
			tabell = tabell + x + "      " + y + "\n";
		}
		JOptionPane.showMessageDialog(null, tabell);*/
		/*String m = "", sn = "";
		String ns = JOptionPane.showInputDialog(null, "Hur m" + a1 + "nga rader skall skrivas?");
		int n = Integer.parseInt(ns);
		int n2 = n;
		for(n2=n2;n2>0;n2--){
			m=m + "+";
		}
		for(n=n; n>0; n--){
				sn = sn + m + "\n";
				m = m.substring(1);
		}
		
		JOptionPane.showMessageDialog(null, sn);*/
		/*int i = 1;
		String s = "";
		for(i = 1; i < 13; i++){
			s = s + i + " " + (i * i) + " " + (i * i * i) + "\n";
		}
		JOptionPane.showMessageDialog(null, s);*/
		/*double i = 0; 
		double sum = 0;
		for(i = 1; i <= 10001; i++){
			sum = sum + (1/i);
		}
		JOptionPane.showMessageDialog(null, sum);*/
		
	}
}