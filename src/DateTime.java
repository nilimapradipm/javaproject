import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

class DateTime{
    public static void main(String[] args) {
        Date date = new Date();

        System.out.println(" date is " + date);

        SimpleDateFormat dateFormatter = new SimpleDateFormat("E, y-M-d 'at' h:m:s a z");

        System.out.println("Format 1:   " + dateFormatter.format(date));

        dateFormatter = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
        System.out.println("Format 2:   " + dateFormatter.format(date));

        dateFormatter = new SimpleDateFormat("EEEE, MMMM d, yyyy");
        System.out.println("Format 3:   " + dateFormatter.format(date));

        Calendar cal = Calendar.getInstance();
        System.out.println(cal.getWeekYear());


               // SimpleDateFormat dateFormatter = new SimpleDateFormat("E, y-M-d 'at' h:m:s a z");
                System.out.println("Format 1:   " + dateFormatter.format(date));
                dateFormatter = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");

                System.out.println("Format 2:   " + dateFormatter.format(date));
                dateFormatter = new SimpleDateFormat("EEEE, MMMM d, yyyy");

                System.out.println("Format 3:   " + dateFormatter.format(date));
                //Calendar cal = Calendar.getInstance();
                System.out.println(cal.getWeekYear());
    }
}