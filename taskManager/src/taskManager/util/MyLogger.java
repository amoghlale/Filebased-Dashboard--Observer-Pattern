package taskManager.util;

/**
 * MyLogger --- 	Matches the Debug Value given in the command line 
 * 			 	argument with the level. If it matches, then only 
 * 				those debug messages corresponding to the given 
 * 				level would be displayed on stdout.
 * @author    	Amogh Lale
 */
public class MyLogger {
	

	    public static int DEBUG_VALUE;
		
		private volatile static MyLogger mylogger;
		private MyLogger(){}
			
		
		
		/**getinstance() method to return unique instance 
		 * @return		MyLogger	 		
		 * @param 		No Arguments
		 * @exception 	No Exception
		 */
		public static MyLogger getInstance() {
				if(mylogger == null){
					synchronized (MyLogger.class){
						mylogger = new MyLogger();
					}
				}
				return mylogger;
		 }
		
		/**
		   * SetValue method is used to validate whether args[2]
		   * is between 0 and 3.This value is then stored 
		   * in DEBUG_VALUE 
		   * @param args[2]
		   * @exception No exception
		   * @return No return value.
		   */
		public static void setValue(String args){
		if (!(args.equals("0")||args.equals("1")||args.equals("2")||args.equals("3")))
		{
	        System.err.println("\nInvalid command line argument");	
			System.exit(0);
		}
		DEBUG_VALUE=Integer.parseInt(args);
		}
		
		/**
		   * getValue method is used to return DEBUG_VALUE. This value 
		   * is compared with level so as to display correct output on
		   * stdout. 
		   * @param no arguments
		   * @exception No exception
		   * @return DEBUG_VALUE
		   */
		public static int getValue(){
			return DEBUG_VALUE;
		}
		/**
		   * Displays the debug messages corresponding to the debug 
		   * value given in the command line arguments.  
		   * @param level to match with command line argument and 
		   * debug message corresponding to the level given.
		   * @exception No exception
		   * @return No return value.
		   */
		
		public void printToStdout(int level,String debugMessage){
		if(level==DEBUG_VALUE){
			System.out.println(debugMessage);
		}
		
		}
		
		/**
		   * Default toString() method of MyLogger Class. 
		   * @param No arguments
		   * @exception No exception
		   * @return returns the string in retVal.
		   */
		 public String toString() {
			  	String retValue = "\n toString() method of MyLogger Class \n";
				return retValue;
			    }
	}

