package jenkins;


import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Basic {
	static Logger logger = LogManager.getLogger(Basic.class);
	public static void main(String[] args) {
		BasicConfigurator.configure(); 
		System.out.println("Hello world!!!");
		logger.info("Hello World created");
	}
}
