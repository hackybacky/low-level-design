package logger;
import logger.logProcessor;

public class errorLogProcessor extends logProcessor {

	public errorLogProcessor(logProcessor next)  {
		// TODO Auto-generated constructor stub
		super(next);
		
	}
	
	public void log(int error , String message) {
		if(error == ERROR) {
			System.out.println(message);
		}
		else {
			super.log(error, message);
		}
	}

}
