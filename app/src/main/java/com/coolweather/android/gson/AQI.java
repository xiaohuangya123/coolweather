package com.coolweather.android.gson;

/**
 * Created by mouse on 2018/3/20.
 */

public class AQI {
    public AQICity city;

    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
