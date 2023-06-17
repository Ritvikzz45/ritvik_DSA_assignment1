package majorassn;
import java.util.Calendar;  //Guessing holiday with built in library Calender
public class SuperDepartment {
    public String departmentName() {
      return "Super Department";
    }
    
    public String getTodaysWork() {
      return "No Work as of now";
    }
    
    public String getWorkDeadline() {
      return "Nil";
    }
    
    public String isTodayAHoliday() {
        Calendar calendar = Calendar.getInstance();
        String a = "Today is a Holiday"; 
        String b= "Today is not a Holiday";
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        if (dayOfWeek == Calendar.SATURDAY || dayOfWeek == Calendar.SUNDAY) {
            return a;
        } else {
            return b;
        }
    }
  }
 