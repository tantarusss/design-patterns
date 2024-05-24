package adapterPattern;

import java.time.Instant;
import java.util.Date;

public class DateChecker {
    public boolean checkDate(Date date) {
        return Date.from(Instant.now()).after(date);
    }
}
