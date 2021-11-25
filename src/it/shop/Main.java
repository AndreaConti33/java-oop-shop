package it.shop;

public class Main {

	public static void main(String[] args) {

		System.out.println("Nuovo prodotto:");
		Prodotto prodotto1 = new Prodotto();
		
		System.out.println("Nome esteso: "+ prodotto1.nomeEsteso() + "\nCodice prodotto: " + prodotto1.getCodice() + "\nNome del prodotto: " + prodotto1.getNome() + "\nDescrizione del prodotto: " + prodotto1.getDescrizione() + "\nPrezzo del prodotto senza IVA: " + prodotto1.getPrezzo() + " euro" + "\nPrezzo del prodotto con IVA: " + prodotto1.stampaPrezzoConIva() + " euro");

//		// Costruttore di debug
//		System.out.println("Nuovo prodotto (debug): ");
//
//		// Debug
//		Prodotto prodottoDebug = new Prodotto(0, "Uova", "10x10", 5, 0.22);
//
//		System.out.println("Nome esteso: " + prodottoDebug.nomeEsteso() + "\nCodice prodotto: "
//				+ prodottoDebug.getCodice() + "\nNome del proddotto: " + prodottoDebug.getNome()
//				+ "\nDescrizione del prodotto: " + prodottoDebug.getDescrizione() + "\nPrezzo del prodotto senza IVA: "
//				+ prodottoDebug.getPrezzo() + " euro" + "\nPrezzo del prodottto con IVA: "
//				+ prodottoDebug.stampaPrezzoConIva());
//
//		prodottoDebug.setNome(null);
//		prodottoDebug.setDescrizione(null);
//		prodottoDebug.setPrezzo(0);
//		prodottoDebug.setIva(0);
//
//		System.out.println("Nome esteso: " + prodottoDebug.nomeEsteso() + "\nCodice prodotto: "
//				+ prodottoDebug.getCodice() + "\nNome del proddotto: " + prodottoDebug.getNome()
//				+ "\nDescrizione del prodotto: " + prodottoDebug.getDescrizione() + "\nPrezzo del prodotto senza IVA: "
//				+ prodottoDebug.getPrezzo() + " euro" + "\nPrezzo del prodottto con IVA: "
//				+ prodottoDebug.stampaPrezzoConIva());
	}

}
