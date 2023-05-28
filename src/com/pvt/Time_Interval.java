package com.pvt;

import java.util.Calendar;

public class Time_Interval<first_date, last_date> {
    public Calendar first_date;
    public Calendar last_date;
    public String name;

    Time_Interval(String name, Calendar first_date, Calendar last_date) {
        this.first_date = first_date;
        this.last_date = last_date;
        this.name = name;
    }


}
