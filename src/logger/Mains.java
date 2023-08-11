package logger;
import logger.debugLogProcessor;
import logger.errorLogProcessor;
public class Mains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		debugLogProcessor d = new debugLogProcessor(new errorLogProcessor(null));
		
		d.log(2, "debug is here");

	}

}
