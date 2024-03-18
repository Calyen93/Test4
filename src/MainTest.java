import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;
import java.time.DayOfWeek;

public class MainTest {

    @Test
    public void testDateComponents() {
        String dateString = "2023-03-01T13:00:00Z";
        LocalDateTime dateTime = LocalDateTime.parse(dateString);

        int year = dateTime.getYear();
        int month = dateTime.getMonthValue();
        int day = dateTime.getDayOfMonth();
        DayOfWeek dayOfWeek = dateTime.getDayOfWeek();

        assertEquals(2023, year);
        assertEquals(3, month);
        assertEquals(1, day);
        assertEquals(DayOfWeek.WEDNESDAY, dayOfWeek);
    }
}