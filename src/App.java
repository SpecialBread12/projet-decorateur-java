import decoration.Encripteur;
import decoration.EncripteurCaesar;
import decoration.InverseurDeMessage;
import decoration.Majuscule;
import modele.Message;

public class App {

	public static void main(String[] args) {
		System.out.println("hloo");
		int count = 0;
		Message message = new Message("naezi");
		
		/*while(count < 20) {
			System.out.println(message.getText());
			count ++;
		}*/
		Message messageInverse1 = new InverseurDeMessage(message);
		System.out.println(messageInverse1.getText());
		
		Message messageEnMajuscule = new Majuscule(messageInverse1);
		System.out.println(messageEnMajuscule.getText());
		
		Message messageEncripter = new Encripteur(message);
		System.out.println(messageEncripter.getText());
		int[] surrogates = {0xD83D, 0xDC7D};
		String alienEmojiString = new String(surrogates, 0, surrogates.length);
		System.out.println(alienEmojiString);
		System.out.println("\uD83D\uDC7D"); 
		
		
		Message message1 = new Message("Caesar est faible");
		EncripteurCaesar caesar = new EncripteurCaesar(message1, 10);
		System.out.println(caesar.getText());
	}

}
