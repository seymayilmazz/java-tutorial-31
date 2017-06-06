import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by Şeyma Yılmaz on 6.6.2017.
 */
public class Main {

    public static void main(String[] args) {

        /*
         * Date
         */
        Date date = new Date();
        System.out.println("date timestamp : " + date.getTime());
        System.out.println("date : " + date.toString());

        long newTimestamp = 1496710419589L;
        date.setTime(newTimestamp);
        System.out.println("date timestamp : " + date.getTime());
        System.out.println("date : " + date.toString());

        Date date1 = new Date();
        Date date2 = new Date(1496710419589L); // 02:53
        if(date1.compareTo(date2) == 0){
            System.out.println("iki tarih esittir");
        }
        else{
            System.out.println("iki tarih esit degil");
        }


        /* SimpleDateFormat format -> tarihi belirtilen formatta string hale cevirir */
        SimpleDateFormat dateFormat =
                new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat timeFormat =
                new SimpleDateFormat("HH:mm:ss");
        Date currentDate = new Date();
        String dateText = dateFormat.format(currentDate);
        String timeText = timeFormat.format(currentDate);
        System.out.println("current date : " + dateText);
        System.out.println("current time : " + timeText);

        /* SimpleDateFormat parse -> bu da string haldeki tarih yazisini Date nesnesine çevirir */
        Date myDate1=null;
        Date myDate2;
        try {
            myDate1 = dateFormat.parse("08/03/2017");
            myDate2 = dateFormat.parse("04/12/2017");
        } catch (ParseException e) {
            e.printStackTrace();
        }

        /* GregorianCalendar */
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(myDate1);

        int year = calendar.get(Calendar.YEAR);
        int month= calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);

        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);


        calendar.set(Calendar.MONTH, 10);


    }


}
