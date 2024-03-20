/*Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
Ottieni l'anno
Ottieni il mese
Ottieni il giorno
Ottieni il giorno della settimana
Stampa i risultati sulla console -Crea dei test per questo esercizio*/

import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;
import java.time.OffsetDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @Test
    public void checkResult(){
        OffsetDateTime expectedDate = OffsetDateTime.parse(Main.dateString);
        Main.Result result = Main.getResult(expectedDate);

        Main.Result expectedResult = new Main.Result(2023,03,01, DayOfWeek.WEDNESDAY);

        assertEquals(expectedResult, result);
    }
}