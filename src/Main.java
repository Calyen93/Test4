/*Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
Ottieni l'anno
Ottieni il mese
Ottieni il giorno
Ottieni il giorno della settimana
Stampa i risultati sulla console -Crea dei test per questo esercizio*/
import java.time.DayOfWeek;
import java.time.OffsetDateTime;



public class Main {
    public static String dateString = "2023-03-01T13:00:00Z";

    public static void main(String[] args){
        //Crea un oggetto OffsetDateTime dalla Stringa
        OffsetDateTime dateTime = OffsetDateTime.parse(dateString);

        //Ottieni anno, mese, giorno, giorno della settimana
        Result result = getResult(dateTime);
    }

    static Result getResult(OffsetDateTime dateTime){
        int year = dateTime.getYear();
        int month = dateTime.getMonthValue();
        int day = dateTime.getDayOfMonth();
        DayOfWeek dayOfWeek = dateTime.getDayOfWeek();
        Result result = new Result(year, month, day, dayOfWeek);
        return result;
    }

    public record Result(int year, int month, int day, DayOfWeek dayOfWeek){

    }
}