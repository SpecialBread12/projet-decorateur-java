package decoration;

import modele.Message;

public class EncripteurCaesar extends Message{
	
	protected Message message;
	protected String encription;
	protected int offset;
	
	public EncripteurCaesar(Message message, int offset) {
		this.offset = offset;
		this.message = message;
		this.encripter(message, offset);
	}

	
	private void encripter (Message message, int offset) {
		StringBuilder caesar = new StringBuilder();
		for (char character : message.getText().toCharArray()) {
		    if (character != ' ') {
		        int originalAlphabetPosition = character - 'a';
		        int newAlphabetPosition = (originalAlphabetPosition + offset) % 26;
		        char newCharacter = (char) ('a' + newAlphabetPosition);
		        caesar.append(newCharacter);
		        //System.out.println(caesar);
		    } else {
		        caesar.append(character);


		    }
	        
		}
		this.encription = caesar.toString();
		//System.out.println(encription);
	}
	
	
	
	public String getText() {
		return this.encription;
	}
	
	public void setText(String text) {
		
		this.message.setText(text);
		this.encripter(message, offset);
	}
	public String getAuteur() {
		return auteur;
	}
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
}
