package week3.day1.LearnAbstraction;

public interface Browser {

	/*This method should launch the
	 *chrome browser
	 */
	public void startApp();

	/*
	 * This method should 
	 * load the application
	 * in the specified browser
	 */
	public void loadURL(String url);

	/*
	 * This method should 
	 * close the browser
	 */
	
   public void quit();
   
   
   
  
  
}
