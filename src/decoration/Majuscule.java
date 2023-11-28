package decoration;

import modele.Message;

public class Majuscule  extends Message{
	protected Message message;
	protected String majuscule;
	
	public Majuscule(Message message) {
		this.message = message;
		this.enMajuscule();
	}

	
	private void enMajuscule() {
		StringBuilder majusculeur = new StringBuilder(this.message.getText());
		this.majuscule = majusculeur.toString().toUpperCase();
		
	}
	
	public String getText() {
		return this.majuscule;
	}
	public void setText(String text) {
		
		this.message.setText(text);
		this.enMajuscule();
	}
	public String getAuteur() {
		return auteur;
	}
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
}
