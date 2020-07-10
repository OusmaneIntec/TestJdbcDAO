package dakplusplus.view;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ViewTools {
	
	// Convert string to localdate
	public static LocalDate parseStringToLocalDate(String dateString) {
   	 
      
      DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
      LocalDate localDate = LocalDate.parse(dateString, formatter);
  	  
  	  return localDate;
  	  
    }

}
