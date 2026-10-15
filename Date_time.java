//import java.time.LocalDate;
//import java.nio.channels.Pipe.SourceChannel;
import java.time.*;
import java.time.format.*;


public class Date_time{
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);

        ZonedDateTime time = ZonedDateTime.now();
        System.out.println(time);

        LocalDateTime dat_time = LocalDateTime.now();
        System.out.println(dat_time);

        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println(date.format(f));

    }
}