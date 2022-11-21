package com.Online_Banking.Banking.GenericLibraries;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class Java_Utility {
	/**This is used get random number
	 * @author kalam
	 * @return
	 */
	
	public int getRandomNumber()
	
	{
		Random ran=new Random();
		int random=ran.nextInt(10000);
		return random;
		
	}
	
	/**this method is used to get system date
	 * @author kalam
	 * @return
	 */
	public String getSystemDate()
	{
		Date date=new Date();
		String systemdate=date.toString();
		return systemdate;
		
	}
	/**This method is used to system date in format
	 * @author kalam
	 */
	public String getSystemDateINFormat()
	{
		SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy HH:mm:SS");
		Date systemdate=new Date();
		String getDateAndTime=dateFormat.format(systemdate);
		return getDateAndTime.replaceAll(":","-");
	}
	
	/*public String getDate() {
		Date d=new Date();
    String currentDate=d.toString().replaceAll(":","-");
		
	}*/
	
	

}
