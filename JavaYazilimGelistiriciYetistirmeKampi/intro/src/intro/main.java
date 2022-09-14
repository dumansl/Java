package intro;

public class main {

	public static void main(String[] args) {
		System.out.println("Hello World!");
		
		// Degisken isimlendirmeleri java'da camelCase yazilir.
		String ortaMetin = "ilginizi cekebilir";
		String altMetin = "Vade Süresi";
		
		System.out.println(ortaMetin);
		System.out.println(altMetin);
		
		int vade = 12;
		
		double dolarDun = 18.25;
		double dolarBugun = 18.10;
		
		boolean dolarDustuMu = false;
		
		String okYonu = "";
		
		if (dolarBugun<dolarDun) {
			okYonu = "down.svg";
			System.out.println(okYonu);
		} else if (dolarBugun==dolarDun) {
			okYonu = "equal.svg";
			System.out.println(okYonu);
		}
		else {
			okYonu = "up.svg";
			System.out.println(okYonu);
		}
		
		//array 
		
		String[] krediler = {"Hızlı Kredi", "Maaşını Bankadan Alan", "Mutlu Emekli","Hızlı Kredi"};
		
		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
		}
		
	}
}
