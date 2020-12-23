package com.mmlshare.util.datetimepicker;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimePicker {
    public enum StringPatten{
        HHmm("HHmm"),
        HH_mm("HH:mm"),
        HHmmss("HHmmss"),
        HH_mm_ss("HH:mm:ss"),
        yyyyMMdd("yyyyMMdd"),
        yyyy_MM_dd("yyyy-MM-dd"),
        yyyyMMddHHmmss("yyyyMMddHHmmss"),
        yyyy_MM_dd_HH_mm_ss("yyyy-MM-dd HH:mm:ss"),
        yyyyMMddHHmmssSSS("yyyyMMddHHmmssSSS"),
        yyyy_MM_dd_HH_mm_ss_SSS("yyyy-MM-dd HH:mm:ss.SSS");
        String patten;
        StringPatten(String patten){
            this.patten = patten;
        }
    }

    public enum NumericPatten{
        HHmm("HHmm"),
        HHmmss("HHmmss"),
        yyyyMMdd("yyyyMMdd"),
        yyyyMMddHHmmss("yyyyMMddHHmmss"),
        yyyyMMddHHmmssSSS("yyyyMMddHHmmssSSS");
        String patten;
        NumericPatten(String patten){
            this.patten = patten;
        }
    }


    public static String getStringCurrentTime(){
        LocalDateTime localDateTime = LocalDateTime.now();
        return localDateTime.format(DateTimeFormatter.ofPattern(StringPatten.yyyyMMddHHmmss.patten));
    }

    public static String getStringCurrentTime(StringPatten patten){
        LocalDateTime localDateTime = LocalDateTime.now();
        return localDateTime.format(DateTimeFormatter.ofPattern(patten.patten));
    }


    public static long getNumericCurrentTime(){
        LocalDateTime localDateTime = LocalDateTime.now();
        return Long.parseLong(localDateTime.format(DateTimeFormatter.ofPattern(NumericPatten.yyyyMMddHHmmss.patten)));
    }
    public static long getNumericCurrentTime(NumericPatten patten){
        LocalDateTime localDateTime = LocalDateTime.now();
        return Long.parseLong(localDateTime.format(DateTimeFormatter.ofPattern(patten.patten)));
    }



}
