package homework3;

@SuppressWarnings("serial")
public class MyException extends Exception {

	@Override
	public String getMessage() {
		return "Impossible to add new student. Group is filled.";
	}

}
