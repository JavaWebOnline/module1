package ss8_stringbuilder_date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateStudy {
    public static void main(String[] args) throws ParseException {
//        String strDate = "10/10/2023"; //dd/MM/yyyy
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
//
//        Date date = simpleDateFormat.parse(strDate);
//        System.out.println(date);


        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        System.out.println(simpleDateFormat.format(new Date(0)));
    }
}
