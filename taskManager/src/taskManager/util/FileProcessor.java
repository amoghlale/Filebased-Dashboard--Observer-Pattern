package taskManager.util;

/**
 * FileProcessor --- Reading and writing to a file	
 * @author    	Amogh Lale
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class FileProcessor implements FileProcessorInterface {
    
	BufferedReader br=null;
	String inputFile;
	String outputFile;
	MyLogger myLog=MyLogger.getInstance();
	/**

	   * Parametrized constructor  
	   * @param input and output files
	   * @exception NullPointerException,FileNotFoundException
	   * @return No return value.
	   */
	public FileProcessor(String inputFile, String outputFile){
		myLog.printToStdout(2, "Parametrized Constructor of FileProcessor called");
    	try {
    		this.inputFile=inputFile;
    		this.outputFile=outputFile;
			br = new BufferedReader(new FileReader(inputFile));
    	}catch(NullPointerException e){
    		myLog.printToStdout(0, "NullPointerException of FileProcessor called");
    		System.err.println("NullPointerException");
    		System.exit(0);
		} catch (FileNotFoundException e) {
			myLog.printToStdout(0, "FileNotFoundException of FileProcessor called");
			System.err.println("Filenotfound Exception occured");
			System.exit(0);	
	}
	
	}
	
	/**
	   * Reads from input file 
	   * @param No Arguments
	   * @exception IOException
	   * @return returns line
	   */
	public String readfile(){
		myLog.printToStdout(3, "readfile of FileProcessor called");
		try {
			 String str=br.readLine();
			
			 return str;
		} catch (IOException e) {
			System.out.println("IOException occured");
			System.exit(0);	
		}
		return null;
		
   }			
	
	/**
	   * Creates a file and writes data to it. 
	   * @param output data
	   * @exception IOException
	   * @return No Return value
	   */
	public void writefile(String outData) {
		myLog.printToStdout(3, "writefile of FileProcessor called");
		BufferedWriter bw=null;  
		try {
				File file = new File(outputFile);
				if (!file.exists()) {
					file.createNewFile();    // check if file exists  
				} // end if condition

				FileWriter fw = new FileWriter(file.getAbsoluteFile(),true);
				bw = new BufferedWriter(fw);
				
				bw.write(outData);
				
		} //end try block
		catch (IOException e) {
			myLog.printToStdout(0, "IOException of writefile in FileProcessor called");
			System.err.println("IOException Error");
			System.exit(0);	
		} //end catch block
		finally{
			try {
					bw.flush();
					bw.close();
			} catch (IOException e) {
				myLog.printToStdout(0, "IOException of writefile in FileProcessor called");
				System.err.println("File Cannot be closed Error");
				System.exit(0);	
			}

		}//end finally block

	}
	
	/**
	   * Default toString() method of FileProcessor Class. 
	   * @param No arguments
	   * @exception No exception
	   * @return returns the string in retVal.
	   */
	 public String toString() {
		  	String retValue = "\n toString() method of FileProcessor Class \n";
		  	myLog.printToStdout(3, "toString() method of FileProcessor is called");
			return retValue;
		    }
		
	}


