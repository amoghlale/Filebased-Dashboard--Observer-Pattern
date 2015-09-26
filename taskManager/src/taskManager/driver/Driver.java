package taskManager.driver;


import taskManager.filter.DashboardFilter;
import taskManager.observers.Observer;
import taskManager.observers.PerformanceTab;
import taskManager.observers.PerformanceTabFilterImpl;
import taskManager.observers.ProcessesTab;
import taskManager.observers.ProcessesTabFilterImpl;
import taskManager.observers.UsersTab;
import taskManager.observers.UsersTabFilterImpl;
import taskManager.subject.DashBoardSubject;
import taskManager.subject.Subject;
import taskManager.util.FileProcessor;
import taskManager.util.FileProcessorInterface;
import taskManager.util.MyLogger;

public class Driver {
	public static void main(String[] args) {
	
		
		if((args.length) < 3) {
			System.err.println("Invalid number of Command line arguments\n");
			System.exit(1);
		
		}
		
		
		String  inputFile=args[0];
		String outputFile=args[1];
		MyLogger.setValue(args[2]);
		
		//Subject instance
		Subject ds=new DashBoardSubject(inputFile,outputFile);
		
		// FileProcessor instance
		FileProcessorInterface fp=new FileProcessor(inputFile, outputFile); 
		
		//observers
		Observer users=new UsersTab(ds,fp);
		Observer proces=new ProcessesTab(ds,fp);
		Observer performanc=new PerformanceTab(ds,fp);
		
		// filters 
		DashboardFilter myPerformancefilter=new PerformanceTabFilterImpl();
		DashboardFilter myProcessesfilter=new ProcessesTabFilterImpl();
		DashboardFilter myUserfilter=new UsersTabFilterImpl();
        
		//Register observers
		
        ds.registerObserver(users,myUserfilter);
        ds.registerObserver(proces,myProcessesfilter);
        ds.registerObserver(performanc,myPerformancefilter);
        	
        
        // start processing
		ds.startprocessing(fp);
		

}
}