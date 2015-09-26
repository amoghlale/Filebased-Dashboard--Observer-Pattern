package taskManager.subject;

//Interface to register,remove and notify
//observers
import taskManager.filter.DashboardFilter;
import taskManager.observers.Observer;
import taskManager.util.FileProcessorInterface;

public interface Subject {
	public void registerObserver(Observer o, DashboardFilter f);
	public void removeObserver(Observer o);
	public void notifyObservers(String singleEntry);
	public void startprocessing(FileProcessorInterface fp);
	

}
