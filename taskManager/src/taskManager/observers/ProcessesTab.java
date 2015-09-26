package taskManager.observers;

/**
 * ProcessesTab --- 	It has an update method and display 
 * 						file method. It also has a method to
 * 						write to a file	
 * @author    	Amogh Lale
 */
import java.util.ArrayList;
import taskManager.display.DisplayFile;
import taskManager.filter.DashboardFilter;
import taskManager.subject.Subject;
import taskManager.util.FileProcessorInterface;
import taskManager.util.MyLogger;

public class ProcessesTab implements Observer, DisplayFile{

	private Subject ds;  //ds used incase we need to unregister Observer
	public DashboardFilter df;
	public FileProcessorInterface fp3;
	ArrayList<String> userlist=null;
	MyLogger myLog=MyLogger.getInstance();
	String inFromsubjImpl;
	String[] processes_entry;
	String[] processStatus;
	
	/**
	   * Parametrized Constructor
	   * @param Subject,FileProcessorInterface
	   * @exception No exception
	   * @return No Return Value.
	   */
	public ProcessesTab (Subject ds2, FileProcessorInterface fp) {
		myLog.printToStdout(2, "Parametrized Constructor of ProcessesTab called");
		 this.ds=ds2;
		 fp3=fp;
	}
	
	/**
	   * Displays file contents 
	   * @param No Arguments
	   * @exception No exception
	   * @return No Return value.
	   */
	public void displayFile() {
		
		myLog.printToStdout(1, "displayFile of ProcessesTab called");
		myLog.printToStdout(1,userlist.get(0));
		myLog.printToStdout(1,userlist.get(1));
		for(int i=2;i<userlist.size();i+=5)
		{	
		//	String outToConsole=String.format("%5s %-16s%-8s  %s  %s",  userlist.get(i), userlist.get(i+1), userlist.get(i+2), userlist.get(i+3), userlist.get(i+4)+"\n");
			myLog.printToStdout(1,String.format("%5s %-16s%-8s  %s  %s",  userlist.get(i), userlist.get(i+1), userlist.get(i+2), userlist.get(i+3), userlist.get(i+4)));	
		}

	}
   
	/**
	   * Writes to output file
	   * @param String
	   * @exception No exception
	   * @return No Return value.
	   */
	public void writeToOutputFile(String str){
		myLog.printToStdout(3, "writeToOutputFile of ProcessesTab called");	
		fp3.writefile(str);
   }
	
	/**
	   * Update method. 
	   * @param String
	   * @exception No exception
	   * @return No Return value.
	   */
	public void update(String tabentries) {
		myLog.printToStdout(3, "update of ProcessesTab called");	
		int i,j=1;;
		userlist = new ArrayList<String>();
		
		inFromsubjImpl=tabentries.substring(10);
		
		String outdata;
		userlist.add("---PROCESSES---");
		userlist.add("  PID COMMAND         USER     %CPU %MEM");
		processes_entry=inFromsubjImpl.split("\\-");
        for(i=0;i<processes_entry.length;i++)
		{	

			processStatus=processes_entry[i].split("\\:");
			userlist.add(processStatus[0].toString());
			userlist.add(processStatus[1].toString());
			userlist.add(processStatus[2].toString());
			userlist.add(processStatus[3].toString());
			userlist.add(processStatus[4].toString());
			j+=5;
			
		}
        writeToOutputFile(userlist.get(0)+"\n");
        writeToOutputFile(userlist.get(1)+"\n");
       
        for(i=2;i<userlist.size();i+=5)
		   {
        	outdata=String.format("%5s %-16s%-8s  %s  %s",  userlist.get(i), userlist.get(i+1), userlist.get(i+2), userlist.get(i+3), userlist.get(i+4)+"\n");
        	writeToOutputFile(outdata);
	
		   }
        writeToOutputFile("\n");
        displayFile();
	}    
	
	/**
	   * Default toString() method of ProcessesTab Class. 
	   * @param No arguments
	   * @exception No exception
	   * @return returns the string in retVal.
	   */
	 public String toString() {
		  	String retValue = "\n toString() method of ProcessesTab Class \n";
		  	myLog.printToStdout(3, "toString() method of ProcessesTab is called");
			return retValue;
		    }
	

}
