package exception;

public class AuthorityException extends CreateException {
	public AuthorityException(Exception e) {
		super(e);
	}

	public AuthorityException(String message) {
		super(message);
	}
}
