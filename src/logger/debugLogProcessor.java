package logger;
import logger.logProcessor;

public class debugLogProcessor extends logProcessor {

	public debugLogProcessor(logProcessor next)  {
		// TODO Auto-generated constructor stub
		super(next);
		
	}
	
	public void log(int error , String message) {
		if(error == DEBUG) {
			System.out.println(message + "Debug is called");
		}
		else {
			super.log(error, message);
		}
	}

}
