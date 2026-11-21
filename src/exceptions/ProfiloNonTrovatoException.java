package exceptions;

public class ProfiloNonTrovatoException extends AccessoException {

	public ProfiloNonTrovatoException () {
		super("L'username inserito non corrisponde a nessun utente.");
	}
}
