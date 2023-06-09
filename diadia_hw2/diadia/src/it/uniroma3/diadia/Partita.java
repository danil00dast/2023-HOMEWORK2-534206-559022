package it.uniroma3.diadia;
import it.uniroma3.diadia.ambienti.Labirinto;
import it.uniroma3.diadia.ambienti.Stanza;

import it.uniroma3.diadia.giocatore.Giocatore;

/**
 * Questa classe modella una partita del gioco
 *
 * @author  docente di POO
 * @see Stanza
 * @version base
 */

public class Partita {
    private Labirinto labirinto;
	private Giocatore giocatore;
	private boolean finita;

	public Partita(){
		labirinto = new Labirinto();
		giocatore = new Giocatore();
		labirinto.creaStanze();
		this.finita = false;
	}

	public void setLabirinto(Labirinto labirinto) {
		this.labirinto = labirinto;
	}

	public void setGiocatore(Giocatore giocatore) {
		this.giocatore = giocatore;
	}
	
	public Labirinto getLabirinto(){
		return labirinto;
	}
	
	public Giocatore getGiocatore() {
		return giocatore;
	}

	public void setStanzaCorrente(Stanza stanzaCorrente) {
		this.getLabirinto().setStanzaCorrente(stanzaCorrente);
	}

	public Stanza getStanzaCorrente() {
		return this.getLabirinto().getStanzaCorrente();
	}

	public boolean giocatoreConCfu() {
		if (this.giocatore.getCfu()>0)
			return true;
		else
		return false;
	}
	
	/**
	 * Restituisce vero se e solo se la partita e' stata vinta
	 * @return vero se partita vinta
	 */
	public boolean vinta() {
		return labirinto.getStanzaCorrente()==labirinto.getStanzaVincente();
	}

	/**
	 * Restituisce vero se e solo se la partita e' finita
	 * @return vero se partita finita
	 */
	public boolean isFinita() {
		return finita || (vinta()) || (this.getGiocatore().getCfu() == 0);
	}

	/**
	 * Imposta la partita come finita
	 *
	 */
	public void setFinita() {
		this.finita = true;
	}
}
