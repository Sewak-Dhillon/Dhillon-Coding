// Class	Description
// LocalDate ===>> Represents a date (year, month, day (yyyy-MM-dd))

// LocalTime ===>> Represents a time (hour, minute, second and nanoseconds (HH-mm-ss-ns))

// LocalDateTime ===>> Represents both a date and a time (yyyy-MM-dd-HH-mm-ss-ns)

// DateTimeFormatter ===>> Formatter for displaying and parsing date-time objects

import java.time.*;
import java.time.format.DateTimeFormatter;
public class javaDateTime {
    public static void main(String[] args) {
        LocalDate mydate = LocalDate.now(); // For Date.
     System.out.println("Date : " + mydate);
        LocalTime myTime = LocalTime.now(); // For Time.
     System.out.println("Time : " + myTime);
        LocalDateTime mydatetime = LocalDateTime.now(); // For Both Date and Time.
     System.out.println("Date and Time before formatting : " + mydatetime);
        //Date and Time Formatting.
        DateTimeFormatter myformat = DateTimeFormatter.ofPattern("dd-MMM-yyyy : HH:mm:ss");
        String formated_date_time = mydatetime.format(myformat);
        System.out.println("Date and Time after formatting : " + formated_date_time);

    }
}
// Value	      Example	
// yyyy-MM-dd	"1988-09-29"	
// dd/MM/yyyy	"29/09/1988"	
// dd-MMM-yyyy	"29-Sep-1988"	
// E, MMM dd yyyy	"Thu, Sep 29 1988"