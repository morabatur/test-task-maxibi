package co.maxbi.parser;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Клас для роботи з датами
 */
public class DateConvertor {

    /**
     * Метод дозволяє отримати північ поточного дня
     * @return
     */
    public static Date todayMidnight(){
        Calendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(Calendar.HOUR_OF_DAY, 0); //anything 0 - 23
        gregorianCalendar.set(Calendar.MINUTE, 0);
        gregorianCalendar.set(Calendar.SECOND, 0);
        Date todayMidnigh = gregorianCalendar.getTime(); //the midnight, that the first second of the day.
        return  todayMidnigh;
    }

    /**
     * Метод дозволяє відформатувати дату за вказаним шаблоном
     * @param date
     * @return
     */
    public static String dateFormat(Date date){
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);
    }

}
