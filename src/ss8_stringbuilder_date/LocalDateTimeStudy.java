package ss8_stringbuilder_date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeStudy {
    public static void main(String[] args) {
//        LocalDate currentDate = LocalDate.now();
//        LocalDate localDate = currentDate.plusYears(-10);
//        LocalDate localDate = currentDate.withYear(2030);
//
//        System.out.println(localDate.getYear());
//        System.out.println(localDate.getMonth());
//        System.out.println(localDate.getDayOfMonth());
//
//        System.out.println(localDate.isAfter(currentDate));


//        String strDate = "10/10/2023";
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//        LocalDate localDate = LocalDate.parse(strDate, formatter);
//
//        System.out.println(localDate.getYear());
//        System.out.println(localDate.getMonth());
//        System.out.println(localDate.getDayOfMonth());


        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String strDate = LocalDate.now().format(formatter);
        System.out.println(strDate);
    }
}
