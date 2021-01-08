// import java.time.*; 
// or 
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter; 
import java.time.Month;
import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.Period;
import java.time.Duration; 
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters; 
import java.time.DayOfWeek;
public class DateTimeClass{

    public static void main(String args[]) {
        DateTimeClass DateTimeClassObj = new DateTimeClass();
        DateTimeClassObj.testLocalDateTime();
     }

    public void testLocalDateTime() {
        // Get the current date and time
        LocalDateTime currentTime = LocalDateTime.now();
        System.out.println("Current DateTime: " + currentTime);

        DateTimeFormatter format =  DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");   
        String formattedDateTime = currentTime.format(format);  
        System.out.println("Current DateTime with format: " + formattedDateTime);

        LocalDateTime  ldt = LocalDateTime.of(2021, Month.JANUARY,  1,   15,   54);  
        // or this one
        // LocalDateTime  ldt = LocalDateTime.of(2021, 1,  1,   15,   54);  

        System.out.println("Local time zone: " + ldt);
        
        LocalDate date1 = LocalDate.now();
        // LocalDate date1 = currentTime.toLocalDate();
        System.out.println("date1: " + date1);
          
        Month month = currentTime.getMonth();
        int monthValue = currentTime.getMonthValue();
        int date = currentTime.getDayOfMonth();
        int seconds = currentTime.getSecond();
        int minutes = currentTime.getMinute();
        int year = currentTime.getYear();

        System.out.println("Month: " + month +" monthValue :"+monthValue+" date: " + date +" year:"+year+" minutes: "+minutes+" seconds: " + seconds);
          
        LocalDateTime date2 = currentTime.withDayOfMonth(10).withYear(2012);
        System.out.println("date2: " + date2); // 2012-01-10T15:36:36.680519
          
        //15 Jan 1996
        LocalDate date3 = LocalDate.of(1996, Month.JANUARY, 15);
        System.out.println("date3: " + date3); // 1996-01-15
          
        //22 hour 15 minutes 30 seconds
        LocalTime date4 = LocalTime.of(22, 15,30);
        System.out.println("date4: " + date4); // 22:15:30
          
        //parse a string
        LocalTime date5 = LocalTime.parse("20:15:30");
        System.out.println("date5: " + date5); // 20:15:30


        ZonedDateTime timeZone =ZonedDateTime.now();  // How it will work when we deploy it in GCP ?
        System.out.println("time: "+timeZone); 
        System.out.println("timeZone: "+timeZone.getZone()); 

        ZonedDateTime m = timeZone.minus(Period.ofDays(1));  
        System.out.println("Minus 1 day from actual date"+m);
        ZonedDateTime p = timeZone.plus(Period.ofDays(2));  
        System.out.println("Plus 2 days from actual date"+p);  

        // Get the current date and time
        ZonedDateTime zone = ZonedDateTime.parse("2016-10-05T08:20:10+05:30[Asia/Kolkata]");  
        System.out.println("Parsed timezone: "+zone);  


        LocalDate TestDate1 = LocalDate.now(); 
  
        LocalDate TestDate2 = LocalDate.of(2020, Month.DECEMBER, 12); 
  
        Period DiffBWDates = Period.between(TestDate2, TestDate1); 
        System.out.println("gap between dates is a period of "+DiffBWDates); 
        

        LocalTime time1 = LocalTime.now(); 
        System.out.println("the current time is " + time1); 
  
        Duration fiveHours = Duration.ofHours(5); 

        // Examples

        // Duration fiveHours = Duration.ofMillis(50); 
        // Duration fiveHours = Duration.ofMinutes(1356); 
        // Duration fiveHours = Duration.ofSeconds(09trtertert); 
  
        // Period fiveHours = Period.ofMonths(4); 
        // Period fiveHours = Period.ofYears(456); 
        // Period fiveHours = Period.ofWeeks(78); 
        // Period fiveHours = Period.ofDays(576); 
        // Period fiveHours = Period.ofDays(56767676); 

        // adding five hours to the current  
        // time and storing it in time2 
        LocalTime time2 = time1.plus(fiveHours); 
        System.out.println("after adding five hours of duration " + time2); 
  
        Duration gap = Duration.between(time2, time1); 
        System.out.println("duration gap between time1 & time2 is " + gap); 
    
        LocalDate Testdate = LocalDate.now(); 
        System.out.println("current date is :" +  Testdate); 
      
        // adding 2 years to the current date 
        // can use both plus and minus functionality
        LocalDate Testyear = Testdate.plus(2, ChronoUnit.YEARS);
        System.out.println("After adding 2 year " +  Testyear); 
              
        // adding 1 month to the current data 
        LocalDate nextMonth =  Testdate.plus(1, ChronoUnit.MONTHS); 
        System.out.println("the next month is " +   nextMonth); 
      
        // adding 1 week to the current date 
        LocalDate nextWeek =  Testdate.plus(1, ChronoUnit.WEEKS); 
        System.out.println("next week is " + nextWeek); 
      
        // adding 2 decades to the current date 
        LocalDate Decade =  Testdate.plus(2, ChronoUnit.DECADES); 
        System.out.println("20 years after today " +  Decade);


        LocalDate CurrDate = LocalDate.now(); 
        System.out.println("the current date is "+ CurrDate); 
  
        // to get the first day of next month 
        LocalDate FirstDayOfNextMonth =  CurrDate.with(TemporalAdjusters.firstDayOfNextMonth()); 
        System.out.println("firstDayOfNextMonth : " + FirstDayOfNextMonth ); 
  
        // get the next saturday 
        LocalDate nextSaturday =  CurrDate.with(TemporalAdjusters. next(DayOfWeek.SATURDAY)); 
        System.out.println("next saturday from now is "+ nextSaturday); 
  
        // first day of current month 
        LocalDate firstDay =  CurrDate.with(TemporalAdjusters.firstDayOfMonth()); 
        System.out.println("firstDayOfMonth : " + firstDay); 
  
        // last day of current month      
        LocalDate lastDay =  CurrDate.with(TemporalAdjusters.lastDayOfMonth()); 
        System.out.println("lastDayOfMonth : " +  lastDay);
     }
}