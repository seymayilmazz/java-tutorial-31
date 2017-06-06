package package1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * Created by Şeyma Yılmaz on 6.6.2017.
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        SimpleDateFormat dateFormat=new SimpleDateFormat("dd/MM/yyyy");
        Date date;

        while (true){
            System.out.print("lütfen tarih girin: ");
            String tarih=scanner.next();
            try {
                date = dateFormat.parse(tarih);
                break;
            } catch (ParseException e) {
                System.out.println("YANLIŞ TARİH FORMATI! (dd/MM/yyyy)");
            }
        }

        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTime(date);

        System.out.println("day : " + calendar.get(Calendar.DAY_OF_MONTH));
        /* month = 0-11 */
        System.out.println("month : " + (calendar.get(Calendar.MONTH) + 1));
        System.out.println("year : " + calendar.get(Calendar.YEAR));

        System.out.println("hour : " + calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println("minute : " + calendar.get(Calendar.MINUTE));
        System.out.println("second : " + calendar.get(Calendar.SECOND));

        String[] months = {"OCAK", "ŞUBAT", "MART", "NİSAN", "MAYIS", "HAZİRAN", "TEMMUZ",
        "AĞUSTOS", "EYLÜL","EKİM","KASIM", "ARALIK"
        };

        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int month = calendar.get(Calendar.MONTH);
        String monthString = months[month];
        int year = calendar.get(Calendar.YEAR);

        String dateString = day + " " + monthString + " " + year;
        System.out.println("date string : " + dateString);


    }

}
