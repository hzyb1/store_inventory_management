package tools;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

import model.Order;

public class TimeUtil {

    public static long compareTime(Order order){
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        dateFormat.setTimeZone(TimeZone.getTimeZone("GMT+8"));
        Timestamp nowTime = new Timestamp(System.currentTimeMillis());
        Timestamp submitTime = order.getSubmitTime();
        long diff = nowTime.getTime() - submitTime.getTime();//这样得到的差值是毫秒级别
        return diff;
    }

}
