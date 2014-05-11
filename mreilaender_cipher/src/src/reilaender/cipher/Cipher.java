package src.reilaender.cipher;

/**
 * Interface for all Ciphers in <code>reilaender.cipher</code>.
 * 
 * @author Manuel Reiländer
 *
 */
public interface Cipher {

	/**
	 * <p>Method used to encrypt the given message.</p>
	 * @param 	To encrypted Message
	 * @return 	The to encrypting Message
	 */
	public String encrypt(String text);
	
	/**
	 * <p>Method used to decrypt the given message.</p>
	 * @param 	To decrypted code/password/text
	 * @return 	The to decrypting Message
	 */
	public String decrypt(String text);
}
