package com.pvt;

import java.util.HashMap;

public class HashMapMonth {
    HashMap<Integer, String> MapMonth;

    public HashMap<Integer, String> makeHashMapMonth() {
        MapMonth = new HashMap<>();
        MapMonth.put(1, "January");
        MapMonth.put(2, "February");
        MapMonth.put(3, "March");
        MapMonth.put(4, "April");
        MapMonth.put(5, "May");
        MapMonth.put(6, "June");
        MapMonth.put(7, "July");
        MapMonth.put(8, "August");
        MapMonth.put(9, "September");
        MapMonth.put(10, "October");
        MapMonth.put(11, "November");
        MapMonth.put(12, "December");
        return MapMonth;
    }
}
