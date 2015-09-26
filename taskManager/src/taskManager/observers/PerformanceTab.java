package taskManager.observers;
/**
 * PerformanceTab --- 	It has an update method and display 
 * 						file method	
 * @author    	Amogh Lale
 */
import java.util.ArrayList;

import taskManager.display.DisplayFile;
import taskManager.subject.Subject;
import taskManager.util.FileProcessorInterface;
import taskManager.util.MyLogger;

public class PerformanceTab implements Observer, DisplayFile {

	private Subject ds; //ds used incase we need to unregister Observer
	public FileProcessorInterface fp2;
	ArrayList<String> userlist=null; //Initilized to null
	MyLogger myLog=MyLogger.getInstance();
	String inFromsubjImpl;
	String[] performance_entry;
	
	/**
	   * Parametrized Constructor
	   * @param Subject,FileProcessorInterface
	   * @exception No exception
	   * @return No Return Value.
	   */
	public PerformanceTab(Subject ds2, FileProcessorInterface fp) {
		myLog.printToStdout(2, "Parametrized Constructor of PerformanceTab called");
		this.ds=ds2;
		fp2=fp;
		
	}
	
	
	/**
	   * Update method for PerformanceTab
	   * @param table entries
	   * @exception No exception
	   * @return No Return Value.
	   */
	public void update(String tabentries) {
		int i;
		myLog.printToStdout(3, "update of PerformanceTab called");
		userlist = new ArrayList<String>();
		inFromsubjImpl=tabentries.substring(12);
        userlist.add("---PERFORMANCE---");
		performance_entry=inFromsubjImpl.split("\\:");
		
		// add entries to arraylist
		for(i=0;i<performance_entry.length;i++)
		{
			userlist.add(performance_entry[i].toString());	
		}
	    
		// send to output file
		sendToOutputfile(userlist.get(0)+"\n");
		sendToOutputfile("Memory Total: "+userlist.get(1)+"  Memory Used: "+userlist.get(2)+"  Memory  Free: "+userlist.get(3)+"  Memory  Cached: "+userlist.get(4)+"\n");
	    sendToOutputfile("CPU Idle: "+userlist.get(5)+"  CPU User Level: "+userlist.get(6)+"  CPU System Level: "+userlist.get(7)+"\n");
	    sendToOutputfile("\n");
	    displayFile();	
		
		
	}
	
	/**
	   * Displays file to console. 
	   * @param No Arguments
	   * @exception No exception
	   * @return No Return Value.
	   */	
	public void displayFile() {
		myLog.printToStdout(1, "displayFile() of PerformanceTab called");
		myLog.printToStdout(1,userlist.get(0));
		myLog.printToStdout(1,"Memory Total: "+userlist.get(1)+"  Memory Used: "+userlist.get(2)+"  Memory  Free: "+userlist.get(3)+"  Memory  Cached: "+userlist.get(4));
		myLog.printToStdout(1,"CPU Idle: "+userlist.get(5)+"  CPU User Level: "+userlist.get(6)+"  CPU System Level: "+userlist.get(7));
	
   }
	
	/**
	   * Sends data to output file. 
	   * @param string
	   * @exception No exception
	   * @return No Return Value.
	   */	
   public void sendToOutputfile(String outdata){
	   myLog.printToStdout(3, "sendToOutputfile of PerformanceTab called");
	   fp2.writefile(outdata);
   }
 

	/**
	   * Default toString() method of PerformanceTab Class. 
	   * @param No arguments
	   * @exception No exception
	   * @return returns the string in retVal.
	   */
	 public String toString() {
		  	String retValue = "\n toString() method of PerformanceTab Class \n";
		  	myLog.printToStdout(3, "toString() method of PerformanceTab is called");
			return retValue;
		    }
	
}
