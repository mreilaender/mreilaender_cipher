package src.reilaender.cipher;

/**
 * <p><code>SubstitutionCipher</code>, used to en- and decrypt Strings.</p>
 * 
 * @author Manuel Reiländer
 *
 */
public class SubstitutionCipher extends MonoalphabeticCipher {
	/**
	 * Standard Constructor
	 * 
	 * @param secretAlphabet the secret alphabet for this SubstitutionCipher
	 */
	public SubstitutionCipher(String secretAlphabet) {
		setSecretAlphabet(secretAlphabet);
	}
	@Override
	public void setSecretAlphabet(String alphabet) {
		super.setSecretAlphabet(alphabet);
	}
}