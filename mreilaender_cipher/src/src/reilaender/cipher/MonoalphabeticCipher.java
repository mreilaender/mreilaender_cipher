package src.reilaender.cipher;

/**
 * @author Manuel Reiländer
 */
public abstract class MonoalphabeticCipher implements Cipher {

	/* Standard Alphabet: abcdefghijklmnopqrstuvwxyz */
	public static final char[] STANDARD_ALPHABET = "abcdefghijklmnopqrstuvwxyz".toCharArray();
	private char[] secretAlphabet;
	protected MonoalphabeticCipher()
	{
		
	}
	@Override
	public String encrypt(String text)
	{
		StringBuilder sb = new StringBuilder();
		text = text.toLowerCase();
		
		for(int i = 0; i < text.length(); i++) {
			
			int index = Utilities.arrayToList(STANDARD_ALPHABET).indexOf(text.charAt(i));
			if(index != -1) {
//				System.out.println("test");
				sb.append(secretAlphabet[index]);
			} else {
//				System.out.println("test");
				sb.append(text.indexOf(i));
			}
		}
		return sb.toString();
	}

	@Override
	public String decrypt(String text)
	{
		StringBuilder sb = new StringBuilder();
		text = text.toLowerCase();
//		System.out.println("has worked");
		for(int i = 0; i < text.length(); i++) {
			
			int index = Utilities.arrayToList(secretAlphabet).indexOf(text.charAt(i));
			if(index != -1) {
//				System.out.println("index != 1");
				sb.append(STANDARD_ALPHABET[index]);
			} else {
//				System.out.println("else");
				sb.append(text.indexOf(i));
			}
		}
		return sb.toString();
	}
	/**
	 * Erklärt sich von selbst
	 * @param alphabet
	 */
	protected void setSecretAlphabet(String alphabet)
	{
		if(alphabet.length() != STANDARD_ALPHABET.length) 
			throw new IllegalArgumentException("Illegal Argument! Length of the secret alphabet has to be: " + STANDARD_ALPHABET.length + ".\nBut given: " + alphabet.length() + "\n");
		else if(!Utilities.arrayToList(alphabet.toCharArray()).containsAll(Utilities.arrayToList(STANDARD_ALPHABET))) 
			throw new IllegalArgumentException("The given Secret Alphabet has to contain all letters just on time.\n");
		else secretAlphabet = alphabet.toLowerCase().toCharArray();
	}
}
