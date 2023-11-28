import decoration.Encripteur;
import decoration.EncripteurAES;
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
		
		
		Message message1 = new Message("caesar est faible");
		System.out.println(message1.getText());
		EncripteurCaesar caesar = new EncripteurCaesar(message1, 15);
		System.out.println(caesar.getText());
		
		Message messageAES = new Message("my password is : XD");
		EncripteurAES aes = new EncripteurAES(messageAES.getText(), "unga");
		System.out.println();
	}

}
