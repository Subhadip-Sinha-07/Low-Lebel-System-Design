package design_logging_system;

public abstract class LogProcessor {

	int info = 1;
	int debug = 2;
	int error = 3;

	LogProcessor logProcessor;

	public LogProcessor(LogProcessor logProcessor) {
		this.logProcessor = logProcessor;
	}

	public void log(int loglebel, String message) {
		if (logProcessor != null) {
			logProcessor.log(loglebel, message);
		}
	}
}
