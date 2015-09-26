package taskManager.observers;

/**
 * ProcessesTabFilterImpl ---checks filter condition
 * @author    	Amogh Lale
 */
import taskManager.filter.DashboardFilter;
import taskManager.util.MyLogger;

public class ProcessesTabFilterImpl implements DashboardFilter {
	MyLogger myLog=MyLogger.getInstance();

	/**
	   * checks filter 
	   * @param String
	   * @exception No exception
	   * @return Boolean 
	   */
	public boolean check(String s){
		 myLog.printToStdout(3, "check of ProcessesTabFilterImpl called");
		if(s.equals("Processes")) 
			return true;
	    return false;  
	 }
	
	/**
	  * Default toString() method of ProcessesTabFilterImpl Class. 
	  * @param No arguments
	  * @exception No exception
	  * @return returns the string in retVal.
	  */
	 public String toString() {
		  	String retValue = "\n toString() method of ProcessesTabFilterImpl Class \n";
		  	myLog.printToStdout(3, "toString() method of ProcessesTabFilterImpl is called");
			return retValue;
		    }

	
}
