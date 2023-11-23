package design_logging_system;

public class ErrorLogProcessor extends LogProcessor{

	public ErrorLogProcessor(LogProcessor logProcessor) {
		super(logProcessor);
		// TODO Auto-generated constructor stub
	}
    
	public void log(int loglebel, String message) {
		if (loglebel == 3) {
			System.out.println("Error log added");
		} else {
			super.log(loglebel, message);
		}
	}
	
}
