package services;

import java.time.LocalDate;

public class DayOfWeek {


    public String friday(){
        LocalDate today = LocalDate.now();
        String actualDay = today.getDayOfWeek().toString();
        System.out.println(today.getDayOfWeek().toString());
        if(today.getDayOfWeek().toString().equals("FRIDAY")){
            return "The day is: Friday";
        } else {
            return actualDay;
        }

    }
}
