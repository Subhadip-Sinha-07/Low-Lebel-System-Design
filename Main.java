package design_logging_system;

public class Main {

	public static void main(String[] args) {
		LogProcessor lp = new InfoLogProcessor(new ErrorLogProcessor(new DebugLogProcessor(null)));
		lp.log(2, "error");
		lp.log(1, "error");
	}
}