import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.DayOfWeek;

public class Main {

    public static void main(String[] args) {
        String dateString = "2023-03-01T13:00:00Z";

        // Creazione di LocalDateTime dalla stringa
        LocalDateTime dateTime = LocalDateTime.parse(dateString, DateTimeFormatter.ISO_DATE_TIME);

        // Ottieni l'anno
        int year = dateTime.getYear();

        // Ottieni il mese
        int month = dateTime.getMonthValue();

        // Ottieni il giorno
        int day = dateTime.getDayOfMonth();

        // Ottieni il giorno della settimana
        DayOfWeek dayOfWeek = dateTime.getDayOfWeek();

        // Stampa i risultati sulla console
        System.out.println("Anno: " + year);
        System.out.println("Mese: " + month);
        System.out.println("Giorno: " + day);
        System.out.println("Giorno della settimana: " + dayOfWeek);
    }
}