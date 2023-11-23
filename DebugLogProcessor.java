package design_logging_system;

public class DebugLogProcessor extends LogProcessor {

	public DebugLogProcessor(LogProcessor logProcessor) {
		super(logProcessor);
		// TODO Auto-generated constructor stub
	}

	public void log(int loglebel, String message) {
		if (loglebel == 2) {
			System.out.println("debug log added");
		} else {
			super.log(loglebel, message);
		}
	}
}
