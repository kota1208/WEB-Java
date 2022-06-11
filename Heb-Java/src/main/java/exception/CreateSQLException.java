package exception;

import java.io.IOException;

public class CreateSQLException extends IOException {
	public CreateSQLException(String message) {
		super(message);
	}
	
	public CreateSQLException(Exception  e) {
		super(e);
	}
}
