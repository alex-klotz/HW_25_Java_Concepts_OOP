package age;

import java.text.*;
import java.util.Date;
 
public class FP {                                                     	// Functional Programming
 
       static String name = "Alex Kotsar";                             	// Static Variable
       static String dob = "06/04/1990";                              	// Static Variable
 
       static void print(String param) {                              	// Static void Method
              System.out.println(param);
       }
 
       static long age(String param_dob) throws ParseException {      	// Static Method
 
              SimpleDateFormat f = new SimpleDateFormat("MM/dd/yyyy"); 	// Defining date format
              Date date = f.parse(param_dob);                         	// Convert String to Date
              long dob_ms = date.getTime();                        	 	// Local Variable (DOB in ms)
              long now_ms = System.currentTimeMillis();   				// Local Variable (Current Time in ms)
 
              return (now_ms - dob_ms) / 31_556_952_000L;               // Returns age
              }                                                         // Static Method
 
       public static void main(String[] args) throws ParseException {  	// Main Method
              print("Name: " + name + "; Age: " + age(dob));            // Printing name and age
 
              }                                                        	// Main Method
}  
