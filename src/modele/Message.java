package modele;

public class Message {
	protected String text;
	protected String auteur;
	
	public Message(String text, String auteur) {
		this.text = text;
		this.auteur = auteur;
	}
	
	public Message(String text) {
		this.text = text;
		this.auteur = "inconnu";
	}
	
	public Message() {
		
	}
	
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getAuteur() {
		return auteur;
	}
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
}
