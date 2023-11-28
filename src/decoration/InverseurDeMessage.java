package decoration;

import modele.Message;

public class InverseurDeMessage extends Message{
	protected Message message;
	protected String inversion;
	public InverseurDeMessage(Message message) {
		this.message = message;
		this.inverser();
	}

	
	private void inverser() {
		StringBuilder inverseur = new StringBuilder(this.message.getText());
		this.inversion = inverseur.reverse().toString();
		
	}
	
	public String getText() {
		return this.inversion;
	}
	public void setText(String text) {
		
		this.message.setText(text);
		this.inverser();
	}
	public String getAuteur() {
		return auteur;
	}
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
}
