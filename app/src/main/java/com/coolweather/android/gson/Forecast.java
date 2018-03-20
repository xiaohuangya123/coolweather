package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by mouse on 2018/3/20.
 */

public class Forecast {
    public String date;
    @SerializedName("tmp")
    public Temperature temperature;
    @SerializedName("cond")
    public More more;

    public class Temperature{
        public  String max;
        public String min;
    }

    public class More{
        @SerializedName("txt_d" )
        public String info;
    }
}
