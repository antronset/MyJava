package ForFunRest;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by Антон on 01.07.2017.
 */
public class WorkDates {
    Calendar calendar = Calendar.getInstance();
    int dayOfWeek;
    int currentWeek = calendar.get(Calendar.WEEK_OF_YEAR);

    Object [][] RestData  = {
            {"Monday", ""},
            {"Tuesday", ""},
            {"Wednesday", ""},
            {"Thursday", ""},
            {"Friday", ""},
            {"Saturday", ""},
            {"Sunday", ""}
    } ;

    WorkDates(){
        calendar.setFirstDayOfWeek(Calendar.MONDAY);
    }

    public Object[][] getRestData() {
        return RestData;
    }

    void bookCurrentDate (){
        dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK)-1;
        switch (dayOfWeek) {
            case 1:
                RestData[0][1] = "*";
                break;
            case 2:
                RestData[1][1] = "*";
                break;
            case 3:
                RestData[2][1] = "*";
                break;
            case 4:
                RestData[3][1] = "*";
                break;
            case 5:
                RestData[4][1] = "*";
                break;
            case 6:
                RestData[5][1] = "*";
                break;
            case 7:
                RestData[6][1] = "*";
                break;
        }
    }

}

