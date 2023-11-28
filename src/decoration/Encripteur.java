package decoration;

import modele.Message;

public class Encripteur extends Message{
	
	protected Message message;
	protected String encription;
	
	public Encripteur(Message message) {
		this.message = message;
		//this.encripter();
	}

	
	private void encripter1() {
	byte[] lettres = this.message.getText().getBytes();
	byte[] nouveau = new byte[lettres.length];
	for(int position = 0; position < lettres.length; position ++) {
		byte octet = lettres[position];
		char lettre = (char) lettres[position];
		if(lettre == 'e' || lettre == 'E') {
			lettre = '3';
		}
		nouveau[position] = (byte)lettre;
		
	}
		this.encription = new String(nouveau);
	}
	
	
	
	public String getText() {
		return this.encription;
	}
	
	public void setText(String text) {
		
		this.message.setText(text);
		//this.encripter();
	}
	public String getAuteur() {
		return auteur;
	}
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
}
