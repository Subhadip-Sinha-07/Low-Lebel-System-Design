package design_logging_system;

public class InfoLogProcessor extends LogProcessor {

	public InfoLogProcessor(LogProcessor logProcessor) {
		super(logProcessor);
		// TODO Auto-generated constructor stub
	}

	public void log(int loglebel, String message) {
		if (loglebel == 1) {
			System.out.println("Info log added");
		} else {
			super.log(loglebel, message);
		}
	}

}
