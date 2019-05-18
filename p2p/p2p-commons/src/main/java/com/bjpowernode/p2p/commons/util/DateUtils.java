package com.bjpowernode.p2p.commons.util;

import sun.applet.Main;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * ClassName:DateUtils
 * PackageName:com.bjpowernode.p2p.commons.util
 * Description:
 *
 * @date:2019/1/9 23:46
 * @author:liurenzhong_c@126.com
 **/
public class DateUtils {

    /**
     * 通过添加天数获取日期
     * @param date
     * @param days
     * @return
     */
    public static Date getDateByAddDays(Date date, int days){

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DAY_OF_MONTH,days);
        return calendar.getTime();


    }

    /**
     * 通过添加月份获取日期
     * @param date
     * @param monthes
     * @return
     */
    public static Date getDateByAddMonthes(Date date,int monthes){

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.MONTH,monthes);
        return calendar.getTime();
    }


    /**
     * 获取当前年的天数
     * @return
     */
    public static  int getCurrentYearOfDays(){

        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        int days = 0;
        if((currentYear % 4 == 0 && currentYear % 100 != 0) || currentYear % 400 ==0 ){
          days = 366;//闰年
        }else{
          days = 365;//平年
        }
        return days;
    }

    /**
     * 获取开始和结束时间之间间隔的天数
     * @param startDate
     * @param endDate
     * @return
     */
    public static int getDaysOfStartAndEndDate(Date startDate,Date endDate){
        long mills = endDate.getTime()-startDate.getTime();

        int days = (int) (mills / (24 * 60 * 60 * 1000));

        return days;

    }
    public static void main(String[] args) {
        System.out.println(getCurrentYearOfDays());
    }

    /**
     * 获取时间戳
     * @return
     */
    public static String getTimeStamp() {
        return new SimpleDateFormat("yyyyMMdd").format(new Date());
    }
}
