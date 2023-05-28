package com.pvt;

import java.util.ArrayList;

public class TimeIntervalList extends Time_interval_create {
    public ArrayList<Time_Interval> timeIntervalList_s;

    public ArrayList<Time_Interval> makeTimeIntervalList() {
        timeIntervalList_s = new ArrayList<>();
        timeIntervalList_s.add(Aries_interval);
        timeIntervalList_s.add(Taurus_interval);
        timeIntervalList_s.add(Gemini_interval);
        timeIntervalList_s.add(Cancer_interval);
        timeIntervalList_s.add(Leo_interval);
        timeIntervalList_s.add(Virgo_interval);
        timeIntervalList_s.add(Libra_interval);
        timeIntervalList_s.add(Scorpio_interval);
        timeIntervalList_s.add(Sagittarius_interval);
        timeIntervalList_s.add(Capricorn_interval);
        timeIntervalList_s.add(Aquarius_interval);
        timeIntervalList_s.add(Pisces_interval);
        return this.timeIntervalList_s;
    }
}