package it.shop;

public class Main {

	public static void main(String[] args) {

		System.out.println("Nuovo prodotto: ");

		Prodotto prodotto = new Prodotto(null, null, 0, 0);

		prodotto.setNome(null);
		prodotto.setDescrizione(null);
		prodotto.setPrezzo(0);
		prodotto.setIva(0);

		System.out.println("Nome esteso: " + prodotto.nomeEsteso() + "\nCodice prodotto: " + prodotto.getCodice()
				+ "\nNome del proddotto: " + prodotto.getNome() + "\nDescrizione del prodotto: "
				+ prodotto.getDescrizione() + "\nPrezzo del prodotto senza IVA: " + prodotto.getPrezzo() + " euro"
				+ "\nPrezzo del prodottto con IVA: " + prodotto.stampaPrezzoConIva() + " euro");
	}

}
