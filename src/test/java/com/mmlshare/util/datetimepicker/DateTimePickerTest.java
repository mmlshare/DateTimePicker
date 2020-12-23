package com.mmlshare.util.datetimepicker;


import org.junit.Test;


public class DateTimePickerTest {
    @Test
    public void test(){
        for(DateTimePicker.StringPatten patten:DateTimePicker.StringPatten.values()){
            System.out.println(DateTimePicker.getStringCurrentTime(patten));
        }
        System.out.println("------------------------------");

        for(DateTimePicker.NumericPatten patten:DateTimePicker.NumericPatten.values()){
            System.out.println(DateTimePicker.getNumericCurrentTime(patten));
        }


    }
}
