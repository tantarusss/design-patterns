package adapterPattern;

import java.time.Instant;
import java.util.Date;

public class Adapter implements DateSaver{
    DateChecker dateChecker = new DateChecker();
    public void saveDate(String date) {
        if (dateChecker.checkDate(Date.from(Instant.parse(date)))) {
            System.out.println(date);
            System.out.println("Date saved");
        } else {
            System.out.println("Could not save date");
        }
    }
}
