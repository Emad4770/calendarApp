package ir.ui.ac.cg.zaeri.persiancalendar;

import java.util.Calendar;
 
public class PortletCalendar {

    public PortletCalendar() {
    }

    public static String getCalTitle(Calendar cal) {
        Calendar _tmp = cal;
        Calendar _tmp1 = cal;
        Calendar _tmp2 = cal;
        int currYear[] = DateConvert.m2h(cal.get(5), cal.get(2) + 1, cal.get(1));
        return (new StringBuilder()).append(currYear[0]).append(" ").append(
                DateConvert.hmonth2str(currYear[1])).append(", ").append(
                currYear[2]).toString();
    }

    public static String getMonth(Calendar cal) {
        Calendar _tmp = cal;
        Calendar _tmp1 = cal;
        Calendar _tmp2 = cal;
        int currYear[] = DateConvert.m2h(cal.get(5), cal.get(2) + 1, cal.get(1));
        return (new StringBuilder()).append(DateConvert.hmonth2str(currYear[1])).
                append(", ").append(currYear[2]).toString();
    }

    public static String getWeek(int d, int m, int y) {
        return String.valueOf(DateConvert.hdifdate(1, 1, y, d, m, y) / 7 + 1);
    }

    public static int dayOfWeek(int d, int m, int y) {
        int l = DateConvert.hdifdate(1, 1, 1, d, m, y);
        return (l + 5) % 7;
    }

   

    public static String getDate(Calendar cal) {
        Calendar _tmp = cal;
        Calendar _tmp1 = cal;
        Calendar _tmp2 = cal;
        int currYear[] = DateConvert.m2h(cal.get(5), cal.get(2) + 1, cal.get(1));
        return (new StringBuilder()).append(currYear[0]).append("/").append(
                currYear[1]).append("/").append(currYear[2]).toString();
    }

    public static String getMD(Calendar cal) {
        Calendar _tmp = cal;
        Calendar _tmp1 = cal;
        Calendar _tmp2 = cal;
        int currYear[] = DateConvert.m2h(cal.get(5), cal.get(2) + 1, cal.get(1));
        return (new StringBuilder()).append(currYear[0]).append("/").append(
                currYear[1]).toString();
    }

    public static String getDayOfWeek(Calendar cal) {
        Calendar _tmp = cal;
        Calendar _tmp1 = cal;
        Calendar _tmp2 = cal;
        int currYear[] = DateConvert.m2h(cal.get(5), cal.get(2) + 1, cal.get(1));
        int l = DateConvert.hdifdate(1, 1, 1, currYear[0], currYear[1],
                                     currYear[2]);
        return DateConvert.hdayofweek2str((l + 5) % 7 + 1);
    }
}
