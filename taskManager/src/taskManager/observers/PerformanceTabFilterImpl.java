package taskManager.observers;

/**
 * PerformanceTabFilterImpl ---checks filter condition
 * @author    	Amogh Lale
 */
import taskManager.filter.DashboardFilter;
import taskManager.util.MyLogger;

public class PerformanceTabFilterImpl implements DashboardFilter {
	MyLogger myLog=MyLogger.getInstance();

	/**
	   * checks filter 
	   * @param String
	   * @exception No exception
	   * @return Boolean 
	   */	
 public boolean check(String s){
	 myLog.printToStdout(3, "check of PerformanceTabFilterImpl called");
	 if(s.equals("Performance")) 
			return true;
	    return false; 
 }
 
 /**
  * Default toString() method of PerformanceTabFilterImpl Class. 
  * @param No arguments
  * @exception No exception
  * @return returns the string in retVal.
  */
 public String toString() {
	  	String retValue = "\n toString() method of PerformanceTabFilterImpl Class \n";
	  	myLog.printToStdout(3, "toString() method of PerformanceTabFilterImpl is called");
		return retValue;
	    }

}
