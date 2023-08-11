package logger;

public class logProcessor {
	public static int INFO = 1;
	public static int DEBUG = 2;
	public static int ERROR = 3;
	logProcessor next;
	public logProcessor(logProcessor next) {
		this.next = next;
	}
	public void log(int type , String message) {
		if(next != null) {
			next.log(type, message);
		}
	}

}
