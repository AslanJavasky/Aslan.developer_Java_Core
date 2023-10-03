package mod1_syntax_java.lesson14_date;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * @author Aslan Javasky, android developer(Java/Kotlin), Telegram messenger: @Aslan_Javasky
 * @version 1.0 2023-09-03
 */
public class Main {
    public static void main(String[] args) {

        long timestamp = Calendar.getInstance().getTime().getTime();
        long timestampOtherWay = System.currentTimeMillis();
        System.out.println(timestamp);
        System.out.println(timestampOtherWay);

        Date date = new Date(timestamp);
        System.out.println(date);
        //"2023/09/11"
        DateFormat dateFormat =
                new SimpleDateFormat("(yyyy)dd,MMMM HH:mm:ss", Locale.US);
        System.out.println(dateFormat.format(date));

        Calendar calendar = Calendar.getInstance();
//        calendar.add(Calendar.MONTH,5);
        calendar.add(Calendar.YEAR, 1);
        System.out.println(calendar.getTime());


    }
}
