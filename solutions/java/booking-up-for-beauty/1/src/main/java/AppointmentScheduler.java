import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class AppointmentScheduler {

    public LocalDateTime schedule(String dateTimeString) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("M/d/yyyy HH:mm:ss");
        return LocalDateTime.parse(dateTimeString, formatter);
    }

    public boolean hasPassed(LocalDateTime dateTime) {
        return dateTime.isBefore(LocalDateTime.now());
    }

    public boolean isAfternoonAppointment(LocalDateTime dateTime) {
        int hour = dateTime.getHour();
        return hour >= 12 && hour < 18;
    }

    public String getDescription(LocalDateTime dateTime) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy, 'at' h:mm a");
        String formatted = dateTime.format(formatter);
        return "You have an appointment on " + formatted + ".";
    }

    public LocalDate getAnniversaryDate() {
        int currentYear = LocalDate.now().getYear();
        return LocalDate.of(currentYear, 9, 15);
    }
}
