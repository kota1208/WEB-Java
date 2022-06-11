package exception;

import java.io.IOException;

public class CreateException extends IOException {
	public CreateException(String message) {
		super(message);
	}
	
	public CreateException(Exception e) {
		super(e);
	}
}
