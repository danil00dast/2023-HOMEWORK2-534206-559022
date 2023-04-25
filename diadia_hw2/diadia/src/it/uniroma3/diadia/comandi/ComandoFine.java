package it.uniroma3.diadia.comandi;

import it.uniroma3.diadia.IO;
import it.uniroma3.diadia.Partita;

public class ComandoFine implements Comando {

	private IO io;
	private final static String NOME = "fine";
	public final static String FINE = "Grazie di aver giocato!!";


	@Override
	public void esegui(Partita partita) {
		partita.setFinita();
		io.mostraMessaggio(FINE); 
}

	@Override
	public void setParametro(String parametro) {
		}

	@Override
	public String getParametro() {
		return null;
	} 

    @Override
	public void setIo(IO io) {
		this.io = io;
	}
	
	@Override
	public String getNome() {
		return NOME;
	}

}
