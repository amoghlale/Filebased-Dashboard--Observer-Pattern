package taskManager.observers;

/**
 * UsersTab --- 	It has an update method and display 
 * 					file method. It also has a method to
 * 					write to a file	
 * @author    	Amogh Lale
 */
import java.util.ArrayList;

import taskManager.display.DisplayFile;
import taskManager.filter.DashboardFilter;
import taskManager.subject.Subject;
import taskManager.util.FileProcessorInterface;
import taskManager.util.MyLogger;

public class UsersTab implements Observer, DisplayFile {

	private Subject ds; //ds used incase we need to unregister Observer
	public DashboardFilter df;
	public FileProcessorInterface fp1;
	ArrayList<String> userlist=null;
	MyLogger myLog=MyLogger.getInstance();
	String inFromsubjImpl;
	String[] user_entry;
	String[] userStatus;
	
	/**
	   * Parametrized Constructor
	   * @param Subject,FileProcessorInterface
	   * @exception No exception
	   * @return No Return Value.
	   */
	public UsersTab(Subject ds2, FileProcessorInterface fp) {
		myLog.printToStdout(2, "Parametrized Constructor of UsersTab called");
		 this.ds=ds2; // incase you want to remove observer
		 fp1=fp;
	}
	
	/**
	   * Update method. 
	   * @param String
	   * @exception No exception
	   * @return No Return value.
	   */
	public void update(String tabentries) {
		myLog.printToStdout(3, "update of UsersTab called");
		int i,j;
		userlist = new ArrayList<String>();
		inFromsubjImpl=tabentries.substring(6);
	    userlist.add("---USERS---");
		j=1;
	 
		user_entry=inFromsubjImpl.split("\\-");
		for(i=0;i<user_entry.length;i++)
		{	
            
			userStatus=user_entry[i].split("\\:");
	        userlist.add(userStatus[0].toString());
		    userlist.add(userStatus[1].toString());
		    j+=2;
		
		}
		sendToOutputFile(userlist.get(0)+"\n");
		for(i=1;i<userlist.size()-1;i+=2)
		   {
			sendToOutputFile("User: "+userlist.get(i)+ "  Status: " +userlist.get(i+1)+"\n");
		   }
		sendToOutputFile("\n");
		displayFile();
		
	}
    
	/**
	   * Displays file contents 
	   * @param No Arguments
	   * @exception No exception
	   * @return No Return value.
	   */
    public void displayFile() {
    	myLog.printToStdout(1, "displayFile of UsersTab called");
    	myLog.printToStdout(1,userlist.get(0)+"\n");
	   for(int i=1;i<userlist.size()-1;i+=2)
	   {
		   myLog.printToStdout(1,"User: "+userlist.get(i)+ "  Status: " +userlist.get(i+1));
		   
	   }
    }
    
    /**
	   * Writes to output file
	   * @param String
	   * @exception No exception
	   * @return No Return value.
	   */
    public void sendToOutputFile(String outdata){
	  myLog.printToStdout(3, "sendToOutputFile of UsersTab called");
	  fp1.writefile(outdata);  
  }
  
    /**
	   * Default toString() method of UsersTab Class. 
	   * @param No arguments
	   * @exception No exception
	   * @return returns the string in retVal.
	   */
	 public String toString() {
		  	String retValue = "\n toString() method of UsersTab Class \n";
		  	myLog.printToStdout(3, "toString() method of UsersTab is called");
			return retValue;
		    }
}
