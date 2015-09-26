package taskManager.observers;

/**
 * UsersTabFilterImpl ---checks filter condition
 * @author    	Amogh Lale
 */
import taskManager.filter.DashboardFilter;
import taskManager.util.MyLogger;

public class UsersTabFilterImpl implements DashboardFilter {
	MyLogger myLog=MyLogger.getInstance();

	/**
	   * checks filter 
	   * @param String
	   * @exception No exception
	   * @return Boolean 
	   */
	public boolean check(String s){
		 myLog.printToStdout(3, "check of UsersTabFilterImpl called");
		if(s.equals("Users")) 
			return true;
	    return false;   
	}
	
	/**
	  * Default toString() method of UsersTabFilterImpl Class. 
	  * @param No arguments
	  * @exception No exception
	  * @return returns the string in retVal.
	  */
	 public String toString() {
		  	String retValue = "\n toString() method of UsersTabFilterImpl Class \n";
		  	myLog.printToStdout(3, "toString() method of UsersTabFilterImpl is called");
			return retValue;
		    }
}
