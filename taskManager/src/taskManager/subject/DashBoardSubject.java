package taskManager.subject;

/**
 * DashBoardSubject --- It registers, removes and notifies
 * 						observers. Also, it starts processing	
 * @author    	Amogh Lale
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import taskManager.filter.DashboardFilter;
import taskManager.observers.Observer;
import taskManager.util.FileProcessorInterface;
import taskManager.util.MyLogger;


public class DashBoardSubject implements Subject{
	Map<Observer, DashboardFilter> map = new HashMap<Observer, DashboardFilter>();
	MyLogger myLog=MyLogger.getInstance();
	String inputFile;
	String outputFile;
	DashboardFilter myDash;
	
	/**
	   * Parametrized constructor  
	   * @param input and output files
	   * @exception NullPointerException
	   * @return No return value.
	   */
	public DashBoardSubject(String inputFile, String outputFile){
		try{
			myLog.printToStdout(2, "Parametrized Constructor of DashboardSubject called");
			this.inputFile = inputFile;
			this.outputFile= outputFile;
		}
		catch(NullPointerException e){
			myLog.printToStdout(0, "NullPointer Exception in DashboardSubject");
			System.err.println("NullPointerException occured");
			System.exit(0);
		}
		
	}

	/**
	   * Registers observer into the data structure 
	   * @param Observer, DashBoardFilter
	   * @exception No exception
	   * @return No return value.
	   */
	public void registerObserver(Observer o, DashboardFilter f){
		myLog.printToStdout(3, "registerObserver is called");
		       map.put(o,f);
			 
			
	}

	/**
	   * Removes observer from the data structure 
	   * @param Observer
	   * @exception No exception
	   * @return No return value.
	   */
	public void removeObserver(Observer o) {
		myLog.printToStdout(3, "removeObserver is called");
		if(map.containsKey(o))
		{	
			map.remove(o);
		}
		else
		   System.out.println("No observer");	
	}
	
	/**
	   * Checks for the observer in Data structure 
	   * and notifies that observer  
	   * @param String
	   * @exception No exception
	   * @return No return value.
	   */
	public void notifyObservers(String singleEntry) {
		myLog.printToStdout(3, "notifyObservers is called");
		Observer observer ;
		String[] tabname=singleEntry.split("\\:");
		
		// check in the data structure of tabs
		for(Entry<Observer, DashboardFilter> entry : map.entrySet()) {
			myDash= entry.getValue();
			if(myDash.check(tabname[0].toString()))
			{
				// if filter check condition true
				observer = (Observer)entry.getKey();
				observer.update(singleEntry);
			
			}// if closed	
		} //for loop closed
	}	
	
	
	/**
	   * Starts processing the input file  
	   * @param FileProcessorInterface
	   * @exception No exception
	   * @return No return value.
	   */
	public void startprocessing(FileProcessorInterface fp){
		String line = null;
		String[]inputTab;
		myLog.printToStdout(3, "startprocessing is called");
		while((line = fp.readfile())!=null)
		{
			myLog.printToStdout(1,"---TAB(s) BEGIN---");
			 fp.writefile("---TAB(s) BEGIN---"+"\n");
			 inputTab=line.split("\\*");
			 for(int i=0;i<inputTab.length;i++)
			 {
				notifyObservers(inputTab[i].toString());
				 
		     }
			 myLog.printToStdout(1,"---TAB(s) END---");
			 fp.writefile("---TAB(s) END---"+"\n");      	 
		}//while loop closed
		
	}
  
	/**
	   * Default toString() method of DashBoardSubject Class. 
	   * @param No arguments
	   * @exception No exception
	   * @return returns the string in retVal.
	   */
	 public String toString() {
		  	String retValue = "\n toString() method of DashBoardSubject Class \n";
		  	myLog.printToStdout(3, "toString() method of DashBoardSubject is called");
			return retValue;
		    }
	

	
	
}
