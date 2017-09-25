import javax.swing.*;

public class Kapitel5{
	public static void main(String[] args) {
		char a1 = '\u00E5'; //å
		char a2 = '\u00E4'; //ä
		char o1 = '\u00F6'; //ö

		String ns = JOptionPane.showInputDialog(null, "Vilket heltal vill du anv" + a2 + "nda?");
		int n = Integer.parseInt(ns);
		int sum = 0;
		while(n>0){
			sum = sum + n * n; 
			n = n - 1;
		} 
		JOptionPane.showMessageDialog(null, "Summan blir " + sum);
	}
}